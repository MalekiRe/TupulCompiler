package parser.reallylaststage.TokenTypeClasses.Function;

import parser.Token;
import parser.TokenType;

import java.util.ArrayList;

public class FunctionVarDecList {
    ArrayList<Token> tokenArrayList = new ArrayList<>();
    public FunctionVarDecList(Token token, ArrayList<Token> tokens) {
        for(int i = token.position+1; tokens.get(i).tokenType != TokenType.RIGHT_PAREN; i++) {
            tokenArrayList.add(tokens.get(i));
        }
    }

    @Override
    public String toString() {
        String s = "FunctionVarDecList : ";
        for(Token token : tokenArrayList) {
            s += "  \n" + token;
        }
        return s;

    }
}
