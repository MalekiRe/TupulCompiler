package parser.laststage;

import parser.Token;
import parser.TokenType;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class LastStageMain {
    public static Map<BlockType, BiPredicate<Token, ArrayList<Token>>> tokenBlockTypeMap = new LinkedHashMap<>();


    static {
        tokenBlockTypeMap.put(BlockType.VAR_DEC, LastStageMain::isVariableDec);
        tokenBlockTypeMap.put(BlockType.VAR_ASSIGNMENT, LastStageMain::isVariableAssignment);
        tokenBlockTypeMap.put(BlockType.EXP, LastStageMain::isExp);
    }
    static Map<String, Token> declaredVars = new HashMap<>();
    public static String getStringRepresentation(Token token, ArrayList<Token> tokens, BlockType type) throws Exception {
        if(type == BlockType.VAR_DEC) {
            Token token2 = tokens.get(token.position+1);
            declaredVars.put(token2.str, token2);
            switch (token.furtherTokenTypes.get(token.furtherTokenTypes.size() - 1)) {
                case INT:
                    return "local " + token2.str;
                case CHAR :
                    return "local " + token2.str + "C";
                case DOUBLE:
                    return "local " + token2.str + "d";
                case LONG:
                    return "local " + token2.str + "L";
                case FLOAT:
                    return "local " + token2.str + "F";
            }
        }
        if(type == BlockType.VAR_ASSIGNMENT) {
            switch (declaredVars.get(token.str).furtherTokenTypes.get(declaredVars.get(token.str).furtherTokenTypes.size() - 1)) {
                case INT:
                    return "loadc " + tokens.get(token.position+2).str
                            + "\n" + "setl " + token.str;
                case CHAR :
                    //Do the char conversion idk how to do it yet lmao
                    return "loadc " + Character.getNumericValue(tokens.get(token.position+2).str.charAt(1)) + "B"
                            + "\n" + "setl " + token.str;
                case DOUBLE:
                    return "loadc " + tokens.get(token.position+2).str + "d"
                            + "\n" + "setl " + token.str;
                case LONG:
                    return "loadc " + tokens.get(token.position+2).str + "L"
                            + "\n" + "setl " + token.str;
                case FLOAT:
                    return "loadx " + tokens.get(token.position+2).str + "F"
                            + "\n" + "setl " + token.str;
            }
        }
        if(type == BlockType.EXP) {
            if(token.tokenType == TokenType.CONST) {
                if(token.furtherTokenTypes.get(0) == TokenType.CHAR_CONST) {
                    return token.str.substring(1, token.str.length()-2);
                }
                return token.str;
            }
        }

        throw new Exception("Error, tried to get the string represantion of a token using its block type, but failed to find a match in LastStageMain getStringRepresentation");
    }

    public static boolean isSemicolonEndedExp(Token token, ArrayList<Token> tokens) {
        /*
            <math-operator> ::= '+' | '-' | '/' | '*' | '&' | '&&' | '|' | '||' | '^'
            <semicolon-ended-exp> ::= <exp> ';'
            <exp> ::= <exp> <math-operator> <exp>
            <exp> ::= '(' <exp> ')'
            <exp> ::= <const>
            <exp> ::= <identifier>
         */
        for(int i = token.position; i < tokens.size(); i++) {
            System.out.println("h");
            Token itToken = tokens.get(i);
            if(itToken.tokenType == TokenType.SEMICOLON) {
                return i != token.position;
            }
            if(!isExp(itToken, tokens)) {
                System.out.println("isn't expression : " + tokens.get(i));
                return false;
            }
            //can add some divide by zero error checking here lmao

        }
        return true;
    }
    public static boolean isExp(Token token, ArrayList<Token> tokens) {
        /*
            <math-operator> ::= '+' | '-' | '/' | '*' | '&' | '&&' | '|' | '||' | '^'
            <semicolon-ended-exp> ::= <exp> ';'
            <exp> ::= <exp> <math-operator> <exp>
            <exp> ::= '(' <exp> ')'
            <exp> ::= <const>
            <exp> ::= <identifier>
         */
        Optional<Token> token1;
        Optional<Token> token2;
        if(token.tokenType == TokenType.IDENTIFIER || token.tokenType == TokenType.CONST) {
            token1 = getSafeToken(tokens, token.position+1);
            if(token1.isPresent()) {
                if(token1.get().tokenType == TokenType.IDENTIFIER
                        || token1.get().tokenType == TokenType.SEMICOLON
                        || token1.get().tokenType == TokenType.LEFT_PAREN
                        || token1.get().tokenType == TokenType.RIGHT_PAREN
                        || token1.get().tokenType == TokenType.MATH_OPERATOR ) {
                    return true;
                }
                else {
                    return false;
                }
            }
            return false;
        }
        if(token.tokenType == TokenType.MATH_OPERATOR) {
            token1 = getSafeToken(tokens, token.position-1);
            token2 = getSafeToken(tokens, token.position+1);
            if(token1.isPresent() && token2.isPresent()) {
                //This should work, but i want to do it a differnet way.
                //Instead we will check if it is a math operator, and if it is just return false. else do is expression on the left and right thing.
                if(token1.get().tokenType == TokenType.MATH_OPERATOR || token2.get().tokenType == TokenType.MATH_OPERATOR) {
                    return false;
                }
                return isExp(token1.get(), tokens) && isExp(token2.get(), tokens);
//                if(token1.get().tokenType == TokenType.IDENTIFIER || token2.get().tokenType == TokenType.IDENTIFIER) {
//                    return true;
//                }
//                if(token1.get().tokenType == TokenType.LEFT_PAREN || token2.get().tokenType == TokenType.LEFT_PAREN) {
//                    return true;
//                }
//                if(token1.get().tokenType == TokenType.RIGHT_PAREN || token2.get().tokenType == TokenType.RIGHT_PAREN) {
//                    return true;
//                }
            }
        }
        //This may cause an infinte loop, idk lmao
        //TODO::check if this can cause an infinte loop.
        if(token.tokenType == TokenType.LEFT_PAREN) {
            for(int i = token.position; i < tokens.size(); i++) {
                if(tokens.get(i).tokenType == TokenType.RIGHT_PAREN) {
                    return true;
                }
                if(!isExp(tokens.get(i), tokens)) {
                    return false;
                }
            }
        }
        //This may cause an infinte loop, idk lmao
        //TODO::check if this can cause an infinte loop.
        if(token.tokenType == TokenType.RIGHT_PAREN) {
            for(int i = token.position; i != 0; i--) {
                //This check MAY be unessecary, but idk.
                if(tokens.get(i).tokenType == TokenType.SEMICOLON) {
                    return false;
                }
                if(tokens.get(i).tokenType == TokenType.LEFT_PAREN) {
                    return true;
                }
                if(!isExp(tokens.get(i), tokens)) {
                    return false;
                }
            }
        }

        return false;


    }
    public static boolean isVariableAssignment(Token token, ArrayList<Token> tokens) {
        if(token.tokenType == TokenType.IDENTIFIER) {
            Optional<Token> token1 = getSafeToken(tokens, token.position+1);
            if(token1.isPresent() && token1.get().tokenType == TokenType.EQUALS) {
                token1 = getSafeToken(tokens, token.position+2);
                if(token1.isPresent()) {
                    return isSemicolonEndedExp(token1.get(), tokens);
                }
            }
        }
        return false;
    }
    public static boolean isVariableDec(Token token, ArrayList<Token> tokens) {
        //What calculations we can do to be assured that something is a variable decleration.
        // All variable decelerations have the type in front, there is nothing that has a type in front that isn't a variable decleeration.
        /*
        <primitive-type> ::= 'int' | 'char' | 'double' | 'float' | 'long'

        <var-type> ::= <primitive-type>

        <identifier> ::= any combo of a-z and 0-9 any amount of times if the first character is not a number.

        <const> ::= [0-9]* | '[a-Z]' | [0-9]*.[0-9]* | [0-9]*.[0-9]* 'f'

        <variable-dec> :: = <var-type> <identifier> ';'
        <variable-dec> ::= <var-type> <identifier> '=' <const> ';'
        <variable-dec> ::= <var-type> <identifier> '=' <identifier> ';'

         */
        if(token.tokenType == TokenType.VAR_TYPE) {
            Optional<Token> token1 = getSafeToken(tokens, token.position+1);
            if(token1.isPresent()) {
                if(token1.get().tokenType == TokenType.IDENTIFIER) {
                    System.out.println("WAS IDENTIFIER");
                    token1 = getSafeToken(tokens, token.position+2);
                    if(token1.isPresent() && token1.get().tokenType == TokenType.EQUALS) {
                        System.out.println("had equals");
                        token1 = getSafeToken(tokens, token.position+3);
                        if(token1.isPresent()) {
                            System.out.println("token1 was present");
                            //TODO::this should be good, but maybe there is a way to do this that doesn't nessecarly properly declare a variable
                            if(isSemicolonEndedExp(token1.get(), tokens)) {
                                System.out.println("was semicolon ended expression");
                                return true;
                            }
                        }
                    }
                    else if(token1.isPresent() && token1.get().tokenType == TokenType.SEMICOLON) {
                        System.out.println("RETURNS TRUE");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static Optional<Token> getSafeToken(ArrayList<Token> tokens, int position) {
        if(position > tokens.size()) {
            return Optional.empty();
        }
        return Optional.of(tokens.get(position));
    }
}
