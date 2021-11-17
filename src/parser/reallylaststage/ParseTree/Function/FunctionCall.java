package parser.reallylaststage.ParseTree.Function;

import parser.Token;
import parser.TokenType;
import parser.UtilFunc;
import parser.reallylaststage.ParseTree.Expression.Expression;

import java.util.ArrayList;

public class FunctionCall {
    Token token;
    ArrayList<Token> tokens;
    ArrayList<Expression> variableExpressions = new ArrayList<>();
    int endPos;
    public FunctionCall(Token token, ArrayList<Token> tokens) throws Exception {
        this.token = token;
        this.tokens = tokens;
        this.endPos = getEndPosPrivate();
        int positionAtParen = token.position+1;
        int numberOfCommas = 0;
        int startPosition = positionAtParen+1;
        for(int i = positionAtParen+1; i < endPos; i++) {
            if(tokens.get(i).tokenType == TokenType.LEFT_PAREN) {
                i = UtilFunc.getEndInclusiveOfParenthesis(tokens.get(i), tokens).position+1;
            }
            if(tokens.get(i).tokenType == TokenType.COMMA) {
                numberOfCommas++;
                variableExpressions.add(new Expression(tokens.get(startPosition), tokens.get(i-1), tokens));
                startPosition = i+1;
            }
            //This is for the last expression, the one with no comma after it.
            if(tokens.get(i).tokenType == TokenType.RIGHT_PAREN) {
                variableExpressions.add(new Expression(tokens.get(startPosition), tokens.get(i-1), tokens));
                startPosition = i+1;
            }
        }
        System.out.println("Number Of Commas Is : " + numberOfCommas);
        System.out.println("the variable expressions are : ");
        for(Expression expression : variableExpressions) {
            System.out.println(expression.toSpacedString(2));
        }
        System.out.println("done printing variable expressions");

    }

    public static boolean isFunctionCall(Token token, ArrayList<Token> tokens) {
        if(token.tokenType != TokenType.IDENTIFIER)
            return false;
        if(tokens.get(token.position+1).tokenType != TokenType.LEFT_PAREN)
            return false;
        //TODO::add checks that everything is a comma deliniated space.
        return true;
    }

    private int getEndPosPrivate() throws Exception {
        return UtilFunc.getEndInclusiveOfParenthesis(tokens.get(token.position+1), tokens).position;
    }

    public int getEndPos() {
        return this.endPos;
    }
}
