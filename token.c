//
// Created by malek on 2/19/22.
//

#include "token.h"
char *phraseStr[] = {
        //Single easy things
        "SEMICOLON",
        "LEFT_PAREN",
        "RIGHT_PAREN",
        "LEFT_BRACKET",
        "RIGHT_BRACKET",
        "LEFT_SQUARE_BRACKET",
        "RIGHT_SQUARE_BRACKET",
        "MINUS_OP",
        "ADD_OP",
        "DIV_OP",
        "MODULO_OP",
        "MULTI_OP",
        "CARET_OP",
        "COMMA",
        "DOT",

        //Don't have Multiply op cause it's shared with pointer", same thing with equals and ! operator. has multiple things.
        //Keywords
        //Var Types
        "INT_LIT",
        "DOUBLE_LIT",
        "CHAR_LIT",
        "ENUM_LIT",
        "STRUCT_LIT",
        "CLASS_LIT",
        "VOID_LIT",
        "RETURN",
        "PURE",
        "CONST",
        "PUBLIC",
        "PROTECTED",
        "PRIVATE",
        "NULL_LIT",


        //multisymbols
        "DOUBLE_EQUALS_LIT",
        "EQUALS_LIT",
        "NOT_EQUALS_LIT",
        "NOT_LIT",
        "DOUBLE_AND_OP",
        "AND_OP",
        "OR_OP",
        "DOUBLE_OR_OP",
        "DOUBLE_LEFT_ANGLE_BRACKET",
        "DOUBLE_RIGHT_ANGLE_BRACKET",
        "LEFT_ANGLE_BRACKET",
        "RIGHT_ANGLE_BRACKET",
        "TILDE_OP",

        //Variable Types
        "DOUBLE_TYPE_VAL",
        "CHAR_TYPE_VAL",
        "STRING_TYPE_VAL",
        "INT_TYPE_VAL",

        //Weird
        "IDENTIFIER",
        "WHITESPACE",
        "COMMENT",
};
void printToken(Token p){
    if(p == -1) {
        printf("INVALID\n");
        return;
    }
    if(p == -2) {
        printf("NEEDS MORE\n");
        return;
    }
    printf("%s\n", phraseStr[p]);
}