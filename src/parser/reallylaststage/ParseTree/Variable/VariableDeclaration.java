package parser.reallylaststage.ParseTree.Variable;

import parser.Token;
import parser.TokenType;
import parser.reallylaststage.ParseTree.Class.ClassCodeStatement;
import parser.reallylaststage.ParseTree.Class.ClassCodeStatementType;

import java.util.ArrayList;
import java.util.Optional;

public class VariableDeclaration extends ClassCodeStatement {

    Token variableType;
    Token token;
    Token beginningOfStatementToken;
    Optional<VariableAssignment> variableAssignmentOptional = Optional.empty();
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
        if(isVariableAssignment(this.token.position, tokens)) {
            variableAssignmentOptional = Optional.of(new VariableAssignment(this.token, tokens));
        }
    }

    public static boolean isVariableAssignment(int i, ArrayList<Token> tokens){
        while(tokens.get(i).tokenType != TokenType.SEMICOLON) {
            if(tokens.get(i).tokenType == TokenType.EQUALS) {
                return true;
            }
            i++;
        }
        return false;
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
        if(variableAssignmentOptional.isPresent()) {
            s += " and  variable assignemnt : " + variableAssignmentOptional.get() + "\n";
        }
        return s;
    }
}
