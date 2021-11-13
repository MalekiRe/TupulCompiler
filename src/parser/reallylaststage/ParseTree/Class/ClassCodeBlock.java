package parser.reallylaststage.ParseTree.Class;

import parser.Token;
import parser.TokenType;
import parser.identifiertoken.IdentifierToken;
import parser.identifiertoken.IdentifierType;
import parser.reallylaststage.ParseTree.Function.BracketNum;
import parser.reallylaststage.ParseTree.Function.FunctionDeclaration;
import parser.reallylaststage.ParseTree.Variable.VariableDeclaration;

import java.util.ArrayList;

import static main.Main.createSpacedString;

public class ClassCodeBlock {
    ArrayList<ClassCodeStatement> classCodeStatements = new ArrayList<>();

    public ClassCodeBlock(Token token, ArrayList<Token> tokens) throws Exception {
        int pos = token.position;
        while(tokens.get(pos).tokenType != TokenType.RIGHT_BRAC) {
            pos = setTokensForFunctionCodeStatement(tokens.get(pos), tokens);
        }
    }


    public String toSpacedString(int spacing) {
        String s = createSpacedString(spacing);
        s+= "class code block contains the following class code statements";
        for(ClassCodeStatement codeStatement : classCodeStatements) {
            s += "\n" + codeStatement.toSpacedString(spacing+1);
        }
        return s;
    }

    //TODO::Implement this function
    public static boolean isFunctionDec(int startPosition, ArrayList<Token> tokens) {
        int i = startPosition;
        while (tokens.get(i).tokenType == TokenType.ACCESS_MODIFIER) {
            i++;
        }
        if (!isPrimitiveVarTypeOrClassName(i, tokens)) {
            return false;
        }
        i++;
        if (tokens.get(i).tokenType != TokenType.IDENTIFIER) {
            return false;
        }
        if (((IdentifierToken) tokens.get(i)).identifierType != IdentifierType.FUNCTION_DECLARATION) {
            return false;
        }
        i++;
        if (tokens.get(i).tokenType != TokenType.LEFT_PAREN) {
            return false;
        }
        return true;
    }

    public static boolean isPrimitiveVarTypeOrClassName(int i, ArrayList<Token> tokens) {
        return tokens.get(i).tokenType == TokenType.VAR_TYPE || (tokens.get(i) instanceof IdentifierToken && ((IdentifierToken) tokens.get(i)).identifierType == IdentifierType.VARIABLE_DECLARATION);
    }

    public static boolean isVariableDec(int startPosition, ArrayList<Token> tokens) {
        int i = startPosition;
        System.out.println("start pos token is : " +  tokens.get(startPosition));
        while(tokens.get(i).tokenType == TokenType.ACCESS_MODIFIER) {
            i++;
        }
        if(!isPrimitiveVarTypeOrClassName(i, tokens)) {
            System.out.println("is not variable dec becasue " + tokens.get(i).toSpacedString(0) + " is not a primitive or var class name");
            return false;
        }
        i++;
        if(tokens.get(i).tokenType != TokenType.IDENTIFIER) {
            System.out.println("is not variable dec becasue " + tokens.get(i).toSpacedString(0) + " is not an identifier");
            return false;
        }
        return true;
    }

    public int setTokensForFunctionCodeStatement(Token token, ArrayList<Token> tokens) throws Exception {
        int numOfBrackets = 1;
        if (isFunctionDec(token.position, tokens)) {
            FunctionDeclaration functionDeclaration = new FunctionDeclaration(token, tokens);
            classCodeStatements.add(functionDeclaration);
            return functionDeclaration.getEndOfCodeBlock(tokens);
        }
        //This is semicolon teritotory now lmao.
        if (isVariableDec(token.position, tokens)) {
            VariableDeclaration variableDeclaration = new VariableDeclaration(token, tokens);
            classCodeStatements.add(variableDeclaration);
            return variableDeclaration.getEndOfStatement(tokens)+1;
        }
        throw new Exception("tried to set tokens for function code statement, but missing semicolon");
    }


}
