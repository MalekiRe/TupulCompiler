package parser.reallylaststage.ParseTree.Expression;

import parser.Token;
import parser.TokenType;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import static main.Main.createSpacedString;

public class Expression implements ExpressionInterface{

    ExpressionInterface expressionInterface;
    int endPos;
    public static boolean isBiOperator(Token token, ArrayList<Token> tokens) {
        return token.tokenType == TokenType.MATH_OPERATOR;
    }
    public Expression(Token tokenStart, Token tokenEnd, ArrayList<Token> tokens) throws Exception {
        endPos = tokenEnd.position;
        System.out.println("start pos is : " + tokenStart.toSpacedString(0));
        System.out.println("end pos is : " + tokenEnd.toSpacedString(0));
        //This means we are doing more than just assigning a const.
        if(tokenStart.position - tokenEnd.position != 0) {
            //This means we could have an expression just wrapped in parenethes, or something wrapped in parentehses with a bi operator somewhere else.
            if(tokenStart.tokenType == TokenType.LEFT_PAREN) {
                System.out.println("ye");
                ParenExpression parenExpression = new ParenExpression(tokenStart.position, tokens);
                //This means even after the parenthesis expression we STILL have another operator, so it must be a bi operator
                if(parenExpression.getEndPos() - tokenEnd.position != 0) {
                    expressionInterface = new BiOperation(parenExpression, tokens.get(parenExpression.getEndPos()+1), new Expression(tokens.get(parenExpression.getEndPos()+2), tokenEnd, tokens));
                    return;
                }
                expressionInterface = parenExpression;
                return;
            }
            else if(tokenStart.tokenType == TokenType.CONST) {
                //We know its a const value here, so we fcheck if it has even more to go!
                ConstExpression constExpression = new ConstExpression(tokenStart);
                if(constExpression.getEndPos() - tokenEnd.position != 0) {
                    expressionInterface = new BiOperation(constExpression, tokens.get(constExpression.getEndPos()+1), new Expression(tokens.get(constExpression.getEndPos()+2), tokenEnd, tokens));
                    return;
                }
                expressionInterface = constExpression;
                return;
            }
            //Here we check for the ValueExpression
            else if(tokenStart.tokenType == TokenType.IDENTIFIER) {
                ValueExpression valueExpression = new ValueExpression(tokenStart.position, tokens);
                if(valueExpression.getEndPos() - tokenEnd.position != 0) {
                    //we know there is more, so it must be a bi operation.
                    expressionInterface = new BiOperation(valueExpression, tokens.get(valueExpression.getEndPos()+1), new Expression(tokens.get(valueExpression.getEndPos()+2), tokenEnd, tokens));
                    return;
                }
                expressionInterface = valueExpression;
                return;
            }
            throw new Exception("AAAA tokens in the expression couldn't be parsed, didn't match any known type : " + tokenStart.tokenType + "token was " + tokenStart.toSpacedString(0));
        }
        else {
            System.out.println("yay");
            expressionInterface = new ConstExpression(tokenStart);
        }

    }

    public String toSpacedString(int space) {
        String s = expressionInterface.toSpacedString(space+1);
        return s;
    }

    @Override
    public int getEndPos() throws Exception {
        return endPos;
    }
}
