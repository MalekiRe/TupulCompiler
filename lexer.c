//
// Created by malek on 2/19/22.
//

#include <stdbool.h>
#include <malloc.h>
#include <string.h>
#include <ctype.h>
#include <f2fs_fs.h>
#include "token.h"
#include "stringutil.h"
char* buffer = NULL;
char* originalBuff;
bool firstTime = true;
Token simpleFirst() {
    switch (*(buffer)) {
        case ';': return SEMICOLON;
        case '(': return LEFT_PAREN;
        case ')': return RIGHT_PAREN;
        case '{': return LEFT_BRACKET;
        case '}': return RIGHT_BRACKET;
        case '[': return LEFT_SQUARE_BRACKET;
        case ']': return RIGHT_SQUARE_BRACKET;
        case '-': return MINUS_OP;
        case '+': return ADD_OP;
        case '/': return DIV_OP;
        case '%': return MODULO_OP;
        case '*': return MULTI_OP;
        case '^': return CARET_OP;
        case ',': return COMMA;
        case '.': return DOT;
        case '~': return TILDE_OP;
        default: return -1;
    }
}
Token multiCharOperatorPhrase() {
    if(strlen(buffer) == 1) {
        return -2;
    }
    if(*(buffer) == '=') {
        if(*(buffer+1) == '=') {
            return DOUBLE_EQUALS_LIT;
        }
        return EQUALS_LIT;
    }
    if(*buffer == '!') {
        if(*(buffer+1) == '=') {
            return NOT_EQUALS_LIT;
        }
        return NOT_LIT;
    }
    if(*(buffer) == '&') {
        if(*(buffer+1) == '&') {
            return DOUBLE_AND_OP;
        }
        return AND_OP;
    }
    if(*(buffer) == '|') {
        if(*(buffer+1) == '|') {
            return DOUBLE_OR_OP;
        }
        return OR_OP;
    }
    if(*(buffer) == '<') {
        if(*(buffer+1) == '<') {
            return DOUBLE_LEFT_ANGLE_BRACKET;
        }
        return LEFT_ANGLE_BRACKET;
    }
    if(*(buffer) == '>') {
        if(*(buffer+1) == '>') {
            return DOUBLE_RIGHT_ANGLE_BRACKET;
        }
        return RIGHT_ANGLE_BRACKET;
    }
    return -1;
}
static bool wordPhraseWorks(char *str1, int x) {
    if(strncmp(str1, buffer, x) == 0 && strlen(str1) == x) {
        return true;
    }
    return false;
}
Token wordPhrase() {
    if(isalpha(*buffer)) {
        int x = 0;
        while(isalnum(*(buffer+x)))  {
            x++;
        }
        if(strlen((buffer+x)) == 0) {
            return -2;
        }
        Token workingWordPhrase = IDENTIFIER;
        if(wordPhraseWorks("int", x)) {
            workingWordPhrase = INT_LIT;
        }
        else if(wordPhraseWorks("double", x)) {
            workingWordPhrase = DOUBLE_LIT;
        }
        else if(wordPhraseWorks("char", x)) {
            workingWordPhrase = CHAR_LIT;
        }
        else if(wordPhraseWorks("enum", x)) {
            workingWordPhrase = ENUM_LIT;
        }
        else if(wordPhraseWorks("struct", x)) {
            workingWordPhrase = STRUCT_LIT;
        }
        else if(wordPhraseWorks("class", x)) {
            workingWordPhrase = CLASS_LIT;
        }
        else if(wordPhraseWorks("void", x)) {
            workingWordPhrase = VOID_LIT;
        }
        else if(wordPhraseWorks("return", x)) {
            workingWordPhrase = RETURN;
        }
        else if(wordPhraseWorks("pure", x)) {
            workingWordPhrase = PURE;
        }
        else if(wordPhraseWorks("const", x)) {
            workingWordPhrase = CONST;
        }
        else if(wordPhraseWorks("public", x)) {
            workingWordPhrase = PUBLIC;
        }
        else if(wordPhraseWorks("protected", x)) {
            workingWordPhrase = PROTECTED;
        }
        else if(wordPhraseWorks("private", x)) {
            workingWordPhrase = PRIVATE;
        }
        else if(wordPhraseWorks("null", x)) {
            workingWordPhrase = NULL_LIT;
        }
        buffer += x;
        return workingWordPhrase;
    }
    return -1;
}
Token whitespacePhrase() {
    if(isspace(*(buffer))) {
        int i = 0;
        while(isspace(*(buffer+i))) {
            i++;
        }
        if(strlen((buffer+i)) == 0) {
            return -2;
        }
        buffer+=i;
        return WHITESPACE;
    }
    return -1;
}
Token commentPhrase() {
    enum Commenttype {
        SINGLE_LINE,
        MULTILINE,
    };
    enum Commenttype commentType;
    if(*(buffer) == '/') {
        if(strlen((buffer+1)) == 0) {
            ASSERT(false);
        }
        if(*(buffer+1) == '/') {
            commentType = SINGLE_LINE;
        }
        else if(*(buffer+1) == '*') {
            commentType = MULTILINE;
        }
        else {
            ASSERT(false);
        }
    } else {
        return -1;
    }
    if(commentType == SINGLE_LINE) {
        int i = 0;
        while(*(buffer+i) != '\n' && *(buffer+i) != '\r') {
            i++;
            if(strlen((buffer+i)) == 0) {
                return -2;
            }
        }
        buffer += i;
        return COMMENT;
    }
    else if(commentType == MULTILINE) {
        int i = 2;
        while(*(buffer+i) != '*' && *(buffer+i+1) != '/') {
            i++;
            if(strlen(buffer+i) == 0 || strlen(buffer+i+1) == 0) {
                return -2;
            }
        }
        buffer += i+2;
        return COMMENT;
    }
}
Token variablePhrase() {
    if(*(buffer) == '"') { //Could be a string.
        int i = 1;
        restartLoop :
        while(*(buffer+i) != '"') {
            if(strlen(buffer+i) == 0) {
                return -2;
            }
            i++;
        }
        if(*(buffer+i-1) == '\\') {
            i++;
            goto restartLoop;
        }
        buffer += i+1;
        return STRING_TYPE_VAL;
    }
    if(*(buffer) == '\'') {
        if(strlen(buffer+1) == 0 || strlen(buffer+2) == 0 || strlen(buffer+3) == 0) {
            printf("too short\n");
            return -2;
        }
        if(*(buffer+1) == '\\') {
            if(*(buffer+3) == '\'') {
                buffer += 4;
                return CHAR_TYPE_VAL;
            }
            ASSERT(false);
        } else {
            if(*(buffer+2) == '\'') {
                buffer += 3;
                return CHAR_TYPE_VAL;
            }
            ASSERT(false);
        }
    }
    if(isdigit(*(buffer))) {
        int i = 0;
        while(isdigit(*(buffer+i))) {
            if(strlen(buffer+i) == 0) {
                return -2;
            }
            i++;
        }
        if(*(buffer+i) == '.') {
            i++;
            while(isdigit(*(buffer+i))) {
                if(strlen(buffer+i) == 0) {
                    return -2;
                }
                i++;
            }
            buffer += i;
            return DOUBLE_TYPE_VAL;
        } else {
            buffer += i;
            return INT_TYPE_VAL;
        }
    }
    return -1;
}
Token setupBufferFromStr(char* string) {
    //This means we are continuing from a prev string.
    if(string != NULL) {
        if(firstTime == false) {
            buffer = strAppend(buffer, string, false);
            free(originalBuff);
            originalBuff = buffer;
        } else {
            buffer = strdup(string);
            originalBuff = buffer;
            firstTime = false;
        }
    } else {
        if(strlen(buffer) == 0) {
            return -2;
        }
    }
    return -5;
}
Token strToToken(char* string) {
    Token returnPhrase;

    returnPhrase = setupBufferFromStr(string);
    if(returnPhrase != -5) {
        return returnPhrase;
    }

    returnPhrase = simpleFirst();
    if(returnPhrase != -1) {
        buffer += 1;
        return returnPhrase;
    }
    returnPhrase = whitespacePhrase();
    if(returnPhrase != -1) {
        return returnPhrase;
    }
    returnPhrase = multiCharOperatorPhrase();
    if(returnPhrase != -1) {
        if(returnPhrase == DOUBLE_EQUALS_LIT
        || returnPhrase == NOT_EQUALS_LIT
        || returnPhrase == DOUBLE_RIGHT_ANGLE_BRACKET
        || returnPhrase == DOUBLE_LEFT_ANGLE_BRACKET
        || returnPhrase == DOUBLE_OR_OP
        || returnPhrase == DOUBLE_AND_OP) {
            buffer += 2;
        }
        else if(returnPhrase == EQUALS_LIT
        || returnPhrase == NOT_LIT
        || returnPhrase == AND_OP
        || returnPhrase == OR_OP
        || returnPhrase == LEFT_ANGLE_BRACKET
        || returnPhrase == RIGHT_ANGLE_BRACKET) {
            buffer += 1;
        }
        return returnPhrase;
    }
    returnPhrase = wordPhrase();
    if(returnPhrase != -1) {
        return returnPhrase;
    }
    returnPhrase = commentPhrase();
    if(returnPhrase != -1) {
        return returnPhrase;
    }
    returnPhrase = variablePhrase();
    if(returnPhrase != -1) {
        return returnPhrase;
    }
    return -1;
}