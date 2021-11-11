package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

import static parser.TokenType.*;
import static parser.TokenType.CHAR_CONST;

public class MainParser {
    /*
    <primitive-type> ::= 'int' | 'char' | 'double' | 'float' | 'long'

    <var-type> ::= <primitive-type>

    <identifier> ::= any combo of a-z and 0-9 any amount of times if the first character is not a number.

    <const> ::= [0-9]* | '[a-Z]' | [0-9]*.[0-9]* | [0-9]*.[0-9]* 'f'

    <variable-dec> :: = <var-type> <identifier> ';'
    <variable-dec> ::= <var-type> <identifier> '=' <const> ';'
    <variable-dec> ::= <var-type> <identifier> '=' <identifier> ';'



     */
    public static Map<TokenType, Predicate<String>> tokenDict = new HashMap<>();

    public static ArrayList<TokenType> higherLevelTokens = new ArrayList<>();

    public static ArrayList<TokenType> constTokenTypes = new ArrayList<>();

    public static ArrayList<TokenType> primitiveTokenTypes = new ArrayList<>();

    public static ArrayList<TokenType> MATH_OPERATORS = new ArrayList<>();

    public static TokenType determineFurtherTokenType(Token token, TokenType type) throws Exception {
        if(type == CONST) {
            for(TokenType tokenType : constTokenTypes) {
                if(tokenDict.get(tokenType).test(token.str)) {
                    return tokenType;
                }
            }
            throw new Exception("error in parsing Const token type to lower level, is not a lower level, this should never happen, something has gone horribly wrong. MainParser");
        }
        if(type == VAR_TYPE) {
            if(tokenDict.get(PRIMITIVE_TYPE).test(token.str)) {
                return PRIMITIVE_TYPE;
            }
            throw new Exception("error in parsing VAR_TYPE token type to lower level, is not a lower level, this should never happen, something has gone horribly wrong. MainParser");
        }
        if(type == PRIMITIVE_TYPE) {
            for(TokenType tokenType : primitiveTokenTypes) {
                if(tokenDict.get(tokenType).test(token.str)) {
                    return tokenType;
                }
            }
            throw new Exception("error in parsing Primitive token type to lower level, is not a lower level, this should never happen, something has gone horribly wrong. MainParser");
        }
        if(type == MATH_OPERATOR) {
            for(TokenType tokenType : MATH_OPERATORS) {
                if(tokenDict.get(tokenType).test(token.str)) {
                    return tokenType;
                }
            }
            throw new Exception("error in parsing Math Operator token type to lower level, is not a lower level, this should never happen, something has gone horribly wrong. MainParser");
        }
        throw new Exception("error in parsing token type to lower level, is not a lower level of any kind, this should never happen, something has gone horribly wrong. MainParser");
    }

