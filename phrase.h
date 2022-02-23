//
// Created by malek on 2/20/22.
//

#ifndef MLANG_PHRASE_H
#define MLANG_PHRASE_H

#include <stddef.h>
#include "token.h"

#define createPhraseArray(a) createPhrase((a), (sizeof (a)/sizeof *(a)))
typedef enum phrase {
    semicolon,
    equals,
    left_paren,
    right_paren,
    left_bracket,
    right_bracket,
    left_square_bracket,
    right_square_bracket,
    minus_op,
    add_op,
    div_op,
    multi_op,
    modulo_op,
    caret_op,
    comma,
    dot,
    //Keywords
        //Var Types
        int_lit,
        double_lit,
        char_lit,
        enum_lit,
        struct_lit,
        class_lit,
        void_lit,
    return_lit,
    pure_lit,
    const_lit,
    public_lit,
    protected_lit,
    private_lit,
    null_lit,

    //multisymbols,
    double_equals,
    not_equals_lit,
    not_lit,
    double_and_op,
    and_op,
    or_op,
    double_or_op,
    double_left_angle_bracket,
    double_right_angle_bracket,
    left_angle_bracket,
    right_angle_bracket,
    tilde_op,

    //Variable Types
    double_type_val,
    char_type_val,
    string_type_val,
    int_type_val,

    //Weird
    identifier,


    //Non Terminals


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
Phrase getPhraseEquivOfToken(Token token);
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
