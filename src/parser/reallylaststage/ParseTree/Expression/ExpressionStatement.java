package parser.reallylaststage.ParseTree.Expression;

import parser.Token;
import parser.TokenType;

import java.util.ArrayList;

public class ExpressionStatement {

    ArrayList<Token> tokenArrayList = new ArrayList<>();
    Token token;
    Expression expression;
    public ExpressionStatement(Token token, ArrayList<Token> tokens) throws Exception {
        this.token = token;
        int pos = -1;
        for(int i = token.position; tokens.get(i).tokenType != TokenType.SEMICOLON; i++) {
            pos = i;
            tokenArrayList.add(tokens.get(i));
        }

        expression = new Expression(token, tokens.get(pos), tokens);

    }



    @Override
    public String toString() {
        String s = "expression statement is : ";
        s += "\n" + expression.toSpacedString(1);
//        for(Token token : tokenArrayList) {
//            s+= token.toSpacedString(0);
//        }
        return s;
    }
}
