//
// Created by malek on 2/19/22.
//

/**
 * Copys and does whatever memory allocation needed to change str1 to include str2
 * @param str1
 * @param str2
 * @return
 */
#include <malloc.h>
#include <string.h>
#include "stringutil.h"
char *strAppend(char *str1, const char *str2, bool isOnHeap) {
    char* tempStr = malloc(strlen(str1) + strlen(str2)+1);
    strcpy(tempStr, str1);
    strcat(tempStr, str2);
    if(isOnHeap) {
        free(str1);
    }
    str1 = tempStr;
    return str1;
}