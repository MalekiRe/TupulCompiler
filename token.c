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
        //Don't have Multiply op cause it's shared with pointer, same thing with equals and ! operator. has multiple things.
        //Keywords
        "INT_LIT",
        "RETURN_LIT",
        "DOUBLE_EQUALS_LIT",
        "EQUALS_LIT",
        "NOT_EQUALS_LIT",
        "NOT_LIT",
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