grammar Tupul;


/*
 * Lexer Rules
 */
fragment DIGIT          : [0-9] ;
INTEGER                 : DIGIT+ ;
FLOAT                   : DIGIT+ ([.,] DIGIT+)?'f' ;
DOUBLE                  : DIGIT+ ([.,] DIGIT+)? ;
DOUBLE_EQUALS_LIST      : '==' ;
EQUALS_LIT              : '=' ;
RETURN_LIT              : 'return' ;
SEMICOLON               : ';' ;
LEFT_PAREN              : '(' ;
RIGHT_PAREN             : ')' ;
LEFT_CURLY              : '{' ;
RIGHT_CURLY             : '}' ;
LEFT_SQUARE             : '[' ;
RIGHT_SQUARE            : ']' ;
LEFT_ANGLE              : '<' ;
RIGHT_ANGLE             : '>' ;
ADD_OP                  : '+' ;
MULTI_OP                : '*' ;
DIV_OP                  : '/' ;
SUB_OP                  : '-' ;
SINGLE_OR               : '|' ;
SINGLE_AND              : '&' ;
HASHTAG                 : '#' ;
POINTER                 : '@' ;
COMMA                   : ',' ;
DOUBLE_OR               : '||' ;
DOUBLE_AND              : '&&' ;
INT_TYPE                : 'int' ;
FLOAT_TYPE              : 'float' ;
DOUBLE_TYPE             : 'double' ;
CHAR_TYPE               : 'char' ;
VOID_TYPE               : 'void' ;
NULL_TYPE               : 'null' ;
UNION_KEYWORD           : 'union' ;
INSTANCEOF_KEYWORD      : 'instanceof' ;
SUBSET_KEYWORD          : 'subset' ;
STRICT_SUBSET_KEYWORD   : 'strictsubset' ;
SUPERSET_KEYWORD        : 'superset' ;
TYPE                    : 'type' ;
INTERFACE               : 'interface' ;
EXTENDS                 : 'extends' ;
OVERRIDE                : 'override' ;
IMPLEMENT               : 'implement' ;
IMPORT                  : 'import' ;
PUBLIC                  : 'public' ;
PRIVATE                 : 'private' ;
CHAR                    : '\''[A-Za-z0-9]'\'' ;
STRING                  : '"' (~[\r\n"] | '""')* '"' ;
WHITESPACE              : [ \t\r\n]+ -> skip ;
IDENTIFIER              : [a-zA-Z]+[A-Za-z0-9]* ;

/*
 * Parser Rules
 */

type                            : IDENTIFIER | 'int' | 'char' | 'double' | 'float'
                                ;


file                            : interfaceFile
                                | typeFile
                                ;


//Import stuff
importSomething                 : 'import' ( IDENTIFIER '.' )* IDENTIFIER ';'
                                ;

//INTERFACE STUFF
interfaceFile                   : importSomething* interfaceDeclaration
                                ;

interfaceDeclaration            : 'interface' IDENTIFIER ('extends' interfaceExtensions)? interfaceCodeBlock
                                ;

interfaceExtensions             : IDENTIFIER ( ',' interfaceExtensions )*
                                ;

interfaceCodeBlock              : '{' (interfaceCodeBlock)* '}'
                                | interfaceFunctionDeclaration
                                | interfaceDeclaration
                                | typeDeclaration
                                ;


interfaceFunctionDeclaration    : ('override' | 'implement') universalFunctionModifiers IDENTIFIER '::' IDENTIFIER '(' functionDecArguments? ')' functionCodeBlock
                                | universalFunctionModifiers IDENTIFIER '(' functionDecArguments? ')' functionCodeBlock
                                ;

//TYPE FILE STUFF

typeFile                        : importSomething* typeDeclaration
                                ;

typeDeclaration                 : 'type' IDENTIFIER ('extends' interfaceExtensions)? typeCodeBlock
                                ;

typeCodeBlock                   : '{' (typeCodeBlock)* '}'
                                | typeFunctionDeclaration
                                | typeDeclaration
                                | interfaceDeclaration
                                ;

typeFunctionDeclaration         : ('override' | 'implement') universalFunctionModifiers IDENTIFIER '::' IDENTIFIER '(' functionDecArguments? ')' functionCodeBlock
                                | universalFunctionModifiers IDENTIFIER '(' functionDecArguments? ')' functionCodeBlock
                                ;

//FUNCTION STUFF
universalFunctionModifiers      : ( ( type | 'void' ) | '(' (type | 'void') ( ',' (type | 'void')* ) ')' ) ( 'public' | 'private' )? ( 'fluid' | 'const' | 'fixed' )? ('dirty' | 'tidy' | 'pure')?
                                ;

functionDecArguments            : type IDENTIFIER (',' type IDENTIFIER)*
                                ;
functionCallArguments           : type IDENTIFIER (',' type IDENTIFIER)*
                                ;


functionCodeBlock               : '{' functionCodeBlock* '}'
                                | 'return' (finalValue | '(' finalValue ( ',' finalValue )* ')' )?
                                // TODO::finish this off
                                ;
                                
functionCall                    : IDENTIFIER '(' functionCallArguments ')'
                                ;



//Value stuff

finalValue                      : intermediateValue
                                ;

intermediateValue               : IDENTIFIER
                                | functionCall
                                | INTEGER
                                | FLOAT
                                | DOUBLE
                                | CHAR
                                ;