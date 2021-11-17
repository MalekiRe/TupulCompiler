package parser.reallylaststage.ParseTree.Function;

import parser.Token;
import parser.TokenType;

import java.util.ArrayList;

import static main.Main.createSpacedString;

public class FunctionCodeBlock {
    public ArrayList<FunctionCodeStatement> functionCodeStatements = new ArrayList<>();

    public FunctionCodeBlock(Token token, ArrayList<Token> tokens) throws Exception {
        int i = token.position;
        BracketNum bracketNum = new BracketNum();
        bracketNum.num = 1;
        while(i < tokens.size() && bracketNum.num != 0) {
            //TODO::THIS MAY BREAK IT, TEMPERATORY FIX MAYBE? Might be fine
            if(tokens.get(i+1).tokenType == TokenType.RIGHT_BRAC) {
                break;
            }
            FunctionCodeStatement functionCodeStatement = new FunctionCodeStatement();
            i = functionCodeStatement.setTokensForFunctionCodeStatement(tokens.get(i), tokens, bracketNum);
            functionCodeStatements.add(functionCodeStatement);
        }
    }




    public String toSpacedString(int i) {
        String s = "";
        for(FunctionCodeStatement functionCodeStatement : functionCodeStatements) {
            s += createSpacedString(i) + functionCodeStatement.toSpacedString(i+1);
        }
        return s;
    }
}

