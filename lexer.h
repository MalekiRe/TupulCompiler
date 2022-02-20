//
// Created by malek on 2/19/22.
//

#ifndef MLANG_LEXER_H
#define MLANG_LEXER_H


#include "token.h"

/**
 *
 * @param string
 * @param posPtr
 * @return -1 on failure or a Token on success.
 */
Token strToPhrase(char* string);

#endif //MLANG_LEXER_H