    static {
        constTokenTypes.add(CHAR_CONST);
        constTokenTypes.add(DOUBLE_CONST);
        constTokenTypes.add(INT_CONST);
        constTokenTypes.add(FLOAT_CONST);
        constTokenTypes.add(LONG_CONST);

        primitiveTokenTypes.add(INT);
        primitiveTokenTypes.add(CHAR);
        primitiveTokenTypes.add(LONG);
        primitiveTokenTypes.add(FLOAT);
        primitiveTokenTypes.add(DOUBLE);

        MATH_OPERATORS.add(ADD);
        MATH_OPERATORS.add(DIVIDE);
        MATH_OPERATORS.add(SUBTRACT);
        MATH_OPERATORS.add(MULTIPLY);
        MATH_OPERATORS.add(CARET);
        MATH_OPERATORS.add(AND);
        MATH_OPERATORS.add(BITWISE_AND);
        MATH_OPERATORS.add(OR);
        MATH_OPERATORS.add(BITWISE_OR);

        tokenDict.put(LONG, (str) -> str.equals("long"));
        tokenDict.put(CHAR, (str) -> str.equals("char"));
        tokenDict.put(INT, (str) -> str.equals("int"));
        tokenDict.put(FLOAT, (str) -> str.equals("float"));
        tokenDict.put(DOUBLE, (str) -> str.equals("double"));
        tokenDict.put(SEMICOLON, (str) -> str.equals(";"));
        tokenDict.put(IDENTIFIER, (str) -> Character.isAlphabetic(str.charAt(0)));//make sure to do this check last.
        tokenDict.put(VAR_TYPE, (str) -> tokenDict.get(PRIMITIVE_TYPE).test(str));
        tokenDict.put(PRIMITIVE_TYPE, (str) -> tokenDict.get(LONG).test(str) || tokenDict.get(CHAR).test(str) || tokenDict.get(INT).test(str) || tokenDict.get(FLOAT).test(str) || tokenDict.get(DOUBLE).test(str));
        tokenDict.put(EQUALS, (str) -> str.equals("="));
        tokenDict.put(CONST, (str) -> tokenDict.get(LONG_CONST).test(str) || tokenDict.get(CHAR_CONST).test(str) || tokenDict.get(INT_CONST).test(str) || tokenDict.get(FLOAT_CONST).test(str) || tokenDict.get(DOUBLE_CONST).test(str));
        tokenDict.put(CHAR_CONST, (str) -> {
           //Need to implement two character but one char actual things like \n, \t, etc.
            return (str.charAt(0) == '\'' && str.charAt(2) == '\'') ||  (str.charAt(0) == '\'' && str.charAt(1) == '\'');
        });
        tokenDict.put(INT_CONST, (str) -> {
           for(char Char : str.toCharArray())
               if(!Character.isDigit(Char))
                   return false;
           return true;
        });
        tokenDict.put(FLOAT_CONST, (str) -> {
           for(int i = 0; i < str.length()-1; i++) {
               if(!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.') {
                   return false;
               }
               if(str.charAt(i) == '.') {
                   for (int i2 = i + 1; i2 < str.length(); i2++) {
                       if (!Character.isDigit(str.charAt(i2)))
                           return false;
                   }
                   return str.charAt(str.length() - 1) == 'f';
               }
           }
            return false;
        });
        tokenDict.put(DOUBLE_CONST, (str) -> {
            for(int i = 0; i < str.length(); i++) {
                if(!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.') {
                    return false;
                }
                if(str.charAt(i) == '.') {
                    for (int i2 = i + 1; i2 < str.length(); i2++) {
                        if (!Character.isDigit(str.charAt(i2)))
                            return false;
                    }
                    return true;
                }
            }
            return false;
        });
        tokenDict.put(LONG_CONST, (str) -> tokenDict.get(INT_CONST).test(str));

        tokenDict.put(AND, (str) -> str.equals("&&") || str.equals("and"));
        tokenDict.put(OR, (str) -> str.equals("||") || str.equals("or"));
        tokenDict.put(BITWISE_AND, (str) -> str.equals("&"));
        tokenDict.put(BITWISE_OR, (str) -> str.equals("|"));
        tokenDict.put(ADD, (str) -> str.equals("+"));
        tokenDict.put(DIVIDE, (str) -> str.equals("/"));
        tokenDict.put(MULTIPLY, (str) -> str.equals("*"));
        tokenDict.put(SUBTRACT, (str) -> str.equals("-"));
        tokenDict.put(CARET, (str) -> str.equals("^"));
        tokenDict.put(LEFT_PAREN, (str) -> str.equals("("));
        tokenDict.put(RIGHT_PAREN, (str) -> str.equals(")"));

        tokenDict.put(MATH_OPERATOR, (str) -> {
           return (MATH_OPERATORS.contains(str));
        });

        higherLevelTokens.add(MATH_OPERATOR);
        higherLevelTokens.add(CONST);
        higherLevelTokens.add(PRIMITIVE_TYPE);
        higherLevelTokens.add(VAR_TYPE);
    }


    public static ArrayList<Token> parseFile(String[] tokens) throws Exception {
        ArrayList<Token> tokenIDS = new ArrayList<>();
        for(int i = 0; i < tokens.length; i++) {
            TokenType type = null;
            for(TokenType tokenType : TokenType.values()) {
                if(tokenDict.get(tokenType).test(tokens[i])) {
                    type = tokenType;
                    break;
                }
            }
            tokenIDS.add(new Token(tokens[i], i, type));
        }
        for(Token token : tokenIDS) {
            StringBuilder printString = new StringBuilder("token is : " + token.str + " , with position : " + token.position + " , and type : " + token.tokenType);
            for(TokenType type : token.furtherTokenTypes) {
                printString.append(" , lower type is : ").append(type);
            }
            System.out.println(printString);
        }
        return tokenIDS;
    }
}
