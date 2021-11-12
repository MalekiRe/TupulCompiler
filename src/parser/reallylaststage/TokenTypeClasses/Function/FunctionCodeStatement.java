package parser.reallylaststage.TokenTypeClasses.Function;

import parser.Token;
import parser.TokenType;

import java.util.ArrayList;

public class FunctionCodeStatement {
    public ArrayList<Token> tokenArrayList = new ArrayList<>();

    public FunctionCodeStatementType functionCodeStatementType;

    public FunctionCodeStatement() {

    }
    public FunctionCodeStatementType getType() {
        return functionCodeStatementType;
    }
    public int setTokensForFunctionCodeStatement(Token token, ArrayList<Token> tokens, BracketNum bracketNum) throws Exception {
        int numOfBrackets = 1;
        if(token.tokenType == TokenType.LOGIC) {
            bracketNum.num++;
            functionCodeStatementType = FunctionCodeStatementType.LOGIC_STATEMENT;
            //Do special stuff for a while, for, or other loop.
            //Probably a integer keepign track of the number of brackets left and right and finishing when thats 0.
            for(int i = token.position+1; i < tokens.size(); i++) {
                if(tokens.get(i).tokenType == TokenType.LEFT_BRAC) {
                    numOfBrackets++;
                    bracketNum.num++;
                }
                else if(tokens.get(i).tokenType == TokenType.RIGHT_BRAC) {
                    numOfBrackets--;
                    bracketNum.num--;
                }
                tokenArrayList.add(tokens.get(i));
                if(numOfBrackets == 0) {
                    return i;
                }
            }
            throw new Exception("tried to set tokens for a function code statement, in a logic statement, but didn't get to finish brackets");
        }
        functionCodeStatementType = FunctionCodeStatementType.SEMICOLON_TERMINATED_STATEMENT;
        //This is semicolon teritotory now lmao.
        for(int i = token.position+1; i < tokens.size(); i++) {
            tokenArrayList.add(tokens.get(i));
            if(tokens.get(i).tokenType == TokenType.LEFT_BRAC) {
                bracketNum.num++;
            }
            else if(tokens.get(i).tokenType == TokenType.RIGHT_BRAC) {
                bracketNum.num--;
            }
            if(tokens.get(i).tokenType == TokenType.SEMICOLON) {
                return i;
            }
        }
        throw new Exception("tried to set tokens for function code statement, but missing semicolon");
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("statement of size : " + tokenArrayList.size());
        for (Token token : tokenArrayList) {
            s.append("\n  ").append(token);
        }
        return s.toString();
    }
}
