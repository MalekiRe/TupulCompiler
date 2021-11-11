package main;


import parser.MainParser;

import java.io.*;
import java.util.ArrayList;

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
    public static ArrayList<String> classNames = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        File file = new File(Main.class.getClassLoader().getResource("main/fileTest.txt").getFile());
        String[] tokens = tokenize(readFromInputStream(new FileInputStream(file)));
        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }

        MainParser.parseFile(tokens);

        //First thing we do is we look for the starting token
//        int classPosition = -1;
//        for(int i = 0; i < tokens.length; i++) {
//            if(tokens[i].equals("class")) {
//                classPosition = i;
//                break;
//            }
//        }
//        if(classPosition == -1) {
//            System.out.println("missing class deceleration in file");
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
