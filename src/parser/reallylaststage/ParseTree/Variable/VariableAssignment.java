package parser.reallylaststage.ParseTree.Variable;

import parser.Token;
import parser.reallylaststage.ParseTree.Expression.ExpressionStatement;

import java.util.ArrayList;

public class VariableAssignment {

    Token token;
    ExpressionStatement expressionStatement;

    public VariableAssignment(Token token, ArrayList<Token> tokens) throws Exception {
        this.token = token;
        System.out.println("TOken is : " + token.toSpacedString(0));
        expressionStatement = new ExpressionStatement(tokens.get(token.position+2), tokens);
    }

    @Override
    public String toString() {
        return "Assignment : " + token + "\n" + expressionStatement;
    }
}
