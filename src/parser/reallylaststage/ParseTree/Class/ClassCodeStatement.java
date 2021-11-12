package parser.reallylaststage.ParseTree.Class;

import parser.MainParser;
import parser.Token;
import parser.TokenType;
import parser.reallylaststage.ParseTree.Function.BracketNum;

import java.util.ArrayList;

public class ClassCodeStatement {
    ClassCodeStatementType classCodeStatementType;
    ArrayList<Token> tokenArrayList = new ArrayList<>();

    //TODO::Implement this function
    public static boolean isFunctionDec(int startPosition, ArrayList<Token> tokens) {
        for(int i = startPosition; i < tokens.size(); i++) {
           // while(MainParser.tokenDict.get())
        }
        return false;
    }

    public int setTokensForFunctionCodeStatement(Token token, ArrayList<Token> tokens, BracketNum bracketNum) throws Exception {
        int numOfBrackets = 1;
        if(isFunctionDec(token.position, tokens)) {
            bracketNum.num++;
            classCodeStatementType = ClassCodeStatementType.FUNCTION;
            int savedPos = 0;
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
        classCodeStatementType = ClassCodeStatementType.METHOD;
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
}
