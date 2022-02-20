//
// Created by malek on 2/19/22.
//

#ifndef MLANG_TOKEN_H
#define MLANG_TOKEN_H


#include <stdio.h>

typedef enum token{
    //Single easy things
    SEMICOLON,
    LEFT_PAREN,
    RIGHT_PAREN,
    LEFT_BRACKET,
    RIGHT_BRACKET,
    LEFT_SQUARE_BRACKET,
    RIGHT_SQUARE_BRACKET,
    MINUS_OP,
    ADD_OP,
    DIV_OP,
    MODULO_OP,
    //Don't have Multiply op cause it's shared with pointer, same thing with equals and ! operator. has multiple things.
    //Keywords
    INT_LIT,
    RETURN_LIT,
    DOUBLE_EQUALS_LIT,
    EQUALS_LIT,
    NOT_EQUALS_LIT,
    NOT_LIT,
    IDENTIFIER,
    WHITESPACE,
    COMMENT,
    //INVALID -1
    INVALID = -1,
    NEEDS_MORE_BUFFER = -2,


} Token;
void printToken(Token p);
#endif //MLANG_TOKEN_H
