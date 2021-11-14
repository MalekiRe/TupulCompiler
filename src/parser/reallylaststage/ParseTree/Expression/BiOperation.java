package parser.reallylaststage.ParseTree.Expression;

import parser.Token;

import static main.Main.createSpacedString;

public class BiOperation implements ExpressionInterface {

    //<bi-math-operation> ::= leftExpression mathOperationToken rightExpression
    Token operationToken;
    ExpressionInterface leftExpression;
    ExpressionInterface rightExpression;
    public BiOperation(ExpressionInterface leftExpression, Token token, ExpressionInterface rightExpression) {
        this.operationToken = token;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int getEndPos() throws Exception {
        return 0;
    }

    @Override
    public String toSpacedString(int i) {
        String s = "";
        s += "\n" + createSpacedString(i) + "bi operation : " + operationToken.str;
        s += "\n" + "leftExpression is : " + leftExpression.toSpacedString(i+1);
        s += "\n" + "right expression is : " + rightExpression.toSpacedString(i+1);
        return s;
    }
}
