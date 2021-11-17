package parser.reallylaststage.ParseTree.Expression;

import parser.UtilFunc;
import parser.Token;

import java.util.ArrayList;

public class ParenExpression implements ExpressionInterface {

    int startPos;
    int endPos;
    ExpressionInterface expressionInterface;
    public ParenExpression(int startPos, ArrayList<Token> tokens) throws Exception {
         this.startPos = startPos;
         this.endPos = UtilFunc.getEndInclusiveOfParenthesis(tokens.get(startPos), tokens).position;
         expressionInterface = new Expression(tokens.get(startPos+1), tokens.get(endPos-1), tokens);
    }

    @Override
    public int getEndPos() {
        return endPos;
    }

    public String toSpacedString(int i) {
        String s = "";
//        for(Token token : tokenArrayList) {
//            s+= "\n" + token.toSpacedString(i+1);
//        }
        return "paren expression : " + expressionInterface.toSpacedString(i+1);
    }
}
