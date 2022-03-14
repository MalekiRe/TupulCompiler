grammar Tupul;


/*
 * Lexer Rules
 */
fragment DIGIT          : [0-9] ;
INTEGER                 : DIGIT+ ;
FLOAT                   : DIGIT+ ([.,] DIGIT+)?'f' ;
DOUBLE                  : DIGIT+ ([.,] DIGIT+)? ;
PLUS_EQUALS             : '+=' ;
MINUS_EQUALS            : '-=' ;
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
THIS_KEYWORD            : 'this' ;
INT_TYPE                : 'int' ;
FLOAT_TYPE              : 'float' ;
DOUBLE_TYPE             : 'double' ;
CHAR_TYPE               : 'char' ;
VOID_TYPE               : 'void' ;
BOOL_TYPE               : 'bool' ;
NULL_TYPE               : 'null' ;
FALSE_KEYWORD           : 'false' ;
TRUE_KEYWORD            : 'true' ;
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

allMultipleLinkedFiles          : file+
                                ;


file                            : declarePackage importSomething* (typeDeclaration | interfaceDeclaration)
                                ;

//Declare the thing
declarePackage                  : 'file' (IDENTIFIER '.')* IDENTIFIER ';'
                                ;


//Import stuff
importSomething                 : 'import' ( IDENTIFIER '.' )* IDENTIFIER ';'
                                ;

//INTERFACE STUFF

interfaceDeclaration            : 'interface' IDENTIFIER ('extends' interfaceExtensions)? interfaceCodeBlock
                                ;

interfaceExtensions             : IDENTIFIER ( ',' interfaceExtensions )*
                                ;

interfaceCodeBlock              : '{' (interfaceCodeBlock)* '}'
                                | interfaceFunctionDeclaration
                                | interfaceDeclaration
                                | typeDeclaration
                                | interfaceAbstractFuncDec
                                ;


interfaceFunctionDeclaration    : ('override' | 'implement') universalFunctionModifiers IDENTIFIER '::' universalPostIdentifierFuncDec functionCodeBlock
                                | universalFunctionModifiers universalPostIdentifierFuncDec functionCodeBlock
                                ;

interfaceAbstractFuncDec        : universalFunctionModifiers universalPostIdentifierFuncDec ';'
                                ;

//TYPE FILE STUFF

typeDeclaration                 : 'type' IDENTIFIER ('extends' interfaceExtensions)? typeCodeBlock
                                ;

typeCodeBlock                   : '{' (typeCodeBlock)* '}'
                                | typeFunctionDeclaration
                                | typeDeclaration
                                | interfaceDeclaration
                                ;

typeFunctionDeclaration         : ('override' | 'implement') universalFunctionModifiers IDENTIFIER '::' universalPostIdentifierFuncDec functionCodeBlock
                                | universalFunctionModifiers universalPostIdentifierFuncDec functionCodeBlock
                                ;

//FUNCTION STUFF
universalFunctionModifiers      : ( ( type | 'void' ) | '(' (type | 'void') ( ',' (type | 'void')* ) ')' ) ( 'public' | 'private' )? ( 'fluid' | 'const' | 'fixed' )? ('dirty' | 'tidy' | 'pure')?
                                ;

functionDecArguments            : type IDENTIFIER (',' type IDENTIFIER)*
                                ;
functionCallArguments           : IDENTIFIER (',' IDENTIFIER)*
                                ;

universalPostIdentifierFuncDec  : IDENTIFIER '(' functionDecArguments? ')' ( '<' (functionTagOperation ';' )* '>' )?
                                ;

//Tag Stuff

functionTagOperation            : ( functionTagAppend | functionTagRemove | functionTagEquals )
                                ;

functionTagAppend               : finalValue '+=' tagID
                                ;

functionTagRemove               : finalValue '-=' tagID
                                ;

functionTagEquals               : finalValue '==' tagID
                                ;

functionTagNotEquals            : finalValue '!=' tagID
                                ;

tagID                           : IDENTIFIER'#'IDENTIFIER
                                ;

functionCodeBlock               : '{' functionCodeBlock* '}'
                                | functionCall ';'
                                | 'return' (finalValue | '(' finalValue ( ',' finalValue )* ')' )? ';'
                                | functionTagOperation ';'
                                | chainedIfStatement
                                | whileLoop
                                | forLoop
                                | singleVarDec ';'
                                | singleVarAssignment ';'
                                | multiVarAssignment ';'
                                | variableSwap ';'
                                | variableIncrement
                                | variableDecrement ';'
                                | ';'
                                // TODO::finish this off
                                ;

functionCall                    : IDENTIFIER '(' functionCallArguments ')'
                                ;

//Logic Control Stuff

whileLoop                       : 'while' '(' conditional ')' functionCodeBlock
                                ;

forLoop                         : 'for' '(' functionCodeBlock ';'? conditional ';' functionCodeBlock ';'? ')' functionCodeBlock
                                ;

specialForLoop                  : 'for' '(' IDENTIFIER IDENTIFIER ':' IDENTIFIER ')' functionCodeBlock
                                ;

chainedIfStatement              : ifStatement (elseIfStatement)* (elseStatement)?
                                ;

ifStatement                     : 'if' '(' conditional ')' functionCodeBlock
                                ;

elseStatement                   : 'else' functionCodeBlock
                                ;

elseIfStatement                 : 'else if' '(' conditional ')' functionCodeBlock
                                ;

conditional                     : finalValue
                                ;


//Value stuff

type                            : IDENTIFIER | 'int' | 'char' | 'double' | 'float'
                                ;

finalValue                      : intermediateValue
                                ;

varID                           : IDENTIFIER
                                | THIS_KEYWORD
                                ;

intermediateValue               : functionCall (':' ((type IDENTIFIER | IDENTIFIER) | '(' ( (type IDENTIFIER | IDENTIFIER)+ (',' (type IDENTIFIER | IDENTIFIER))*) ')'))?
                                | '(' intermediateValue ')'
                                | INTEGER
                                | FLOAT
                                | DOUBLE
                                | CHAR
                                | STRING
                                | intermediateValue '<' intermediateValue
                                | intermediateValue '<=' intermediateValue
                                | intermediateValue '>=' intermediateValue
                                | intermediateValue '>' intermediateValue
                                | intermediateValue '==' intermediateValue
                                | intermediateValue '!=' intermediateValue
                                | intermediateValue '*' intermediateValue
                                | intermediateValue '/' intermediateValue
                                | intermediateValue '+' intermediateValue
                                | intermediateValue '-' intermediateValue
                                | varID
                                ;


//Variable stuff

singleVarDec                          : type (IDENTIFIER ('=' finalValue)?)+ (',' IDENTIFIER ('=' finalValue)?)*
                                      ;

singleVarAssignment                   : IDENTIFIER '=' finalValue
                                      ;

multiVarAssignment                    : '(' (IDENTIFIER | type IDENTIFIER)+ ')' '=' finalValue
                                      ;

variableSwap                          : IDENTIFIER '<->' IDENTIFIER
                                      ;

variableIncrement                     : IDENTIFIER '++'
                                      ;

variableDecrement                     : IDENTIFIER '--'
                                      ;

//Some default operations



