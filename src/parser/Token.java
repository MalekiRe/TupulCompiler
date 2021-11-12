package parser;

import java.util.ArrayList;

public class Token {
    final public String str;
    final public int position;
    final public TokenType tokenType;
    final public ArrayList<TokenType> furtherTokenTypes = new ArrayList<>();
    public Token(String str, int position, TokenType tokenType) throws Exception {
        this.str = str;
        this.position = position;
        this.tokenType = tokenType;
        if(MainParser.higherLevelTokens.contains(tokenType)) {
            furtherTokenTypes.add(MainParser.determineFurtherTokenType(this, tokenType));
            while(MainParser.higherLevelTokens.contains(furtherTokenTypes.get(furtherTokenTypes.size()-1))) {
                furtherTokenTypes.add(MainParser.determineFurtherTokenType(this, furtherTokenTypes.get(furtherTokenTypes.size()-1)));
            }
        }

    }

    @Override
    public String toString() {
        return "string : " + str + ", position : " + position + ", tokenType : " + tokenType;
    }
}
