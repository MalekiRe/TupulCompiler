package parser.reallylaststage.ParseTree.Expression;

import parser.Token;

import java.util.ArrayList;

public class ValueExpression implements ExpressionInterface {

    Token startToken;
    ArrayList<Token> tokenArrayList;
    public ValueExpression(int startPos, ArrayList<Token> tokenArrayList) {
        this.startToken = tokenArrayList.get(startPos);
        this.tokenArrayList = tokenArrayList; //TODO::ACTUALLY IMPLEMENT THE VALUE EXPRESSION STUFF.
    }

    @Override
    public int getEndPos() throws Exception {
        throw new Exception("TRIED TO GET END POS AAAA OF VALUE EXPRESSION NOT IMPELMENTED YET");
    }

    @Override
    public String toSpacedString(int i) {
        return null;
    }
}
