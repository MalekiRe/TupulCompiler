package parser.reallylaststage.ParseTree.Variable;

import parser.Token;
import parser.TokenType;
import parser.reallylaststage.ParseTree.Class.ClassCodeStatement;
import parser.reallylaststage.ParseTree.Class.ClassCodeStatementType;

import java.util.ArrayList;

public class VariableDeclaration extends ClassCodeStatement {

    Token variableType;
    Token token;
    Token beginningOfStatementToken;
    public VariableDeclaration(Token token, ArrayList<Token> tokens) {
        this.beginningOfStatementToken = token;
        this.classCodeStatementType = ClassCodeStatementType.VARIABLE;
        int i = token.position;
        while(tokens.get(i).tokenType == TokenType.ACCESS_MODIFIER) {
            i++;
        }
        variableType = tokens.get(i);
        i++;
        this.token = tokens.get(i);
    }

    public int getEndOfStatement(ArrayList<Token> tokens) throws Exception {
        for(int i = token.position; i < tokens.size(); i++) {
            if(tokens.get(i).tokenType == TokenType.SEMICOLON) {
                return i;
            }
        }
        throw new Exception("Exception in trying to find semicolon at end of statement in Variable Decleration class, couldn't find semicolon at end of statement");
    }

    @Override
    public String toString() {
        String s = "        variable type is : " + variableType + " , variable name is : " + token;
        return s;
    }
}
