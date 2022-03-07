grammar Tupul;


/*
 * Lexer Rules
 */
fragment DIGIT      : [0-9] ;
INTEGER             : DIGIT+ ;
FLOAT               : DIGIT+ ([.,] DIGIT+)?'f' ;
DOUBLE              : DIGIT+ ([.,] DIGIT+)? ;
EQUALS_LIT          : '=' ;
RETURN_LIT          : 'return' ;
SEMICOLON           : ';' ;
LEFT_PAREN          : '(' ;
RIGHT_PAREN         : ')' ;
LEFT_CURLY          : '{' ;
RIGHT_CURLY         : '}' ;
ADD_OP              : '+' ;
MULTI_OP            : '*' ;
REF_OP              : '&' ;
DIV_OP              : '/' ;
SUB_OP              : '-' ;
INT_TYPE            : 'int' ;
FLOAT_TYPE          : 'float' ;
DOUBLE_TYPE         : 'double' ;
CHAR_TYPE           : 'char' ;
VOID_TYPE           : 'void' ;
CHAR                : '\''[A-Za-z0-9]'\'' ;
STRING              : '"' (~[\r\n"] | '""')* '"' ;
WHITESPACE          : [ \t\r\n]+ -> skip ;
IDENTIFIER          : [a-zA-Z]+[A-Za-z0-9]* ;

/*
 * Parser Rules
 */
fullFile           : (functionDec | varDec)* EOF;

varDec             : variableType IDENTIFIER ('=' expressionValue)? ';'
                   ;

varAssignment      : IDENTIFIER '=' expressionValue ';'
                   ;

functionType       : INT_TYPE                              #IntFunctionType
                   | FLOAT_TYPE                            #FloatFunctionType
                   | DOUBLE_TYPE                           #DoubleFunctionType
                   | CHAR_TYPE                             #CharFunctionType
                   | VOID_TYPE                             #VoidFunctionType
                   ;

variableType       : INT_TYPE                              #IntVariableType
                   | FLOAT_TYPE                            #FloatVariableType
                   | DOUBLE_TYPE                           #DoubleVariableType
                   | CHAR_TYPE                             #CharVariableType
                   ;
functionDec        : functionType IDENTIFIER functionDecArgs functionCode ;
functionDecArgs    : '(' ( functionDecArg (',' functionDecArg)* )?')' ;
functionDecArg     : variableType IDENTIFIER ;

functionCall       : IDENTIFIER functionCallArgs ';'
                   ;

functionCallArgs   : '(' (functionCallArg (',' functionCallArg))?')' ;
functionCallArg    : expressionValue ;


functionCode       : functionCodeBlock
                   ;
functionCodeBlock  : '{' functionCodeBlock* '}'                #FunCodeBlock
                   | varDec                                    #FuncCodeVarDec
                   | varAssignment                             #FuncCodeVarAssignment
                   | functionCall                              #FuncCodeFuncCall
                   | 'return' expressionValue? ';'             #FuncCodeReturn
                   ;

number             : INTEGER                                   #NumberInteger
                   | FLOAT                                     #NumberFloat
                   | DOUBLE                                    #NumberDouble
                   | CHAR                                      #NumberChar
                   ;

expressionValue    : expression
                   ;


expression         : expression op=MULTI_OP expression         # ExpBiOp
                   | expression op=DIV_OP expression           # ExpBiOp
                   | expression op=ADD_OP expression           # ExpBiOp
                   | expression op=SUB_OP expression           # ExpBiOp
                   | number                                    # expNumber
                   | LEFT_PAREN expression RIGHT_PAREN         # parens
                   | functionCall                              # expFunction
                   ;
