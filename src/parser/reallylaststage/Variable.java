package parser.reallylaststage;

import parser.PrimitiveType;
import parser.Token;
import parser.TokenType;
import parser.laststage.LastStageMain;

import java.util.ArrayList;

import static parser.PrimitiveType.*;

public class Variable {

    PrimitiveType type;
    String identifier;
    //TODO::Do access level stuff here later as well
    String value;
    boolean isRawValue = false;
    String expressionString = "";
    public Variable(PrimitiveType type, String identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    public Variable(Token token, ArrayList<Token> tokens){
        Token token1 = tokens.get(token.position+1);
        //Token is the Int or Char or wahtever name, and token1 is actually the identifier.
        identifier = token1.str;
        switch (token.furtherTokenTypes.get(token.furtherTokenTypes.size() - 1)) {
            case INT -> type = INT;
            case CHAR -> type = CHAR;
            case DOUBLE -> type = DOUBLE;
            case FLOAT -> type = FLOAT;
            case LONG -> type = LONG;
        }
    }
    public void setValue(Token token, ArrayList<Token> tokens) {
        //At this point token is the identifier of the variable. so if we had "a = 5;" we would be at "a"

        //Gonna have to change this once we use expressions instead of raw values.
        if(tokens.get(token.position + 2).tokenType == TokenType.CONST) {
            this.value = tokens.get(token.position + 2).str;
            isRawValue = true;
        }
        else {
            //TODO::Important, get this working for non const values!
            this.value = tokens.get(token.position + 2).str;
            isRawValue = false;
        }
    }

    public String getDeclarationRep() throws Exception {
        return switch (type) {
            case INT -> "local " + identifier;
            case CHAR -> "local " + identifier + " C";
            case DOUBLE -> "local " + identifier + " d";
            case LONG -> "local " + identifier + " L";
            case FLOAT -> "local " + identifier + " F";
        };
    }

    public String getAssignmentRep() throws Exception {
        switch (type) {
            case INT -> {
                return expressionString + "loadc " + value + "\n setl " + identifier;
            }
            case CHAR -> {
                return expressionString + "loadc " + Character.getNumericValue(value.charAt(1)) + " C\n setl" + identifier + " B";
            }
            case FLOAT -> {
                return expressionString + "loadx " + value + " F\n setl " + identifier + " F";
            }
            case DOUBLE -> {
                return expressionString + "loadc " + value + " d\n setl " + identifier + " D";
            }
            case LONG -> {
                return expressionString + "loadc " + value + " L\n setl " + identifier + " L";
            }
        }
        throw new Exception("tried to get assignment represenation but the type didn't exist, wtf?");
    }

}
