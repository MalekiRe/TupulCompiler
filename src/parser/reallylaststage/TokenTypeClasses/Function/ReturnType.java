package parser.reallylaststage.TokenTypeClasses.Function;

import parser.MainParser;
import parser.PrimitiveType;
import parser.Token;
import parser.TokenType;

public class ReturnType {

    ReturnTypeType typeType = ReturnTypeType.CLASS_INSTANCE;

    public ReturnType(Token token) {
        if(token.tokenType == TokenType.VAR_TYPE) {
            if(token.furtherTokenTypes.size() > 0) {
                if(token.furtherTokenTypes.get(1) == TokenType.PRIMITIVE_TYPE) {
                    typeType = ReturnTypeType.PRIMITIVE;
                }
            }
        }
        if(token.str.equals("void")) {
            typeType = ReturnTypeType.VOID;
        }

    }

    public ReturnTypeType getReturnTypeType() {
        return typeType;
    }
}
enum ReturnTypeType {
    PRIMITIVE,
    CLASS_INSTANCE,
    VOID
}
