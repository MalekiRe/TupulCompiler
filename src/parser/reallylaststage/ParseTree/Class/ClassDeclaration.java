package parser.reallylaststage.ParseTree.Class;

import parser.Token;
import parser.TokenType;

import java.util.ArrayList;

public class ClassDeclaration {
    ClassCodeBlock classCodeBlock;
    Token tokenAtBeginningOfDec;
    Token token;

    public ClassDeclaration(Token token, ArrayList<Token> tokens) throws Exception {
        tokenAtBeginningOfDec = token;
        int i = token.position;
        while(tokens.get(i).tokenType == TokenType.ACCESS_MODIFIER) {
            i++;
        }
        i++; //we are skipping over the "class" word here
        this.token = tokens.get(i);
        i += 2; //we are skipping over the identifier/name and the right bracket { here
        classCodeBlock = new ClassCodeBlock(tokens.get(i), tokens);
    }

    @Override
    public String toString() {
        String s ="class name is : " + token.toSpacedString(0) + " , with the class code block : " + classCodeBlock.toSpacedString(2);
        return s;
    }
}
