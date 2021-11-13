package parser.reallylaststage.ParseTree.Function;

import parser.Token;
import parser.TokenType;

import java.util.ArrayList;

import static main.Main.createSpacedString;

public class FunctionVarDecList {
    ArrayList<Token> tokenArrayList = new ArrayList<>();
    public FunctionVarDecList(Token token, ArrayList<Token> tokens) {
        for(int i = token.position+1; tokens.get(i).tokenType != TokenType.RIGHT_PAREN; i++) {
            tokenArrayList.add(tokens.get(i));
        }
    }


    public String toSpacedString(int i) {
        String s = createSpacedString(i);
        s += "Function Variable Declaration List : ";
        for(Token token : tokenArrayList) {
            s += "\n" + token.toSpacedString(i+1);
        }
        return s;
    }
}
