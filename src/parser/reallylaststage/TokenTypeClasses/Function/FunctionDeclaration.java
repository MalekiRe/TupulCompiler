package parser.reallylaststage.TokenTypeClasses.Function;

import parser.Token;
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

    public FunctionDeclaration(Token token, ArrayList<Token> tokens) {
        this.token = token;
        returnTypeToken = tokens.get(token.position-1);
        //returnType = new ReturnType(tokens.get(token.position-1));
    }


    //TODO::implement this lmao
    public void setFunctionModifiers(ArrayList<Token> tokens) {

    }
}
