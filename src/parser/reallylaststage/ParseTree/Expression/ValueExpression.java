package parser.reallylaststage.ParseTree.Expression;

import parser.Token;
import parser.UtilFunc;
import parser.identifiertoken.IdentifierToken;
import parser.reallylaststage.ParseTree.Function.FunctionCall;

import java.util.ArrayList;
import java.util.Optional;

import static main.Main.createSpacedString;

public class ValueExpression implements ExpressionInterface {

    Token startToken;
    ArrayList<Token> tokenArrayList;
    ValueType valueType;
    int endPos;
    Optional<ValueExpression> classValueExpOpt = Optional.empty();
    Optional<FunctionCall> functionCall = Optional.empty();
    public ValueExpression(int startPos, ArrayList<Token> tokens) throws Exception {
        this.startToken = tokens.get(startPos);
        this.tokenArrayList = tokens; //TODO::ACTUALLY IMPLEMENT THE VALUE EXPRESSION STUFF.
        valueType = determineValueType(startToken, tokens);
        if(valueType == ValueType.CLASS_SOMETHING) {
            classValueExpOpt = Optional.of(new ValueExpression(UtilFunc.getToPeriodInclusive(startToken, tokens).position+1, tokens));
        }
        if(valueType == ValueType.FUNC) {
            functionCall = Optional.of(new FunctionCall(startToken, tokens));
        }
        this.endPos = getPrivateEndPos();
    }
    private static ValueType determineValueType(Token startToken, ArrayList<Token> tokens) {
        //the start token is the identifier, so we move after that.
        Token secondToken = tokens.get(startToken.position+1);
        switch (secondToken.tokenType) {
            case LEFT_PAREN -> { //TODO::this will break when we allow multiplication by having a variable name next to a parenthsis like " myVar(1+secondVar) "
                return ValueType.FUNC;
            }
            case PERIOD -> {
                return ValueType.CLASS_SOMETHING;
            }
            default -> {
                return ValueType.VARIABLE;
            }
        }
    }

    enum ValueType {
        FUNC,
        VARIABLE,
        CLASS_SOMETHING
    }
    @Override
    public int getEndPos() {
        return this.endPos;
    }

    private int getPrivateEndPos() throws Exception {
        if(valueType == ValueType.FUNC) {
            return UtilFunc.getEndInclusiveOfParenthesis(tokenArrayList.get(startToken.position+1), tokenArrayList).position;
        }
        else if(valueType == ValueType.CLASS_SOMETHING) {
            return classValueExpOpt.get().getEndPos();
        }
        else {
            return startToken.position;
        }
    }

    @Override
    public String toSpacedString(int a) {
        String s = "";
        for(int i = startToken.position; i <= getEndPos(); i++) {
            s += tokenArrayList.get(i).toSpacedString(a) + "\n";
        }
        return s;
    }
}
