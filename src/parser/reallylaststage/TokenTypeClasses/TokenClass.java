package parser.reallylaststage.TokenTypeClasses;

import parser.Token;

public class TokenClass {
    Token identifier;
    CodeBlock codeBlock;
    Token mutability;
    Token staticLevel;
    Token protectionLevel;
    public TokenClass(Token identifier, CodeBlock codeBlock) {
        this.identifier = identifier;
        this.codeBlock = codeBlock;
    }
//    TokenClass(Token identifier, Token mutability) {
//        this(identifier);
//        this.mutability = mutability;
//    }

    @Override
    public String toString() {
        return "id token is : " + identifier.toString() + ", code block is : " + codeBlock;
    }
}
