package parser;

import java.util.ArrayList;

public class UtilFunc {


    /**
     * @param token  - is the token with the Left Parenthesis
     * @param tokens - the full list of tokens
     * @return - the token that is Right Parenthesis that ends the statement.
     */
    public static Token getEndInclusiveOfParenthesis(Token token, ArrayList<Token> tokens) throws Exception {
        int numberOfParen = 0;
        for (int i = token.position; i < tokens.size(); i++) {
            switch (tokens.get(i).tokenType) {
                case LEFT_PAREN -> numberOfParen++;
                case RIGHT_PAREN -> numberOfParen--;
            }
            if (numberOfParen == 0) {
                return tokens.get(i);
            }
        }
        throw new Exception("getEndInclusiveOfParenthesis failed to find the end of Parenthesis");
    }

    /**
     * @param token  - is the token with the Left Bracket
     * @param tokens - the full list of tokens
     * @return - the token that is Right Bracket that ends the statement.
     */
    public static Token getEndInclusiveOfBrackets(Token token, ArrayList<Token> tokens) throws Exception {
        int numberOfParen = 0;
        for (int i = token.position; i < tokens.size(); i++) {
            switch (tokens.get(i).tokenType) {
                case LEFT_PAREN -> numberOfParen++;
                case RIGHT_PAREN -> numberOfParen--;
            }
            if (numberOfParen == 0) {
                return tokens.get(i);
            }
        }
        throw new Exception("getEndInclusiveOfBrackets failed to find the end of Brackets");
    }

    /**
     * @param token  - is the token we start searching from
     * @param tokens - the full list of tokens
     * @return - the first token that is the Period
     */
    public static Token getToPeriodInclusive(Token token, ArrayList<Token> tokens) throws Exception {
        for (int i = token.position; i < tokens.size(); i++) {
            if(tokens.get(i).tokenType == TokenType.PERIOD) {
                return tokens.get(i);
            }
        }
        throw new Exception("getToPeriodInclusive failed to find period");
    }

    /**
     * @param token  - is the token we start searching from
     * @param tokens - the full list of tokens
     * @return - the first token that is the Period
     */
    public static Token getToCommaInclusive(Token token, ArrayList<Token> tokens) throws Exception {
        for (int i = token.position; i < tokens.size(); i++) {
            if(tokens.get(i).tokenType == TokenType.COMMA) {
                return tokens.get(i);
            }
        }
        throw new Exception("getToCommaInclusive failed to find comma");
    }

    public static Token tryToReachTokenType(Token token, ArrayList<Token> tokens, TokenType type) throws Exception {
        for (int i = token.position; i < tokens.size(); i++) {
            if(type == tokens.get(i).tokenType) {
                return tokens.get(i);
            }
        }
        throw new Exception("tryToReachTokenType failed to find the token");
    }

}
