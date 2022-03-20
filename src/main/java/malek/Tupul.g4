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
SUPERSET_KEYWORD        : 'superset' ;
SUPER_KEYWORD           : 'super' ;
INT_TYPE                : 'int' ;
FLOAT_TYPE              : 'float' ;
DOUBLE_TYPE             : 'double' ;
CHAR_TYPE               : 'char' ;
VOID_TYPE               : 'void' ;
BOOL_TYPE               : 'bool' ;
STRING_TYPE             : 'string' ;
NULL_TYPE               : 'null' ;
FALSE_KEYWORD           : 'false' ;
TRUE_KEYWORD            : 'true' ;
UNION_KEYWORD           : 'union' ;
INSTANCEOF_KEYWORD      : 'instanceof' ;
SUBSET_KEYWORD          : 'subset' ;
STRICT_SUBSET_KEYWORD   : 'strictsubset' ;
TYPE                    : 'type' ;
INTERFACE               : 'interface' ;
EXTENDS                 : 'extends' ;
OVERRIDE                : 'override' ;
IMPLEMENT               : 'implement' ;
IMPORT                  : 'import' ;
AS                      : 'as' ;
FROM                    : 'from' ;
PUBLIC                  : 'public' ;
PRIVATE                 : 'private' ;
CHAR                    : '\''[A-Za-z0-9]'\'' ;
STRING                  : '"' (~[\r\n"] | '""')* '"' ;
WHITESPACE              : [ \t\r\n]+ -> channel(HIDDEN) ;
FILE_IDENTIFIER         : '\''(.)+?'\'';
IDENTIFIER              : [a-zA-Z]+[A-Za-z0-9]* ;
/*
 * Parser Rules
 */

file                            : fromImport* fileImport* (typeDeclaration | interfaceDeclaration)
                                ;

fileImport                      : IMPORT FILE_IDENTIFIER AS (IDENTIFIER | FILE_IDENTIFIER) ';'
                                ;

fromImport                      : FROM FILE_IDENTIFIER '{' fileImport+ '}'
                                ;

fileOrNormalID                  : FILE_IDENTIFIER | IDENTIFIER
                                ;

//INTERFACE STUFF
interfaceDeclaration            : 'interface' fileOrNormalID ('extends' interfaceExtensions)? interfaceCodeBlock
                                ;

interfaceExtensions             : fileOrNormalID ( interfaceExtensionName )*
                                ;

interfaceExtensionName          : ',' fileOrNormalID
                                ;

interfaceCodeBlock              : '{' (interfaceCodeBlock)* '}'
                                | variableDeclaration ';'
                                | interfaceFunctionDeclaration
                                | interfaceDeclaration
                                | typeDeclaration
                                | interfaceAbstractFuncDec
                                ;


interfaceFunctionDeclaration    : ('override' | 'implement') universalFunctionModifiers fileOrNormalID '::' universalFunctionPost
                                | universalFunctionPost
                                ;

interfaceAbstractFuncDec        : universalFunctionModifiers universalPostIdentifierFuncDec ';'
                                ;

//TYPE FILE STUFF

typeDeclaration                 : 'type' fileOrNormalID ('extends' interfaceExtensions)? typeCodeBlock
                                ;

typeCodeBlock                   : '{' (typeCodeBlock)* '}'
                                | typeFunctionDeclaration
                                | typeDeclaration
                                | interfaceDeclaration
                                | variableDeclaration ';'
                                ;

typeFunctionDeclaration         : ('override' | 'implement') universalFunctionModifiers fileOrNormalID '::' universalFunctionPost
                                | universalFunctionModifiers universalFunctionPost
                                ;


universalFunctionPost           : universalPostIdentifierFuncDec functionCodeBlock
                                ;

functionWithinFunctionDec       : universalFunctionModifiers universalPostIdentifierFuncDec functionCodeBlock
                                ;

//FUNCTION STUFF
universalFunctionModifiers      : ( typeWithVoid | '(' typeWithVoid ( ',' typeWithVoid* ) ')' ) ('static' | ) ( 'public' | 'private' )? ( 'fluid' | 'const' | 'fixed' )? ('dirty' | 'tidy' | 'pure')?
                                ;

typeWithVoid                    : (type | 'void')
                                ;

functionDecArguments            : type IDENTIFIER (',' type IDENTIFIER)*
                                ;

functionCallArguments           : IDENTIFIER (',' IDENTIFIER)*
                                ;


universalPostIdentifierFuncDec  : IDENTIFIER '(' functionDecArguments? ')' ( '<' (functionTagOperation ';' )* '>' )?
                                ;

functionCall                    : IDENTIFIER '(' functionCallArguments? ')'                             #normalFunctionCall
                                | FILE_IDENTIFIER ('.' IDENTIFIER)+ '(' functionCallArguments? ')'      #staticFunctionCall
                                | THIS_KEYWORD '.' functionCall                                         #thisFunctionCall
                                | (IDENTIFIER '.')+ functionCall                                        #instanceFunctionCall
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
                                | typeDeclaration ';'
                                | interfaceDeclaration ';'
                                | functionWithinFunctionDec ';'
                                | superCall ';'
                                | ';'
                                // TODO::finish this off
                                ;

superCall                       : SUPER_KEYWORD '(' IDENTIFIER ')'
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

type                            : FILE_IDENTIFIER ('.' IDENTIFIER)* | IDENTIFIER | 'int' | 'char' | 'double' | 'float' | 'string'
                                ;

finalValue                      : intermediateValue
                                ;

variableInstance                : IDENTIFIER                        #localVariableInstance
                                | THIS_KEYWORD                      #thisVariableInstance
                                | FILE_IDENTIFIER ('.' IDENTIFIER)+ #staticVariableInstance
                                | (IDENTIFIER '.')+ IDENTIFIER      #instanceVariableInstance
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
                                | intermediateValue '%' intermediateValue
                                | variableInstance
                                ;


//Variable stuff

variableDeclaration                   : singleVarDec | multiVarDec
                                      ;



singleVarDec                          : type (IDENTIFIER ('=' finalValue)?)+ (',' IDENTIFIER ('=' finalValue)?)*
                                      ;

multiVarDec                           : '(' (type IDENTIFIER)+ ')' '=' finalValue
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



