#include <stdio.h>
#include <string.h>
#include <malloc.h>
#include <stdbool.h>
#include "token.h"
#include "lexer.h"
#include "stringutil.h"


int main() {
    printf("Hello, World!\n");
    FILE *file = fopen("../myprogram.m", "r");
    char fileBuff[255];
    int i = 0;
    while(fgets(fileBuff, 255, file) != NULL) {
        printf("%s\n", fileBuff);
        Token phrase = strToPhrase(fileBuff);
        while(phrase != -2) {
            printToken(phrase);
            phrase = strToPhrase(NULL);
            i++;
            if(i == 100) {
                return 1;
            }
        }
    }
    Token phrase = strToPhrase("\n");
    printToken(phrase);

    return 0;
}
