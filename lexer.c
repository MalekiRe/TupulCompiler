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
        default: return -1;
    }
}
Token equalsCheck() {
    if(*(buffer) == '=') {
        if(strlen(buffer) == 1) {
            return -2;
        } else {
            if(*(buffer+1) == '=') {
                return DOUBLE_EQUALS_LIT;
            } else {
                return EQUALS_LIT;
            }
        }
    }
    if(*buffer == '!') {
        if(strlen(buffer) == 1) {
            return -2;
        }
        else {
            if(*(buffer+1) == '=') {
                return NOT_EQUALS_LIT;
            } else {
                return NOT_LIT;
            }
        }
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
        if(workingWordPhrase != -1) {
            buffer += x;
        }
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
Token strToPhrase(char* string) {
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

    Token returnPhrase = simpleFirst();
    if(returnPhrase != -1) {
        buffer += 1;
        return returnPhrase;
    }
    returnPhrase = whitespacePhrase();
    if(returnPhrase != -1) {
        return returnPhrase;
    }
    returnPhrase = equalsCheck();
    if(returnPhrase != -1) {
        if(returnPhrase == DOUBLE_EQUALS_LIT || returnPhrase == NOT_EQUALS_LIT) {
            buffer += 2;
        }
        else if(returnPhrase == EQUALS_LIT || returnPhrase == NOT_LIT) {
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
    return -1;
}
