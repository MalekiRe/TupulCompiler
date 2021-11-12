package parser.reallylaststage.TokenTypeClasses;

import parser.Token;
import parser.TokenType;

import java.util.ArrayList;

public class CodeBlock {
    Token start;
    Token end; //where the right and left brackets are essentially.

    ArrayList<CodeStatement> codeStatements = new ArrayList<>();
    public CodeBlock(Token start, Token end, ArrayList<Token> tokens) {
        this.start = start;
        this.end = end;
        for(int i = start.position; i < end.position; i++) {

        }

    }

    @Override
    public String toString() {
        return "start token is : " + start + ", end token is : " + end;
    }
}
