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
    MULTI_OP,
    CARET_OP,
    COMMA,
    DOT,

    //Don't have Multiply op cause it's shared with pointer, same thing with equals and ! operator. has multiple things.
    //Keywords
        //Var Types
        INT_LIT,
        DOUBLE_LIT,
        CHAR_LIT,
        ENUM_LIT,
        STRUCT_LIT,
        CLASS_LIT,
        VOID_LIT,
    RETURN,
    PURE,
    CONST,
    PUBLIC,
    PROTECTED,
    PRIVATE,
    NULL_LIT,


    //multisymbols
    DOUBLE_EQUALS_LIT,
    EQUALS_LIT,
    NOT_EQUALS_LIT,
    NOT_LIT,
    DOUBLE_AND_OP,
    AND_OP,
    OR_OP,
    DOUBLE_OR_OP,
    DOUBLE_LEFT_ANGLE_BRACKET,
    DOUBLE_RIGHT_ANGLE_BRACKET,
    LEFT_ANGLE_BRACKET,
    RIGHT_ANGLE_BRACKET,
    TILDE_OP, //this one actually isn't a multisymbol, just don't wanna move it cause pain //TODO::move this to the normal single symbol area.

    //Variable Types
    DOUBLE_TYPE_VAL,
    CHAR_TYPE_VAL,
    STRING_TYPE_VAL,
    INT_TYPE_VAL,

    //Weird
    IDENTIFIER,
    WHITESPACE,
    COMMENT,
    //INVALID -1
    INVALID = -1,
    NEEDS_MORE_BUFFER = -2,


} Token;
void printToken(Token p);
#endif //MLANG_TOKEN_H
