package main;


import parser.MainParser;
import parser.Token;
import parser.TokenType;
import parser.identifiertoken.IdentifierToken;
import parser.identifiertoken.IdentifierType;
import parser.reallylaststage.ParseTree.Function.FunctionDeclaration;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    /*
    Tokens : =, {, }, (, ), -, +, /, *, ==, &&, &, ||, |, !, new, function, ;, :,
    <literal> any literal value such a 1, 2, true, "hi"

    Nonterminals :

    <exp> : an expression
    <keyword> : a keyword
    <function> : any sort of process or function
    <logic body> : if, else, while, for loops.

    Literal Variables
    <literal-type> ::= 'int' | 'double' | 'float' | 'long' | 'string' | 'char'

    <object-type> ::= <literal-type> | <class-identifier>

    Math

    <exp> ::= <exp> + <exp>
    <exp> ::= <exp> * <exp>
    <exp> ::= <exp> - <exp>
    <exp> ::= <exp> / <exp>
    <exp> ::= <exp> == <exp>
    <exp> ::= !<exp>
    <exp> ::= '(' <exp> ')'
    <exp> ::= <literal>
    <exp> ::= <func-identifier> '(' <func-var> ')' ';'
    <exp> ::= <class-func-identifier> '(' <func-var> ')' ';'

    Logic


    <logic-body> ::= <if> | <else if> | <else> | <for> | <while>

    <if> ::= 'if' '(' <exp> ')' '{' <function> '}'

    <else if> ::= <if> 'else if' '(' <exp> ')' '{' <function> '}'

    <else> ::= <if> '{' <function> '}' | <else if> '{' <function> '}'


    <while> ::= 'while' '(' <exp> ')' '{' <function> '}'

    <for> ::= 'for' '(' <function> ';' <exp> ';' <function> ')' '{' <function> '}'


    Function


    <function> ::=

    <function> ::= <function> <function>

    <function> ::= <exp> ';'

    <function> ::= <func-identifier> '(' <func-var> ')' ';'

    <function> ::= <class-func-identifier> '(' <func-var> ')' ';'

    <function> ::= <logic-body> <function>

    <function> ::= <variable-dec>

    <function> ::= <variable-assignment>

    <function> ::= <func-dec>


    Keywords

    <mutable> ::= 'static' | 'mutable'
    <access> ::= 'public' | 'protected' | 'private'
    <return-type> ::= <literal-type> | <class-name>


    <mutable-optional> ::= <mutable> |
    <access-optional> ::= <access> |

    <implements-optional> ::= 'implements' <interface-duplicate> |
    <interface-duplicate> ::= <interface-identifier> ',' <interface-duplicate> | <interface-identifier>

    <extends-optional> ::= 'extends' <class-identifier> |

    <value-identifier> ::= <variable-identifier> | <func-identifier> '(' <func-var> ')' | <class-func-identifier> '(' <func-var> ')'


    Function Declaration

    <func-identifier> ::= <identifier> | 'this' '.' <identifier>

    <func-line> ::= <mutable-optional> <access-optional> <return-type> <identifier> | <access-optional> <mutable-optional> <return-type> <identifier>

    <func-var-dec> ::= <func-var-dec> ',' <func-var-dec>
    <func-var-dec> ::=
    <func-var-dec> ::= <class-name> <identifier> | <literal-type> <identifier>

    <func-dec> :: = <func-line> '(' <func-var-dec> ')' '{' <function> '}'

    <func-var> ::= <object-type> ',' <func-var> | <object-type> |


    Class Declaration

    <class-identifier> ::= <identifier>
    <class-func-identifier> ::= <class-identifier> '.' <func-identifier>
    <class-var-identifier> ::= <class-identifier> '.' <variable-identifier>

    <class-line-first> ::= <mutable-optional> <access-optional> 'Class' <identifier> | <access-optional> <mutable-optional> 'Class' <identifier>

    <class-dec> ::= <class-line-first> <extends-optional> <implements-optional> '{' <function> '}'

    Variable Declaration

    <variable-identifier> ::= <identifier> | 'this' '.' <identifier>

    <variable-dec> ::= <object-type> <identifier> ';'
    <variable-dec> ::= <object-type> <identifier> '=' <exp> ';'
    <variable-dec> ::= <object-type> <identifier> '=' <func-identifier> '(' <func-var> ')' ';'
    <variable-dec> ::= <object-type> <identifier> '=' <variable-identifier> ';'
    <variable-dec> ::= <object-type> <identifier> '=' <class-func-identifier> '(' <func-var> ')' ';'
    <variable-dec> ::= <object-type> <identifier> '=' <class-var-identifier> ';'


    <variable-assignment> ::= <object-type> <identifier> ';'
    <variable-assignment> ::= <object-type> <identifier> '=' <exp> ';'
    <variable-assignment> ::= <object-type> <identifier> '=' <func-identifier> '(' <func-var> ')' ';'
    <variable-assignment> ::= <object-type> <identifier> '=' <variable-identifier> ';'
    <variable-assignment> ::= <object-type> <identifier> '=' <class-func-identifier> '(' <func-var> ')' ';'
    <variable-assignment> ::= <object-type> <identifier> '=' <class-var-identifier> ';'
    <variable-assignment> ::= <variable-identifier> '=' <value-identifier> ';'

     */
    //public static ArrayList<String> classNames = new ArrayList<>();

    public static IdentifierType getIdentifierType(Token token, ArrayList<Token> tokens) {
        if(tokens.get(token.position-1).tokenType == TokenType.CLASS) {
            return IdentifierType.CLASS;
        }
        if(tokens.get(token.position+1).tokenType == TokenType.LEFT_PAREN) {
            return IdentifierType.FUNCTION;
        }
        return IdentifierType.VARIABLE;
    }



    public static Map<TokenType, ArrayList<Token>> tokenTypeMap = new LinkedHashMap<>();
    public static Map<Token, Pair<Token, Token>> tokenPairMap = new LinkedHashMap<>();
    public static void main(String[] args) throws Exception {
        File file = new File(Main.class.getClassLoader().getResource("main/fileTest.txt").getFile());
        String[] tokens1 = tokenize(readFromInputStream(new FileInputStream(file)));
        for(int i = 0; i < tokens1.length; i++) {
            System.out.println(tokens1[i]);
        }

        ArrayList<Token> tokens = MainParser.parseFile(tokens1);



        for(TokenType type : TokenType.values()) {
            tokenTypeMap.put(type, new ArrayList<>());
        }

        for(Token token : tokens) {
            tokenTypeMap.get(token.tokenType).add(token);
            for(TokenType type : token.furtherTokenTypes) {
                tokenTypeMap.get(type).add(token);
            }
        }

        //Get Identifier Context
        for(Token token : tokenTypeMap.get(TokenType.IDENTIFIER)) {
            ((IdentifierToken)token).identifierType = getIdentifierType(token, tokens);
        }

        for(Token token : tokens) {
            System.out.println(token);
        }
        System.out.println("token : " + tokens.get(4));
        FunctionDeclaration functionDeclaration = new FunctionDeclaration(tokens.get(4), tokens);
        System.out.println(functionDeclaration);
//        FunctionCodeBlock functionCodeBlock = new FunctionCodeBlock(tokens.get(7), tokens);
//        for(FunctionCodeStatement codeStatement : functionCodeBlock.functionCodeStatements) {
//            System.out.println(codeStatement);
//        }





        //For now we will simply do stuff based on semicolons, will have to change when we implement classes and functions
//        ArrayList<Pair<Integer, Integer>> pairOfIntegers = new ArrayList<Pair<Integer, Integer>>();
//        ArrayList<Integer> positionsAfterSemicolons = new ArrayList<>();
//        int first = 0;
//        for(int i = 0; i < tokens.size(); i++) {
//            if(tokens.get(i).tokenType == TokenType.SEMICOLON) {
//                positionsAfterSemicolons.add(first+1);
//                first = i;
//            }
//        }



        //Map<Token, BlockType> blockTypes = new LinkedHashMap<>();
//        for(int i = 0; i < positionsAfterSemicolons.size(); i++) {
//            System.out.println("first token is : " + tokens.get(positionsAfterSemicolons.get(i)));
//            for(BlockType blockType : BlockType.values()) {
//                if(LastStageMain.tokenBlockTypeMap.get(blockType).test(tokens.get(positionsAfterSemicolons.get(i)), tokens)) {
//                    blockTypes.put(tokens.get(i), blockType);
//                    break;
//                }
//            }
//        }
//        for(int i = 0; i < tokens.size(); i++) {
//            for(BlockType blockType : BlockType.values()) {
//                if(LastStageMain.tokenBlockTypeMap.get(blockType).test(tokens.get(i), tokens)) {
//                    blockTypes.put(tokens.get(i), blockType);
//                    break;
//                }
//            }
//        }
//        AbstractSyntaxTree startNode = new AbstractSyntaxTree();
//        startNode.ASTParse(tokens.get(0), tokens);

        //Here we print stuff out.
        //System.out.println("\n\n\n Printing out Assigned Blocks");

//        for(Token token : blockTypes.keySet()) {
//            System.out.println("token : " + token + " , is of type : " + blockTypes.get(token));
//        }
//
//        Map<String, Type> inScopeThings = new HashMap<>();
//        Map<String, Token> mapBetweenStringsAndTokens = new HashMap<>();
//        Map<String, Variable> mapBetweenStringsAndVariables = new HashMap<>();
//        for(Token token : blockTypes.keySet()) {
//            mapBetweenStringsAndTokens.put(token.str, token);
//            if(blockTypes.get(token) == BlockType.VAR_DEC) {
//                inScopeThings.put(tokens.get(token.position+1).str, Type.VARIABLE);
//                mapBetweenStringsAndVariables.put(tokens.get(token.position+1).str, new Variable(token, tokens));
//                System.out.println(mapBetweenStringsAndVariables.get(tokens.get(token.position+1).str).getDeclarationRep());
//            }
//            if(blockTypes.get(token) == BlockType.VAR_ASSIGNMENT) {
//                if(!inScopeThings.containsKey(token.str)) {
//                    throw new Exception("TRIED TO REFRENCE OUT OF SCOPE VALUE : " + token.str +", at position : " + token.position);
//                }
//                mapBetweenStringsAndVariables.get(token.str).setValue(token, tokens);
//                System.out.println(mapBetweenStringsAndVariables.get(token.str).getAssignmentRep());
//            }
//            //Have to figure out later how to determine if the thing is out of scope, also shadowing need to be figured out.
//        }
        //System.out.println("\n priting the actual bytecode now");
//        for(Token token : blockTypes.keySet()) {
//            if(blockTypes.get(token) != BlockType.EXP) {
//                System.out.println(LastStageMain.getStringRepresentation(token, tokens, blockTypes.get(token)));
//            }
//        }



    }


    private static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

    public static String[] tokenize (String input) {
        String[] result = input.split("\\r?\\s+");

        return result;
    }
}
