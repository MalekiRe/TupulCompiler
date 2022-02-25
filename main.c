#include <stdio.h>
#include <stdbool.h>
#include <f2fs_fs.h>
#include "token.h"
#include "lexer.h"
#include "phrase.h"
#include "nodetree.h"

NodeList *nodeList;
typedef enum state {
    SHIFT,
    REDUCE,
    ACCEPT,
    ERROR
} State;
bool matchesPhraseWithoutToken(Phrase* stack, const Phrase* phrases) {
    size_t actualLength = phraseLen(phrases);
    //Note, if the stack was too small it would already have said to shift in the other matches phrase function
    size_t stackLength = phraseLen(stack);
    if(stackLength < actualLength) {
        return false;
    }
    for(int i = 0; i < actualLength; i++) {
        if(stack[stackLength-actualLength+i] != phrases[i]) {
            return false;
        }
    }
    return true;
}
bool matchesPhraseWithToken(Phrase* stack, const Phrase* phrases, Phrase lookAheadToken) {
    size_t actualLength = phraseLen(phrases);
    size_t stackLength = phraseLen(stack);
    if(stackLength+1 < actualLength) {
        return false;
    }
    //Check if stack matches everything but the last bit
    for(int i = 0; i < actualLength-1; i++) {
        if(stack[i+stackLength-(actualLength-1)] != phrases[i]) {
            return false;
        }
    }

    //Check if end of the phrase matches the token
    if(phrases[actualLength-1] != lookAheadToken) {
        return false;
    }
    return true;
}
char fileBuff[255];
Token token = -2;
FILE *file = NULL;
Phrase getNextPhrase() {
    if(file == NULL) {
        file = fopen("../myprogram.m", "r");
        fgets(fileBuff, 255, file);
        token = strToToken(fileBuff);
        return getPhraseEquivOfToken(token);
    }
    topOfFun:
    if(token != -2) {
        token = strToToken(NULL);
        if(token == COMMENT || token == WHITESPACE) {
            goto topOfFun;
        }
        return getPhraseEquivOfToken(token);
    }
    if(fgets(fileBuff, 255, file) == NULL) {
        return END_OF_FILE;
    }
    goto topOfFun;
}
State reduceStateFunction(Phrase **stack, Phrase lookAheadToken) {

    //Now account for special case where if lookAheadToken == NULL_TERMINATOR
    if (lookAheadToken != NULL_TERMINATOR) {

        /*
         * if stack + lookAheadPhrase matches currentThing {
                    return shift;
                }
         */
        for (int i1 = 0; i1 < getPhraseComboList().size; i1++) {
            PhraseCombo phraseCombo = *getPhraseComboList().phraseCombo[i1];
            for (int i2 = 0; i2 < phraseCombo.size; i2++) {
                Phrase *phrases = phraseCombo.phrases[i2];
                if (matchesPhraseWithToken(*stack, phrases, lookAheadToken)){
                    printf("%s matched phrase with token\n", getStrRep(lookAheadToken));
                    printf("the phrase that matched was : ");
                    printPhrases(phrases);
                    printf("\n");
                    if(phraseLen(phrases) > 1) {
                        return SHIFT;
                    }
                }
            }
        }
    }
    /*
     * if stack matches currentThing {
                make the reduction happen on the longest thing that matches.
                doReduction() {
                    stack.pop(currentThing.length);
                    stack.push(currentThing.parent);
                }
                return reduce;
            }
     */
    Phrase *longestMatchingPhrases = NULL;
    Phrase phraseToTurnInto;
    for(int i1 = 0; i1 < getPhraseComboList().size; i1++) {
        PhraseCombo phraseCombo = *getPhraseComboList().phraseCombo[i1];

        for(int i2 = 0; i2 < phraseCombo.size; i2++) {
            Phrase *phrases = phraseCombo.phrases[i2];
            printf("trying : %s\n", getStrRep(phraseCombo.phraseToTurnInto));
            if(matchesPhraseWithoutToken(*stack, phrases)) {
                printf("this matches: %s\n", getStrRep(phraseCombo.phraseToTurnInto));
                if(longestMatchingPhrases == NULL) {
                    longestMatchingPhrases = phrases;
                    phraseToTurnInto = phraseCombo.phraseToTurnInto;
                }
                else {
                    if(phraseLen(phrases) > phraseLen(longestMatchingPhrases)) {
                        longestMatchingPhrases = phrases;
                        phraseToTurnInto = phraseCombo.phraseToTurnInto;
                    }
                }
            }
        }
    }
    if(longestMatchingPhrases != NULL) {
        {//Do Reduce
            printf("reducing : ");
            printPhrases(*stack);
            printf("\n");
            printf(" by : " );
            printPhrases(longestMatchingPhrases);
            printf("\n");

            //Doing it for the Node nodeList
            Node* tempNode = createNode(phraseToTurnInto);
            nodeList = replaceNodesWithNode(nodeList, phraseLen(longestMatchingPhrases), tempNode);
            //Doing it for the stack now

            popN(stack, phraseLen(longestMatchingPhrases));
            push(stack, phraseToTurnInto);
            printf("after reduction : ");
            printPhrases(*stack);
            printf("\n");
        }
        return REDUCE;
    }
    /*
     * for(currentThing : allThings) {
            if(currentThing.length < stack+lookAheadPhrase) {
                return shift;
            }
        }
     */
    if(lookAheadToken == NULL_TERMINATOR) {
        return ERROR;
    }
    for(int i1 = 0; i1 < getPhraseComboList().size; i1++) {
        PhraseCombo phraseCombo = *getPhraseComboList().phraseCombo[i1];
        for(int i2 = 0; i2 < phraseCombo.size; i2++) {
            Phrase *phrases = phraseCombo.phrases[i2];
            if(phraseLen(phrases) < phraseLen(*stack)+1) {
                return SHIFT;
            }
        }
    }
    return ERROR;
}
void doParsing() {
    State currState = SHIFT;
    Phrase *stack = createPhraseArray(((Phrase[]){NULL_TERMINATOR}));
    Phrase lookAheadToken = getNextPhrase();
    while(currState != ACCEPT) {
        if(currState == ERROR) {
            ASSERT(false);
        }
        if(currState == SHIFT) {
            printf("shifting %s onto the stack \n", getStrRep(lookAheadToken));
            if(lookAheadToken == END_OF_FILE) {
                printf("we are at the end of the file\n");
                lookAheadToken = NULL_TERMINATOR;
                printPhrases(stack);
                printf("\n");
            } else {
                addItemToNodeList(nodeList, createNode(lookAheadToken));
                push(&stack, lookAheadToken);
                lookAheadToken = getNextPhrase();
            }
            currState = REDUCE;
        }
        if(currState == REDUCE) {
            currState = reduceStateFunction(&stack, lookAheadToken);
        }
        if(*stack == FINISHED_COMP) {
            currState = ACCEPT;
        }
    }
    /*
     So, if we have a stack, a lookAheadPhrase and our current thing we are checking against.
     while(not accepting currState){
        if(error) throw error
        if(shift) {
            shift onto stack
            currState = reduce;
        }
        if(reduce) {
            currState = reduceStateFunction()
        }
     }
     reduceStateFunction() {
        for(currentThing : allThings) {
            if stack + lookAheadPhrase matches currentThing {
                return shift;
            }
        }
        for(currentThing : allThings) {
            if stack matches currentThing {
                doReduction() {
                    stack.pop(currentThing.length);
                    stack.push(currentThing.parent);
                }
                return reduce;
            }
        }
        for(currentThing : allThings) {
            if(currentThing.length < stack+lookAheadPhrase) {
                return shift;
            }
        }
        return error;

     }
     */
}
int main() {
    nodeList = createNodeList();
    addAllThingsToPhraseComboList();
    doParsing();
    printNodeTree(nodeList->listStart[0], 0);
//    Node* node = createNode(semicolon);
//    Node* nodeTemp = createNode(VALUE);
//    Node* node2 = createNode(int_type_val);
//    addItemToNodeList(node->childNodes, node2);
//    addItemToNodeList(node->childNodes, createNode(equals));
//    addItemToNodeList(node->childNodes, createNode(left_paren));
//    addItemToNodeList(node->childNodes, createNode(right_paren));
//    addItemToNodeList(node->childNodes, createNode(minus_op));
//    replaceNodesWithNode(node->childNodes, 3, nodeTemp);
//    for(int i = 0; i < node->childNodes->size; i++) {
//        printf("%s\n", getStrRep(node->childNodes->listStart[i]->phrase));
//    }
//    for(int i = 0; i < nodeTemp->childNodes->size; i++) {
//        printf("%s\n", getStrRep(nodeTemp->childNodes->listStart[i]->phrase));
//    }
//    printf("%s", getStrRep(node->phrase));
//    printf("%s", getStrRep(node->childNodes->listStart[0]->phrase));
    return 0;
}
