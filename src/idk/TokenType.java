package idk;

enum TokenType {
    KEYWORD, // like class, static, etc.
    ID, //class names, variables names etc.
    WHITESPACE,
    COMMENT,
    SYMBOL, //like " { /
    VALUE //like 1.0 or the hi in "hi"
}
