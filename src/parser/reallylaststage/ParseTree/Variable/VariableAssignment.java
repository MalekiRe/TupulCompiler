package parser.reallylaststage.ParseTree.Variable;

import parser.Token;
import parser.reallylaststage.ParseTree.Expression.Expression;

import java.util.ArrayList;

public class VariableAssignment {

    Token token;
    Expression expression;

    public VariableAssignment(Token token, ArrayList<Token> tokens) {
        this.token = token;
        expression = new Expression(tokens.get(token.position+2), tokens);
    }

    @Override
    public String toString() {
        return "Assignment : " + token + "\n" + expression;
    }
}
