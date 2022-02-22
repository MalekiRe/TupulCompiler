//
// Created by malek on 2/19/22.
//

#ifndef MLANG_STRINGUTIL_H
#define MLANG_STRINGUTIL_H

#include <stdbool.h>

char *strAppend(char *str1, const char *str2, bool isOnHeap);
char *strCharAppend(char *str1, char char1);
#endif //MLANG_STRINGUTIL_H
