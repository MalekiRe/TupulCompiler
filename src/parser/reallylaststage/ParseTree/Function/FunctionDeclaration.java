package parser.reallylaststage.ParseTree.Function;

import parser.Token;
import parser.TokenType;
import parser.reallylaststage.ParseTree.AccessLevel;
import parser.reallylaststage.ParseTree.Class.ClassCodeStatement;
import parser.reallylaststage.ParseTree.Class.ClassCodeStatementType;
import parser.reallylaststage.ParseTree.MutableLevel;
import parser.reallylaststage.ParseTree.StaticLevel;

import java.util.ArrayList;

import static main.Main.createSpacedString;

public class FunctionDeclaration extends ClassCodeStatement {

    AccessLevel accessLevel = AccessLevel.PUBLIC;
    MutableLevel mutableLevel = MutableLevel.MUTABLE;
    StaticLevel staticLevel = StaticLevel.NON_STATIC;
    Token token;
    //ReturnType returnType;
    Token returnTypeToken;
    FunctionCodeBlock functionCodeBlock;
    FunctionVarDecList functionVarDecList;
    public FunctionDeclaration(Token token, ArrayList<Token> tokens) throws Exception {
        this.classCodeStatementType = ClassCodeStatementType.FUNCTION;
        int i = token.position;
        while (tokens.get(i).tokenType == TokenType.ACCESS_MODIFIER) {
            i++;
        }
        //This is now the var type
        this.returnTypeToken = tokens.get(i);
        i++;
        this.token = tokens.get(i);
        functionCodeBlock = new FunctionCodeBlock(tokens.get(getPositionOfStartOfCodeBlock(token.position, tokens)+1), tokens);
        functionVarDecList = new FunctionVarDecList(tokens.get(getPositionOfLeftParen(token.position, tokens)), tokens);
    }

    public int getEndOfCodeBlock(ArrayList<Token> tokens) throws Exception {
        int bracketNum = 1;
        for(int i = token.position; i < tokens.size(); i++) {
            switch (tokens.get(i).tokenType) {
                case LEFT_BRAC -> bracketNum++;
                case RIGHT_BRAC -> bracketNum--;
            }
            if(bracketNum == 0) {
                return i;
            }
        }
        throw new Exception("Exception for getting the end of a code block in a function decleration, didn't find the end of the code block, some brackets may be incorrect.");
    }

    public String toSpacedString(int spacing) {
        String s = createSpacedString(spacing);
        s += "function decleration : ";
        s += "\n" + createSpacedString(spacing) + "return type is : " + returnTypeToken.toSpacedString(0);
        s+= "\n" + functionCodeBlock.toSpacedString(spacing+1) + "\n" + createSpacedString(spacing-3) + functionVarDecList.toSpacedString(spacing+1);
        return s;
    }

    public int getPositionOfLeftParen(int start, ArrayList<Token> tokens) throws Exception {
        for(int i = start; i < tokens.size(); i++) {
            if(tokens.get(i).tokenType == TokenType.LEFT_PAREN) {
                return i;
            }
        }
        throw new Exception("Error, tried to get the position of a left pareenthese in a function decroloertaion, but oculdn't find the left paretehneses.");
    }
    public int getPositionOfStartOfCodeBlock(int start, ArrayList<Token> tokens) throws Exception {
        for(int i = start; i < tokens.size(); i++) {
            if(tokens.get(i).tokenType == TokenType.RIGHT_PAREN) {
                return i;
            }
        }
        throw new Exception("Error, tried to get the position of a codeblock in a function decleration, but couldn't find the right parenthese");
    }

    //TODO::implement this lmao
    public void setFunctionModifiers(ArrayList<Token> tokens) {

    }
}
