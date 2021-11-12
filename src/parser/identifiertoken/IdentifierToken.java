package parser.identifiertoken;

import parser.Token;
import parser.TokenType;

public class IdentifierToken extends Token {
    public IdentifierType identifierType;
    public IdentifierToken(String str, int position, TokenType tokenType) throws Exception {
        super(str, position, tokenType);
    }

    @Override
    public String toString() {
        return super.toString() + ", identifierType : " + identifierType;
    }
}
