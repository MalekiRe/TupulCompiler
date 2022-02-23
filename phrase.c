//
// Created by malek on 2/20/22.
//
#include <malloc.h>
#include <stdbool.h>
#include <f2fs_fs.h>
#include "phrase.h"
#include "token.h"

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
        case equals: return "equals";
        case left_paren: return "left_paren";
        case right_paren: return "right_paren";
        case left_bracket: return "left_bracket";
        case right_bracket: return "right_bracket";
        case left_square_bracket: return "left_square_bracket";
        case right_square_bracket: return "right_square_bracket";
        case left_angle_bracket: return "left_angle_bracket";
        case right_angle_bracket: return "right_angle_bracket";
        case minus_op: return "minus_op";
        case div_op: return "div_op";
        case modulo_op: return "modulo_op";
        case caret_op: return "caret_op";
        case comma: return "comma";
        case dot: return "dot";
        case int_lit: return "int_lit";
        case double_lit: return "double_lit";
        case char_lit: return "char_lit";
        case enum_lit: return "enum_lit";
        case struct_lit: return "struct_lit";
        case class_lit: return "class_lit";
        case void_lit: return "void_lit";
        case return_lit: return "return_lit";
        case pure_lit: return "pure_lit";
        case const_lit: return "const_lit";
        case public_lit: return "public_lit";
        case protected_lit: return "protected_lit";
        case private_lit: return "private_lit";
        case null_lit: return "null_lit";
        case double_equals: return "double_equals";
        case not_equals_lit: return "not_equals_lit";
        case not_lit: return "not_lit";
        case double_and_op: return "double_and_op";
        case and_op: return "and_op";
        case or_op: return "or_op";
        case double_or_op: return "double_or_op";
        case double_left_angle_bracket: return "double_left_angle_bracket";
        case double_right_angle_bracket: return "double_right_angle_bracket";
        case tilde_op: return "tilde_op";
        case double_type_val: return "double_type_val";
        case char_type_val: return "char_type_val";
        case string_type_val: return "string_type_val";
        case identifier: return "identifier";
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
        default: printf("%d\n", phrase); ASSERT(false);
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
Phrase getPhraseEquivOfToken(Token token) {
    switch (token) {
        case SEMICOLON: return semicolon;
        case LEFT_PAREN: return left_paren;
        case RIGHT_PAREN: return right_paren;
        case LEFT_BRACKET: return left_bracket;
        case RIGHT_BRACKET: return right_bracket;
        case LEFT_SQUARE_BRACKET: return left_square_bracket;
        case RIGHT_SQUARE_BRACKET: return right_square_bracket;
        case MINUS_OP: return minus_op;
        case ADD_OP: return add_op;
        case DIV_OP: return div_op;
        case MODULO_OP: return modulo_op;
        case MULTI_OP: return multi_op;
        case CARET_OP: return caret_op;
        case COMMA: return comma;
        case DOT: return dot;
        case INT_LIT: return int_lit;
        case DOUBLE_LIT: return double_lit;
        case CHAR_LIT: return char_lit;
        case ENUM_LIT: return enum_lit;
        case STRUCT_LIT: return struct_lit;
        case CLASS_LIT: return class_lit;
        case VOID_LIT: return void_lit;
        case RETURN: return return_lit;
        case PURE: return pure_lit;
        case CONST: return const_lit;
        case PUBLIC: return public_lit;
        case PROTECTED: return protected_lit;
        case PRIVATE: return private_lit;
        case NULL_LIT: return null_lit;
        case DOUBLE_EQUALS_LIT: return double_equals;
        case EQUALS_LIT: return equals;
        case NOT_LIT: return not_lit;
        case DOUBLE_AND_OP: return double_and_op;
        case DOUBLE_OR_OP: return double_or_op;
        case AND_OP: return and_op;
        case OR_OP: return or_op;
        case DOUBLE_LEFT_ANGLE_BRACKET: return double_left_angle_bracket;
        case DOUBLE_RIGHT_ANGLE_BRACKET: return double_right_angle_bracket;
        case LEFT_ANGLE_BRACKET: return left_angle_bracket;
        case RIGHT_ANGLE_BRACKET: return right_angle_bracket;
        case TILDE_OP: return tilde_op;
        case DOUBLE_TYPE_VAL: return double_type_val;
        case CHAR_TYPE_VAL: return char_type_val;
        case STRING_TYPE_VAL: return string_type_val;
        case INT_TYPE_VAL: return int_type_val;
        case IDENTIFIER: return identifier;





        case NEEDS_MORE_BUFFER: return END_OF_FILE;
        default:
            printToken(token); ASSERT(false);
    }
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

//    for(int i = 0; i < getPhraseComboList().size; i++) {
//        for(int i2 = 0; i2 < getPhraseComboList().phraseCombo[i]->size; i2++) {
//            printf("phrase to turn into is : %s\n", getStrRep(getPhraseComboList().phraseCombo[i]->phraseToTurnInto));
//        }
//    }


}



