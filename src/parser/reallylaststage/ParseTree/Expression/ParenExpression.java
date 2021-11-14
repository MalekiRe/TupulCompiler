package parser.reallylaststage.ParseTree.Expression;

import parser.Token;

import java.util.ArrayList;

public class ParenExpression implements ExpressionInterface {

    int startPos;
    int endPos;
    ExpressionInterface expressionInterface;
    public ParenExpression(int startPos, ArrayList<Token> tokens) throws Exception {
         this.startPos = startPos;
         int numberOfParen = 1;
         for(int i = startPos+1; i < tokens.size(); i++) {
             switch (tokens.get(i).tokenType) {
                 case LEFT_PAREN -> numberOfParen++;
                 case RIGHT_PAREN -> numberOfParen--;
             }
             if(numberOfParen == 0) {
                 endPos = i;
                 break;
             }
             //this.tokenArrayList.add(tokens.get(i));
         }
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
