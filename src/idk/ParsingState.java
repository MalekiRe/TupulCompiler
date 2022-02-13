package idk;

enum ParsingState {
    //RECURSIVE RULES
        MULTI_CLASS_CODE_BLOCK, // CLASS_CODE_BLOCK | MULTI_CLASS_CODE_BLOCK CLASS_CODE_BLOCK
        MULTI_CODE_BLOCK, // CODE_BLOCK | MULTI_CLASS_CODE_BLOCK CODE_BLOCK
        VAL, // VAL BI_MATH_OP VAL | UNI_MATH_OP VAL | LIT_VAL | FUNC_CALL | VAR_VAL
        ARG, // VAL | VAL , ARG
    //NON RECURSIVE RULES
        //OPTIONALS
            CODE_BLOCK, // Nothing | VAR_DEC TERMINAL | VAR_ASSIGNMENT TERMINAL | FUNC_CALL TERMINAL | RETURN_LIT VAL
            CLASS_CODE_BLOCK, // Nothing | VAR_DEC TERMINAL | FUNC_DEC
            VAR_DEC, // PRIMITIVE_TYPE ID | CLASS_ID ID | CLASS_ID VAR_ASSIGNMENT | PRIMITIVE_TYPE VAR_ASSIGNMENT
            VAR_VAL, // like myVariable or myObject.myVariable || ID | OBJ_ID '.' ID | CLASS_ID '.' ID
            MODIFIER, // static | public | protected | Nothing
            RET_TYPE, // 'void' | PRIMITIVE_TYPE | CLASS_ID
            CONDITIONAL, // ('if' | 'while') '(' COND_STATEMENT ')' '{' MULTI_CODE_BLOCK '}'
            PRIMITIVE_TYPE, // 'int' | 'char' | 'double'
            BI_MATH_OP, // '+' | '-' | '==' | '*' | '/'
            UNI_MATH_OP, // '!'
        //ONE TO ONE
            //SINGLE
                COND_STATEMENT, // VAL
                FUNC_ID, // ID
                OBJ_ID, // ID
                CLASS_ID, // ID
            //MULTI
                VAR_ASSIGNMENT, // ID EQUALS_LIT VAL
                FUNC_DEC, // MODIFIER RET_TYPE FUNC_NAME '(' ARG ')' '{' MULTI_CODE_BLOCK '}'
                CLASS_DEC, // MODIFIER 'class' CLASS_NAME '{' MULTI_CLASS_CODE_BLOCK '}'
                FOR_LOOP, // 'for' '(' COND_STATEMENT ')' '{' MULTI_CODE_BLOCK '}'
                FUNC_CALL, // FUNC_NAME '(' ARG ')'
                CAST, // '(' PRIMITIVE_TYPE ')'
            //TERMINAL VALUES
                //Symbols
                    SEMICOLON, // ';'
                    EQUALS_LIT, // '='
                    COMMA, // ','
                    LEFT_PAREN, // '('
                    RIGHT_PAREN, // ')'
                    ADD,
                    SUB,
                    DIV,
                    MULTIPLY,
                    EQUALS_EQUALS,
                    NOT_OP, // !
                //LIT_VALUES
                LIT_VAL, // like "hi" or 0.1
                //ID's
                    ID,
                //Keywords
                    RETURN_LIT, // 'return'
                    INT_LIT, // 'int'
                    CHAR_LIT, // 'char'
                    DOUBLE_LIT, // 'double'



}
