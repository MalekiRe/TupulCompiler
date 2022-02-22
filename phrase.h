//
// Created by malek on 2/20/22.
//

#ifndef MLANG_PHRASE_H
#define MLANG_PHRASE_H

#include <stddef.h>
#define createPhraseArray(a) createPhrase((a), (sizeof (a)/sizeof *(a)))
typedef enum phrase {
    int_type_val,
    add_op,
    multi_op,
    semicolon,
    FINISHED_COMP, //::= FINAL_VALUE semicolon
    FINAL_VALUE, //::= SUM
    VALUE, //::= int_type_val
    PRODUCT_MULTI, //::= PRODUCT multi_op
    PRODUCT, //::= PRODUCT_MULTI PRODUCT | VALUE
    SUM_ADD, //::= SUM add_op
    SUM, //::= SUM_ADD SUM | PRODUCT
    END_OF_FILE,
    NULL_TERMINATOR //Null terminator used for arrays to calculate length
} Phrase;

typedef struct phraseCombo {
    Phrase phraseToTurnInto;
    Phrase** phrases;
    size_t size;
} PhraseCombo;

typedef struct phrasecomboList {
    PhraseCombo **phraseCombo;
    size_t size;
} PhraseComboList;
size_t phraseLen(const Phrase *phraseArr);
Phrase *phraseDup(Phrase *phraseArr);
Phrase *phraseConcat(Phrase *phraseArr, Phrase phrase1);
Phrase *phraseConcatWithoutRealloc(Phrase *phraseArr, Phrase phrase1);
char* getStrRep(Phrase phrase);
Phrase *pop(Phrase** phraseArray);
Phrase *popN(Phrase** phraseArray, size_t amount);
Phrase *push(Phrase** phraseArray, Phrase phrase);
void printPhrases(Phrase* phrase);
void printPhrase(Phrase phrase);
Phrase* createPhrase(const Phrase* phrase, int numElem);
PhraseCombo *createPhraseCombo(Phrase phraseToTurnInto);
PhraseCombo *addPhraseList(PhraseCombo* phraseCombo, Phrase* phraseList);
void addAllThingsToPhraseComboList();
PhraseComboList getPhraseComboList();
#endif //MLANG_PHRASE_H
