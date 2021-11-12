package parser.reallylaststage;

import parser.MainParser;
import parser.Token;
import parser.TokenType;
import parser.laststage.BlockType;
import parser.reallylaststage.TokenTypeClasses.CodeBlock;
import parser.reallylaststage.TokenTypeClasses.TokenClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AbstractSyntaxTree {

    /*
    gonna try to do an abstract syntax tree ig.
    a variable assignment has a expression as its child.
    but that expression could start out as a high level expression, then we parse through to figure out what kind
    of expression it is ig, and all the pices and put them together? maybe?

    a wrap of brackets like this { }, means treat this whole thing as on child, and then parse it
    a semicolon means this is a child.

    <function> ::= <exp> ';' //All functions must be exprseions that are ; terminated.
    <function-optional> ::= <function> | NOTHING //so its either a function or nothing.
    <function-optional> ::= <function-optional> <function-optional> //So you can stack functions.
    <bracket-wrap> ::= '{' <function-exp> '}' //So you can group functions.

    <math-operator> ::= '+' | '-' | '/' | '*' | '&' | '&&' | '|' | '||' | '^'
    <exp> ::= <exp> <math-operator> <exp> //So you can do math.
    <exp> ::= '(' <exp> ')' //So you can wrap around parentheeses.
    <exp> ::= <value> //So it can be any value.
    <exp> ::= <const> //Just a raw number.

    <value> ::= <func-identifier> '(' <var-input> ')' //Current function in scope.
    <value> ::= <variable-identifier> //Current variable in scope.
    <value> ::= <object-identifier> '.' <value> //In the case where its not a static method or variable.
    <value> ::= <class-identifier> '.' <value> //In the case where its a static method or variable.




     */
    Map<Token, ArrayList<Token>> mapForAST = new LinkedHashMap<>();
    /*
        We have classes which are just
        <class-dec> ::= 'class' <identifier> <code-block>
        <func-dec> ::= <access-and-static-mod> <return-type> <identifier> '(' <func-var-list> ')' <code-block>

        <mut-access-static-mod> ::= <mutable-opt> <access-opt> <static-type-opt> | <access-opt> <mutable-opt> <static-type-opt> | //You can figure out the rest, its just every combo of these lmao.
        <access-and-static-mod> ::= <access-opt> <static-type-opt> | <static-type-opt> <access-opt>
        <access-opt> ::= <access> | NOTHING
        <static-type-opt> ::= <static-type> | NOTHING
        <mutable-opt> ::= <mutable> | NOTHING
        <mutable> ::= 'mutable' | 'final'

        <access> ::= 'public' | 'protected' | 'private'
        <static-type> ::= 'non-static' | 'static'


        <optional-code-statement> ::= <code-statement> | NOTHING

        <pos-many-code-statement> ::= <optional-code-statement>
        <pos-many-code-statement> ::= <pos-many-code-statement> <pos-many-code-statement>

        <code-block> ::= <optional-code-statement> | '{' <pos-many-code-statement> '}

        <code-statement> ::= <logic-statement> '(' <exp> ')' <code-block>
        <code-statement> ::= <exp> ';'
        <code-statement> ::= <var-dec> ';'
        <code-statement ::= <var-assignment> ';'

        <var-dec> ::= <var-type> <identifier> | <var-type> <identifier> '=' <exp>
        <var-assignment> ::= <identifier> '=' <exp>

        <math-operator> ::= '+' | '-' | '/' | '*' | '&' | '&&' | '|' | '||' | '^' | '<' | '>' | '=='
        <exp> ::= <exp> <math-operator> <exp> //So you can do math.
        <exp> ::= '(' <exp> ')' //So you can wrap around parentheses.
        <exp> ::= <value> //So it can be any value.
        <exp> ::= <const> //Just a raw number.

        //TODO::Later do the whole numbers next to eachother implicitly multiply thing lmao

        <value> ::= <func-identifier> '(' <var-input> ')' //Current function in scope.
        <value> ::= <variable-identifier> //Current variable in scope.
        <value> ::= <object-identifier> '.' <value> //In the case where its not a static method or variable.
        <value> ::= <class-identifier> '.' <value> //In the case where its a static method or variable.

        <logic-statement> ::= 'if' | 'while' | 'else' | 'elif'

     */
    Map<TokenType, ArrayList<Token>> tokenTypeMap = new LinkedHashMap<>();
    ArrayList<TokenClass> tokenClasses = new ArrayList<TokenClass>();
    public void ASTParse(Token tokenStart, ArrayList<Token> tokens) {
        //First we need to figure out what the top level thing is. Lmao
        for(TokenType tokenType : MainParser.TOKEN_TYPES_FOR_ITERATION) {
            tokenTypeMap.put(tokenType, new ArrayList<>());
        }
        for (Token token : tokens) {
            tokenTypeMap.get(token.tokenType).add(token);
        }
        //Now we have a map of all the token types, and all the tokens that are associated with it YAY!
        for(Token token : tokenTypeMap.get(TokenType.CLASS)) {
            System.out.println(token);
            int posOfRightBracket = -2;
            for(int i = token.position+3; tokens.get(i).tokenType != TokenType.RIGHT_BRAC; i++) {
                posOfRightBracket = i;
            }
            posOfRightBracket++;
            tokenClasses.add(new TokenClass(tokens.get(token.position+1), new CodeBlock(tokens.get(token.position+2), tokens.get(posOfRightBracket), tokens)));
            System.out.println(tokenClasses.get(tokenClasses.size()-1));
        }

    }


}

