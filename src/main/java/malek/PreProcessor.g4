grammar PreProcessor;

IMPORT                  : 'import' ;
FROM                    : 'from' ;
AS                      : 'as' ;
SEMICOLON               : ';' ;
IDENTIFIER              : [a-zA-Z]+[A-Za-z0-9]* ;
FILE_IDENTIFIER         : '\''(.)+?'\'';
WHITESPACE              : [ \t\r\n]+ -> skip ;
GARBAGE                 : (.|'\n')+? ;

fileImports             : (fileImport | fromImport)* (GARBAGE* | <EOF>)
                        ;

fileImport              : IMPORT FILE_IDENTIFIER AS IDENTIFIER ';'
                        ;

fromImport              : FROM FILE_IDENTIFIER '{' fileImport+ '}'
                        ;