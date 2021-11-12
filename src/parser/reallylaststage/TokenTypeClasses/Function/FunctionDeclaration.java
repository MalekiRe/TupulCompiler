package parser.reallylaststage.TokenTypeClasses.Function;

import parser.Token;
import parser.TokenType;
import parser.reallylaststage.TokenTypeClasses.AccessLevel;
import parser.reallylaststage.TokenTypeClasses.MutableLevel;
import parser.reallylaststage.TokenTypeClasses.StaticLevel;

import java.util.ArrayList;

public class FunctionDeclaration {

    AccessLevel accessLevel = AccessLevel.PUBLIC;
    MutableLevel mutableLevel = MutableLevel.MUTABLE;
    StaticLevel staticLevel = StaticLevel.NON_STATIC;
    Token token;
    //ReturnType returnType;
    Token returnTypeToken;
    FunctionCodeBlock functionCodeBlock;
    FunctionVarDecList functionVarDecList;
    public FunctionDeclaration(Token token, ArrayList<Token> tokens) throws Exception {
        this.token = token;
        this.returnTypeToken = tokens.get(token.position-1);
        functionCodeBlock = new FunctionCodeBlock(tokens.get(getPositionOfStartOfCodeBlock(token.position, tokens)+1), tokens);
        functionVarDecList = new FunctionVarDecList(tokens.get(getPositionOfLeftParen(token.position, tokens)), tokens);
        //returnType = new ReturnType(tokens.get(token.position-1));
    }

    @Override
    public String toString() {
        String s = "function decleration : ";
        s += "\nreturn type is : " + returnTypeToken;
        s+= "\n"+ functionCodeBlock + "\n" + functionVarDecList;
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
