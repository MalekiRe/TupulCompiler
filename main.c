#include <stdio.h>
#include <string.h>
#include <malloc.h>
#include <stdbool.h>
#include <f2fs_fs.h>
#include "token.h"
#include "lexer.h"
#include "stringutil.h"
#include "phrase.h"
typedef enum state {
    SHIFT,
    REDUCE,
    ACCEPT,
    ERROR
} State;
static Phrase tempPhraseThingy(int pos) {
    switch (pos) {
        case 0: return int_type_val;
        case 1: return add_op;
        case 2: return int_type_val;
        case 3: return semicolon;
        default:return END_OF_FILE;
    }
}
//First thing at pos 0 is reserved for what it will turn into should the following two be true.


enum MatchPhraseReturnType {
    FALSE,
    TRUE,
    NEEDS_SHIFT
};

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
bool matchesPhrase(Phrase* stack, const Phrase* phrases, Phrase lookAheadToken) {
    size_t actualLength = phraseLen(phrases);
    Phrase* tempStack = stack;
    if(lookAheadToken != NULL_TERMINATOR) {
        printPhrases(stack);
        tempStack = phraseConcatWithoutRealloc(stack, lookAheadToken);
    }
    if(phraseLen(tempStack) < actualLength) {
        return false;
    }
    size_t stackLen = phraseLen(tempStack);
    for(int i = 0; i < actualLength; i++) {
        if(*(tempStack+stackLen-actualLength+i) != phrases[i]) {
            return false;
        }
    }
    return true;
}
Phrase getPhraseEquivOfToken(Token token) {
    switch (token) {
        case INT_TYPE_VAL: return int_type_val;
        case ADD_OP: return add_op;
        case MULTI_OP: return multi_op;
        case SEMICOLON: return semicolon;
        case NEEDS_MORE_BUFFER: return END_OF_FILE;
        default:
            printToken(token); ASSERT(false);
    }
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
    if(lookAheadToken == NULL_TERMINATOR) {
        goto afterPossibleShift;
    }
    /*
     * if stack + lookAheadPhrase matches currentThing {
                return shift;
            }
     */
    for(int i1 = 0; i1 < getPhraseComboList().size; i1++) {
        PhraseCombo phraseCombo = *getPhraseComboList().phraseCombo[i1];
        for(int i2 = 0; i2 < phraseCombo.size; i2++) {
            Phrase *phrases = phraseCombo.phrases[i2];
            if(matchesPhraseWithToken(*stack, phrases, lookAheadToken)) {
                return SHIFT;
            }
        }
    }
    afterPossibleShift :
    /*
     * if stack matches currentThing {
                doReduction() {
                    stack.pop(currentThing.length);
                    stack.push(currentThing.parent);
                }
                return reduce;
            }
     */
    for(int i1 = 0; i1 < getPhraseComboList().size; i1++) {
        PhraseCombo phraseCombo = *getPhraseComboList().phraseCombo[i1];
        for(int i2 = 0; i2 < phraseCombo.size; i2++) {
            Phrase *phrases = phraseCombo.phrases[i2];
            if(matchesPhraseWithoutToken(*stack, phrases)) {
                {//Do Reduce
                    printf("reducing : ");
                    printPhrases(*stack);
                    printf("\n");
                    popN(stack, phraseLen(phrases));
                    push(stack, phraseCombo.phraseToTurnInto);
                }
                return REDUCE;
            }
        }
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
    State currState = REDUCE;
    Phrase *stack = createPhraseArray(((Phrase[]){NULL_TERMINATOR}));
    Phrase lookAheadToken = getNextPhrase();
    Phrase prevLookAheadToken;
    while(currState != ACCEPT) {
        if(currState == ERROR) {
            ASSERT(false);
        }
        if(currState == SHIFT) {
            if(lookAheadToken == NULL_TERMINATOR) {
                printf("we are at the end of the file\n");
            } else {
                prevLookAheadToken = lookAheadToken;
                push(&stack, lookAheadToken);
                lookAheadToken = getNextPhrase();
                if (prevLookAheadToken == END_OF_FILE && lookAheadToken == END_OF_FILE) {
                    printf("now were at end of file do some weird stuff\n");
                    lookAheadToken = NULL_TERMINATOR;
                }
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
    addAllThingsToPhraseComboList();
    Phrase *tempStack = createPhraseArray(((Phrase[]){NULL_TERMINATOR}));
    push(&tempStack, int_type_val);
    push(&tempStack, semicolon);
    //We will check our current stack against just the right hand first, and then again against the peek ahead.
    doParsing();

//    while(state != ACCEPT) {
//        if(*(stack) == FINISHED_COMP) {
//            state = ACCEPT;
//        }
//        terminalLoop--;
//        if(terminalLoop == 0) {
//            break;
//        }
//        if(state == SHIFT) {
//            stack = phraseConcat(stack, lookAheadPhrase);
//            lookAheadPhrase = getNextPhrase();
//            printPhrase(lookAheadPhrase);
//            printf("\n");
//            if(lookAheadPhrase == END_OF_FILE) {
//                lookAheadPhrase = NULL_TERMINATOR;
//            }
//            state = REDUCE;
//        }
//        if(state == REDUCE) {
//
//            state = shiftFunc(stack, lookAheadPhrase);
//
//        }
//        if(state == ERROR) {
//            ASSERT(false);
//        }
//    }
//    char* tempStr = strdup("hi");
//    tempStr = strCharAppend(tempStr, 'h');
//    printf("%s\n", tempStr);
//    tempStr = strCharAppend(tempStr, 'e');
//    printf("%s\n", tempStr);
//    while(state != ACCEPT) {
//        i++;
//        if(i > 20) {
//            break;
//        }
//        if(strcmp(stack, &acceptStr) == 0) {
//            state = ACCEPT;
//        }
//        if(state == SHIFT) {
//            lookAheadToken = (char) tempPhraseThingy(pos);
//            printf("look ahead token: ");
//            printPhrase(lookAheadToken);
//            printf("\n");
//            stack = strCharAppend(stack, lookAheadToken);
//            if(lookAheadToken == END_OF_FILE) {
//                lookAheadToken = -1;
//            }
//            pos++;
//            state = SHIFT;
//            printf("printing stack : \n");
//            printStack(stack);
//        }
//        if(state == REDUCE) {
//            for(int i1 = 0; i1 < sizeof(rightHandReductions); i1++) {
//                if(state == SHIFT) {
//                    break;
//                }
//                bool matches = false;
//                for(int i2 = 0; i2 < 2; i2++) {
//                    if(matchesPhrase(stack, rightHandReductions[i1][i2]+1, lookAheadToken)) {
//                        if(matches == false) {
//                            matches = true;
//                        }
//                        else {
//                            state = SHIFT;
//                            break;//this means we have more than one match
//                        }
//                    }
//                }
//            }
//            state = SHIFT;
//            printf("printing stack in reduce :\n");
//            printStack(stack);
//
//        }
//
//    }
    return 0;
}
