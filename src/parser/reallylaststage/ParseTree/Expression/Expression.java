package parser.reallylaststage.ParseTree.Expression;

import parser.Token;
import parser.TokenType;

import java.util.ArrayList;

public class Expression {

    ArrayList<Token> tokenArrayList = new ArrayList<>();
    Token token;
    public Expression(Token token, ArrayList<Token> tokens) {
        this.token = token;
        for(int i = token.position; tokens.get(i).tokenType != TokenType.SEMICOLON; i++) {
            tokenArrayList.add(tokens.get(i));
        }
    }

    @Override
    public String toString() {
        String s = "expression is : ";
        for(Token token : tokenArrayList) {
            s+= token.toSpacedString(0);
        }
        return s;
    }
}
