package parser;

import parser.identifiertoken.IdentifierToken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
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

    public static ArrayList<TokenType> LOGIC_BODY = new ArrayList<>();

    public static ArrayList<TokenType> MATH_OPERATORS = new ArrayList<>();

    public static ArrayList<TokenType> ACCESS_MODIFIERS = new ArrayList<>();

    public static ArrayList<TokenType> ACCESS_LEVELS = new ArrayList<>();

    public static ArrayList<TokenType> MUTABLE_LEVELS = new ArrayList<>();

    public static ArrayList<TokenType> STATIC_LEVELS = new ArrayList<>();

    public static ArrayList<TokenType> TOKEN_TYPES_FOR_ITERATION = new ArrayList<>();

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
        if(type == LOGIC) {
            for(TokenType tokenType : LOGIC_BODY) {
                if(tokenDict.get(tokenType).test(token.str)) {
                    return tokenType;
                }
            }
            throw new Exception("error in parsing LOGIC BODY token type to lower level, is not a lower level, this should never happen, something has gone horribly wrong. MainParser");
        }
        if(type == ACCESS_MODIFIER) {
            for(TokenType tokenType : LOGIC_BODY) {
                if(tokenDict.get(tokenType).test(token.str)) {
                    return tokenType;
                }
            }
            throw new Exception("error in parsing " + type + " token type to lower level, is not a lower level, this should never happen, something has gone horribly wrong. MainParser");
        }
        Optional<TokenType> optionalTokenType = getTokenTypeFromHigherLevel(token, type, STATIC_LEVEL, STATIC_LEVELS);
        if(optionalTokenType.isPresent()) {
            return optionalTokenType.get();
        }
        optionalTokenType = getTokenTypeFromHigherLevel(token, type, MUTABLE_LEVEL, MUTABLE_LEVELS);
        if(optionalTokenType.isPresent()) {
            return optionalTokenType.get();
        }
        optionalTokenType = getTokenTypeFromHigherLevel(token, type, ACCESS_LEVEL, ACCESS_LEVELS);
        if(optionalTokenType.isPresent()) {
            return optionalTokenType.get();
        }
        throw new Exception("error in parsing token type to lower level, is not a lower level of any kind, this should never happen, something has gone horribly wrong. MainParser");
    }

    private static Optional<TokenType> getTokenTypeFromHigherLevel(Token token, TokenType type, TokenType comparison, ArrayList<TokenType> comparisonList) throws Exception {
        if(type == comparison) {
            for(TokenType tokenType : comparisonList) {
                if(tokenDict.get(tokenType).test(token.str)) {
                    return Optional.of(tokenType);
                }
            }
            throw new Exception("error in parsing " + type + " token type to lower level, is not a lower level, this should never happen, something has gone horribly wrong. MainParser");
        }
        return Optional.empty();
    }

    static {
        //We only want to iterate over and compare our list of unkown token types to this higher level list, so for example, we don't get confused and assigne the highest level of token to INT, when it should be VAR_TYPE. both are correct, but VAR_TYPE is more useful and general.
        TOKEN_TYPES_FOR_ITERATION.add(MATH_OPERATOR);
        TOKEN_TYPES_FOR_ITERATION.add(VAR_TYPE);
        TOKEN_TYPES_FOR_ITERATION.add(CONST);
        TOKEN_TYPES_FOR_ITERATION.add(SEMICOLON);
        TOKEN_TYPES_FOR_ITERATION.add(IDENTIFIER);
        TOKEN_TYPES_FOR_ITERATION.add(EQUALS);
        TOKEN_TYPES_FOR_ITERATION.add(LEFT_PAREN);
        TOKEN_TYPES_FOR_ITERATION.add(RIGHT_PAREN);
        TOKEN_TYPES_FOR_ITERATION.add(LEFT_BRAC);
        TOKEN_TYPES_FOR_ITERATION.add(RIGHT_BRAC);
        TOKEN_TYPES_FOR_ITERATION.add(CLASS);
        TOKEN_TYPES_FOR_ITERATION.add(LOGIC);
        TOKEN_TYPES_FOR_ITERATION.add(ACCESS_MODIFIER);

        ACCESS_MODIFIERS.add(STATIC_LEVEL);
        ACCESS_MODIFIERS.add(MUTABLE_LEVEL);
        ACCESS_MODIFIERS.add(ACCESS_LEVEL);

        STATIC_LEVELS.add(STATIC);
        STATIC_LEVELS.add(NON_STATIC);

        ACCESS_LEVELS.add(PROTECTED);
        ACCESS_LEVELS.add(PUBLIC);
        ACCESS_LEVELS.add(PRIVATE);

        MUTABLE_LEVELS.add(MUTABLE);
        MUTABLE_LEVELS.add(FINAL);


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
        MATH_OPERATORS.add(LESS_THAN);
        MATH_OPERATORS.add(GREATER_THAN);
        MATH_OPERATORS.add(EQUALS_EQUALS);

        LOGIC_BODY.add(IF);
        LOGIC_BODY.add(ELSE);
        LOGIC_BODY.add(ELIF);
        LOGIC_BODY.add(WHILE);

        tokenDict.put(LONG, (str) -> str.equals("long"));
        tokenDict.put(CHAR, (str) -> str.equals("char"));
        tokenDict.put(INT, (str) -> str.equals("int"));
        tokenDict.put(FLOAT, (str) -> str.equals("float"));
        tokenDict.put(DOUBLE, (str) -> str.equals("double"));
        tokenDict.put(SEMICOLON, (str) -> str.equals(";"));
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

        tokenDict.put(MATH_OPERATOR, (str) -> {
            for(TokenType type : MATH_OPERATORS)
                if(tokenDict.get(type).test(str))
                    return true;
            return false;
        });

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

        tokenDict.put(LEFT_BRAC, (str) -> str.equals("{"));
        tokenDict.put(RIGHT_BRAC, (str) -> str.equals("}"));
        tokenDict.put(LOGIC, (str) -> {
            for(TokenType type : LOGIC_BODY)
                if(tokenDict.get(type).test(str))
                    return true;
            return false;
        });
        //tokenDict.put(LOGIC, (str) -> tokenDict.get(IF).test(str) || tokenDict.get(WHILE).test(str) || tokenDict.get(ELIF).test(str) || tokenDict.get(ELSE).test(str));
        tokenDict.put(IF, (str) -> str.equals("if"));
        tokenDict.put(ELSE, (str) -> str.equals("else"));
        tokenDict.put(ELIF, (str) -> str.equals("elif"));
        tokenDict.put(WHILE, (str) -> str.equals("while"));
        tokenDict.put(CLASS, (str) -> str.equals("class"));
        tokenDict.put(LESS_THAN, (str) -> str.equals("<"));
        tokenDict.put(GREATER_THAN, (str)-> str.equals(">"));
        tokenDict.put(EQUALS_EQUALS, (str) -> str.equals("=="));

        tokenDict.put(IDENTIFIER, (str) -> {
            if(!Character.isAlphabetic(str.charAt(0)))
                return false;
            if(tokenDict.get(LOGIC).test(str))
                return false;
            if(tokenDict.get(PRIMITIVE_TYPE).test(str))
                return false;
            if(tokenDict.get(CLASS).test(str))
                return false;
            if(tokenDict.get(ACCESS_MODIFIER).test(str))
                return false;
            return true;
        });//make sure to do this check last.

        tokenDict.put(ACCESS_MODIFIER, (str) -> tokenDict.get(MUTABLE_LEVEL).test(str) || tokenDict.get(STATIC_LEVEL).test(str) || tokenDict.get(ACCESS_LEVEL).test(str));
        tokenDict.put(MUTABLE_LEVEL, (str) -> tokenDict.get(MUTABLE).test(str) || tokenDict.get(FINAL).test(str));
        tokenDict.put(STATIC_LEVEL, (str) -> tokenDict.get(STATIC).test(str) || tokenDict.get(NON_STATIC).test(str));
        tokenDict.put(ACCESS_LEVEL, (str) -> tokenDict.get(PUBLIC).test(str) || tokenDict.get(PROTECTED).test(str) || tokenDict.get(PRIVATE).test(str));

        tokenDict.put(MUTABLE, (str) -> str.equals("mutable"));
        tokenDict.put(FINAL, (str) -> str.equals("final"));
        tokenDict.put(STATIC, (str) -> str.equals("static"));
        tokenDict.put(NON_STATIC, (str) -> str.equals("nonstatic"));
        tokenDict.put(PUBLIC, (str) -> str.equals("public"));
        tokenDict.put(PROTECTED, (str) -> str.equals("protected"));
        tokenDict.put(PRIVATE, (str) -> str.equals("private"));

        higherLevelTokens.add(ACCESS_MODIFIER);
        higherLevelTokens.add(MATH_OPERATOR);
        higherLevelTokens.add(CONST);
        higherLevelTokens.add(PRIMITIVE_TYPE);
        higherLevelTokens.add(VAR_TYPE);
        higherLevelTokens.add(LOGIC);

    }


    public static ArrayList<Token> parseFile(String[] tokens) throws Exception {
        ArrayList<Token> tokenIDS = new ArrayList<>();
        for(int i = 0; i < tokens.length; i++) {
            TokenType type = null;
            for(TokenType tokenType : TOKEN_TYPES_FOR_ITERATION) {
                if(tokenDict.get(tokenType).test(tokens[i])) {
                    type = tokenType;
                    break;
                }
            }
            if(type == IDENTIFIER) {
                tokenIDS.add(new IdentifierToken(tokens[i], i, type));
            }
            else {
                tokenIDS.add(new Token(tokens[i], i, type));
            }
        }
     //   for(Token token : tokenIDS) {
            //StringBuilder printString = new StringBuilder("token is : " + token.str + " , with position : " + token.position + " , and type : " + token.tokenType);
          //  for(TokenType type : token.furtherTokenTypes) {
               // printString.append(" , lower type is : ").append(type);
          //  }
            //System.out.println(printString);
       // }
        return tokenIDS;
    }
}
