package parser.reallylaststage.TokenTypeClasses;

import parser.Token;
import parser.TokenType;

import java.util.ArrayList;

public class FunctionCodeStatement {
    public ArrayList<Token> tokenArrayList;
    public FunctionCodeStatement(Token startToken, ArrayList<Token> tokens) {
        int position = -1;
        if(startToken.tokenType == TokenType.LOGIC) {

        }
        for(int i = startToken.position; tokens.get(i).tokenType != TokenType.SEMICOLON; i++) {
            tokenArrayList.add(tokens.get(i));
            position = i;
        }
        tokenArrayList.add(tokens.get(position+1));
    }
}
