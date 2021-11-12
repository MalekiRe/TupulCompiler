package parser.reallylaststage.TokenTypeClasses;

import parser.Token;
import parser.reallylaststage.TokenTypeClasses.Function.FunctionCodeStatement;

import java.util.ArrayList;

public class CodeBlock {
    Token start;
    Token end; //where the right and left brackets are essentially.

    /*
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

    ArrayList<FunctionCodeStatement> codeStatements = new ArrayList<>();
    public CodeBlock(Token start, Token end, ArrayList<Token> tokens) {
        this.start = start;
        this.end = end;
        for(int i = start.position; i < end.position; i++) {

        }

    }

    @Override
    public String toString() {
        return "start token is : " + start + ", end token is : " + end;
    }
}
