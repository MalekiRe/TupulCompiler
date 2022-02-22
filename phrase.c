//
// Created by malek on 2/20/22.
//
#include <malloc.h>
#include <stdbool.h>
#include <f2fs_fs.h>
#include "phrase.h"
size_t phraseLen(const Phrase *phraseArr) {
    int i = 0;
    while(*(phraseArr+i) != NULL_TERMINATOR) { i++;}
    return i;
}

Phrase *phraseDup(Phrase *phraseArr) {
    Phrase *returnPhrase = malloc(phraseLen(phraseArr)+1);
    for(int i = 0; i < phraseLen(phraseArr)+1; i++) {
        *(returnPhrase+i) = *(phraseArr+i);
    }
    return returnPhrase;
}

Phrase *phraseConcat(Phrase *phraseArr, Phrase phrase1) {
    size_t phraseLength = phraseLen(phraseArr);
    phraseArr = realloc(phraseArr,phraseLength+2);
    *(phraseArr+phraseLength) = phrase1;
    *(phraseArr+phraseLength+1) = NULL_TERMINATOR;
    return phraseArr;
}

Phrase *phraseConcatWithoutRealloc(Phrase *phraseArr, Phrase phrase1) {
    Phrase* returnPhrase = malloc(phraseLen(phraseArr)+2);
    size_t phraseLength = phraseLen(phraseArr);
    for(int i = 0; i < phraseLength; i++) {
        *(returnPhrase+i) = *(phraseArr+i);
    }
    *(returnPhrase+phraseLength) = phrase1;
    *(returnPhrase+phraseLength+1) = NULL_TERMINATOR;
    return phraseConcat(returnPhrase, phrase1);
}
char* getStrRep(Phrase phrase) {
    switch (phrase) {
        case int_type_val:
            return ("int_type_val"); break;
        case add_op:
            return("add_op"); break;
        case multi_op:
            return("multi_op"); break;
        case semicolon:
            return "semicolon";
        case VALUE:
            return("VALUE");break;
        case PRODUCT:
            return("PRODUCT");break;
        case PRODUCT_MULTI:
            return("PRODUCT_MULTI");break;
        case SUM:
            return("SUM"); break;
        case SUM_ADD:
            return("SUM_ADD"); break;
        case FINAL_VALUE:
            return("FINAL_VALUE");break;
        case END_OF_FILE:
            return("END_OF_FILE");break;
        case NULL_TERMINATOR:
            return("NULL_TERMINATOR"); break;
        case FINISHED_COMP:
            return("FINISHED_COMP"); break;
        default: ASSERT(false);
    }
}

void printPhrase(Phrase phrase) {
    printf("%s", getStrRep(phrase));
}
void printPhrases(Phrase* phrase) {
    for(int i = 0; i < phraseLen(phrase); i++) {
        printPhrase(*(phrase+i));
        if(i < phraseLen(phrase)-1) {
            printf(",");
        }
    }
    printf("\n");
}

PhraseCombo* createPhraseCombo(Phrase phraseToTurnInto) {
    PhraseCombo* phraseCombo = malloc(sizeof(PhraseCombo));
    phraseCombo->size = 0;
    phraseCombo->phrases = malloc(sizeof(Phrase**));
    phraseCombo->phraseToTurnInto = phraseToTurnInto;
    return phraseCombo;
}
PhraseCombo *addPhraseList(PhraseCombo* phraseCombo, Phrase* phraseList) {
    phraseCombo->phrases = realloc(phraseCombo->phrases, (phraseCombo->size + 1) * sizeof(Phrase**));
    phraseCombo->phrases[phraseCombo->size] = phraseDup(phraseList);
    phraseCombo->size++;
    return phraseCombo;
}
//This is for non null terminated phrases/phrase arrays
Phrase* createPhrase(const Phrase* phrase, int numElem) {
    Phrase* returnPhrase = malloc((numElem+1)*sizeof(Phrase));
    for(int i = 0; i < numElem; i++) {
        returnPhrase[i] = phrase[i];
    }
    returnPhrase[numElem] = NULL_TERMINATOR;
    return returnPhrase;
}

Phrase *pop(Phrase** phraseArray) {
    (*phraseArray)[phraseLen(*phraseArray)-1] = NULL_TERMINATOR;
}
//TODO::make this more efficent
Phrase *popN(Phrase** phraseArray, size_t amount) {
    for(int i = 0; i < amount; i++) {
        pop(phraseArray);
    }
}
Phrase *push(Phrase** phraseArray, Phrase phrase) {
    *phraseArray = phraseConcat(*phraseArray, phrase);
    return *phraseArray;
}

struct phrasecomboList phraseComboList;
PhraseComboList getPhraseComboList() {
    return phraseComboList;
}
void addToPhraseComboList(PhraseCombo *phraseCombo) {
    phraseComboList.phraseCombo = realloc(phraseComboList.phraseCombo, (phraseComboList.size+1) * sizeof(PhraseCombo*));
    phraseComboList.phraseCombo[phraseComboList.size] = phraseCombo;
    phraseComboList.size++;
}
void addAllThingsToPhraseComboList() {
    addToPhraseComboList(addPhraseList(createPhraseCombo(FINISHED_COMP),
                                       createPhraseArray(((Phrase[]){FINAL_VALUE, semicolon}))));
    addToPhraseComboList(addPhraseList(createPhraseCombo(FINAL_VALUE),
                                       createPhraseArray((Phrase[]){SUM})));
    addToPhraseComboList(addPhraseList(createPhraseCombo(VALUE),
                                       createPhraseArray((Phrase[]){int_type_val})));

    addToPhraseComboList(addPhraseList(createPhraseCombo(PRODUCT_MULTI),
                                       createPhraseArray(((Phrase[]){PRODUCT, multi_op}))));
    //Product
    PhraseCombo *combo = addPhraseList(createPhraseCombo(PRODUCT),
                                       createPhraseArray(((Phrase[]){PRODUCT_MULTI, PRODUCT})));
    combo = addPhraseList(combo, createPhraseArray(((Phrase[]){VALUE})));
    addToPhraseComboList(combo);

    addToPhraseComboList(addPhraseList(createPhraseCombo(SUM_ADD),
                                       createPhraseArray(((Phrase[]){SUM, add_op}))));

    combo = addPhraseList(createPhraseCombo(SUM),
                          createPhraseArray(((Phrase[]){SUM_ADD, SUM})));
    combo = addPhraseList(combo,
                          createPhraseArray((Phrase[]){PRODUCT}));
    addToPhraseComboList(combo);
    printf("combo 1 is : ");
    printPhrases(combo->phrases[0]);
    printf("\ncombo2 is : ");
    printPhrases(combo->phrases[1]);
    printf("\n");
    for(int i = 0; i < getPhraseComboList().size; i++) {
        for(int i2 = 0; i2 < getPhraseComboList().phraseCombo[i]->size; i2++) {
            printf("phrase to turn into is : %s\n", getStrRep(getPhraseComboList().phraseCombo[i]->phraseToTurnInto));
        }
    }


}



