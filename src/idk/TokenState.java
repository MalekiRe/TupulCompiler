package idk;

public enum TokenState {

    /* Malek Notation is a system to describe a Context Free Grammar, it is set out here.
    [ ] : anything within those brackets could appear once or not at all
    { } : anything within those brackets could appear any number of times or not at all
    ~ ~ : anything within these brackets has to appear at least once, but could appear any number of times.
    ::= is the notation for evolutions.
    things next to eachother are concatonated
    ' ' things between these quotes are actual strings of things.
     */
    FINISHED_FILE, //::= ~CODE_BLOCK~
    CODE_BLOCK, //::= VAR_ASSIGNMENT ';' | VAR_DEC ';'
    FINAL_VALUE, //::= SUM
    SUM, //::= SUM_ADD SUM | PRODUCT
    PRODUCT, //::= PRODUCT_MULTI PRODUCT | VALUE
    SUM_ADD, //::= SUM '+'
    PRODUCT_MULTI, //::= PRODUCT '*'
    VALUE, //::= LITERAL_VALUE
    VARIABLE_DEC, //::= PRIMITIVE_TYPE ID | PRIMITIVE_TYPE VAR_ASSIGNMENT
    PRIMITIVE_TYPE, //::= 'int'
    VAR_ASSIGNMENT, //::= ID '=' FINAL_VALUE
    //TERMINALS
        INT_LIT, //::= 'int'
        EQUALS_LIT, //::= '='
        ADD_OP, //::= '+'
        MULTI_OP, //::= '*'
        SEMICOLON, //::= ';'
        ID, //anything thats not a keyword
        LITERAL_VALUE, //::= anything that is like 1.0, "hi" etc
}
