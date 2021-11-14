package parser.reallylaststage.ParseTree.Expression;

import parser.Token;

public class ConstExpression implements ExpressionInterface {

    Token token;
    public ConstExpression(Token token) {
        this.token = token;
    }

    @Override
    public int getEndPos() {
        return token.position;
    }

    @Override
    public String toSpacedString(int i) {
        return token.toSpacedString(i);
    }
}
