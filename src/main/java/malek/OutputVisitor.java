package malek;

import generated.malek.TupulBaseVisitor;
import generated.malek.TupulParser;
import malek.scope.GlobalScope;
import malek.scope.Scope;
import org.antlr.v4.runtime.tree.*;

import static malek.VisitorType.*;

public class OutputVisitor extends TupulBaseVisitor<StringPair> {
    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    public GlobalScope global;
    Scope currentScope;
    protected Integer add(Integer a, Integer b) {
        return a+b;
    }
    protected Integer subtract(Integer a, Integer b) {
        return a-b;
    }
    protected Integer multiply(Integer a, Integer b) {
        return a*b;
    }
    protected Integer divide(Integer a, Integer b) {
        return a/b;
    }
    @Override
    public StringPair visitExpBiOp(TupulParser.ExpBiOpContext ctx) {
        BiOperationFunctionalInterface<Integer> my = null;
        switch (ctx.op.getText()) {
            case "*" : my = this::multiply; break;
            case "+" : my = this::add; break;
            case "-" : my = this::subtract; break;
            case "/" : my = this::divide; break;
        }
//        System.out.println("token text is : " + ctx.op.getText());
//        System.out.println("context is : " + ctx.getText());
//        System.out.println("first half : " + ctx.expression(0).getText());
//        System.out.println("op : " + ctx.op.getText());
//        System.out.println("second half : " + ctx.expression(1).getText());
        if(ctx.expression(0) instanceof TupulParser.ExpNumberContext number1) {
            if(ctx.expression(1) instanceof TupulParser.ExpNumberContext number2) {
                String s = "" + my.run(Integer.parseInt(number1.getText()), Integer.parseInt(number2.getText()));
                //System.out.println("our string is : " + s);
                return StringPair.of(NUM, s);
            }
            StringPair returnPair = new StringPair(null, null);
            StringPair pair = visit(ctx.getChild(1));
            if(pair.first.equals(NUM)) {
                returnPair.first = NUM;
                returnPair.second = "" + my.run(Integer.parseInt(number1.getText()), Integer.parseInt(pair.second));
                return returnPair;
            }
        }
        if(ctx.expression(1) instanceof TupulParser.ExpNumberContext number1) {
            StringPair returnPair = new StringPair(null, null);
            StringPair pair = visit(ctx.getChild(0));
            if(pair.first.equals(NUM)) {
                returnPair.first = NUM;
                returnPair.second = "" + my.run(Integer.parseInt(pair.second), Integer.parseInt(number1.getText()));
                return returnPair;
            }
        }
        if(ctx.expression(0) instanceof TupulParser.ExpBiOpContext exp1) {
            if(ctx.expression(1) instanceof TupulParser.ExpBiOpContext exp2) {
                //System.out.println("VISITING both bi ops");
                StringPair firstNum = visitExpBiOp(exp1);
                StringPair secondNum = visitExpBiOp(exp2);
                if(firstNum.first == NUM) {
                    if(secondNum.first == NUM) {
                        return StringPair.of(NUM, "" + my.run(Integer.parseInt(firstNum.second), Integer.parseInt(secondNum.second)));
                    }
                }
            }
        }

//        System.out.println("UH OHHH");
//        System.out.println("class is : " + ctx.getText());
//        System.out.println("first is : " + ctx.expression(0).getText());
//        System.out.println("seocnd is : " + ctx.expression(1).getText());
        System.err.println("IS VISITING CHILD IS BAD");
        return visitChildren(ctx);
    }

    @Override public StringPair visitExpressionValue(TupulParser.ExpressionValueContext ctx) {
        StringPair pair = ctx.getChild(0).accept(this);
        //System.out.println("my result was " + pair);
        return pair;
    }

    @Override public StringPair visitFunctionDec(TupulParser.FunctionDecContext ctx) {
        StringPair myPair = new StringPair(FUNC_DEC, "");
        myPair.second += "define "
                      + getVarStringType(ctx.functionType().getText())
                      + " @" + ctx.IDENTIFIER();
        myPair.second += visitFunctionDecArgs(ctx.functionDecArgs()).second;
        myPair.second += visitFunctionCode(ctx.functionCode()).second;
        return myPair;
    }

    @Override public StringPair visitFunctionDecArgs(TupulParser.FunctionDecArgsContext ctx) {
        StringPair returnPair = new StringPair(FUNC_DEC_ARGS, "(");
        boolean flag = false;
        for(int i = 0; i < ctx.functionDecArg().size(); i++) {
            if(!(ctx.functionDecArg().size()+1 == i)) {
                returnPair.second += ", ";
            }
            returnPair.second += visitFunctionDecArg(ctx.functionDecArg(i)).second;
        }
        returnPair.second += ")";
        return returnPair;
    }

    @Override public StringPair visitFunctionDecArg(TupulParser.FunctionDecArgContext ctx) {
        StringPair returnPair = new StringPair(FUNC_DEC_ARG, "");
        returnPair.second += currentScope.uniqueResolveTypeName(ctx.variableType().getText()) + "%" + currentScope.uniqueResolveName(ctx.IDENTIFIER().getText());
        return returnPair;
    }

    @Override public StringPair visitFunCodeBlock(TupulParser.FunCodeBlockContext ctx) {
        StringPair myStringPair = StringPair.of(FUNC_CODE_BLOCK, "");
        int n = ctx.getChildCount();
        for (int i=0; i<n; i++) {
            ParseTree c = ctx.getChild(i);
            StringPair childResult = c.accept(this);
            myStringPair.second += childResult.second;
        }
        //myStringPair.second +="";
        return myStringPair;
    }

    @Override public StringPair visitFunctionCode(TupulParser.FunctionCodeContext ctx) {
        StringPair myStringPair = new StringPair(FUNC_CODE, "");
        if(ctx.functionCodeBlock() instanceof TupulParser.FunCodeBlockContext funCodeBlockContext) {
            myStringPair.second = visitFunCodeBlock(funCodeBlockContext).second;
        } else {
            System.out.println("not having brackets");
            myStringPair.second += "{" + ctx.getChild(0).accept(this) + "}";
        }
        return myStringPair;
    }

    @Override public StringPair visitFullFile(TupulParser.FullFileContext ctx) {
        StringPair myPair = StringPair.of(FULL_FILE, "");
        int n = ctx.getChildCount();
        for (int i=0; i<n; i++) {
            ParseTree c = ctx.getChild(i);
            StringPair childResult = c.accept(this);
            myPair.second += childResult.toString();
        }
        return myPair;
    }

    @Override public StringPair visitFuncCodeReturn(TupulParser.FuncCodeReturnContext ctx) {
        StringPair stringPair = new StringPair(RETURN_FUNC, "");
        StringPair returnVisit = visitExpressionValue(ctx.expressionValue());
        if(returnVisit.first == NUM) {
            stringPair.second += "ret i32 " + returnVisit.second;
        } else {
            stringPair.second += returnVisit.second;
        }
        return stringPair;
    }

    @Override
    protected StringPair aggregateResult(StringPair aggregate, StringPair nextResult) {
        System.out.println("agreegating results");
        if(aggregate == null) {
            System.out.println("next result is : " + nextResult);
            return nextResult;
        }
        if(nextResult == null) {
            System.out.println("aggreegate is : " + aggregate);
            return aggregate;
        }
        aggregate.second += nextResult.toString();
        return aggregate;
    }

    protected String getVarStringType(String context) {
        switch (context) {
            case "int" : return "i32";
            case "char" : return "i1";
        }
        System.err.println("error missing var type somehow");
        return "i32 ERROR not actually declared";
    }
    @Override
    public StringPair visitChildren(RuleNode node) {
        System.out.println("AAAAAAAAAAAAA");
        System.out.println("visting children from class : " + node.getClass().getSimpleName());
        StringPair result = defaultResult();
        int n = node.getChildCount();
        for (int i=0; i<n; i++) {
            if (!shouldVisitNextChild(node, result)) {
                break;
            }
            ParseTree c = node.getChild(i);
            StringPair childResult = c.accept(this);
            result = aggregateResult(result, childResult);
        }

        return result;
    }
    @Override
    public StringPair visitErrorNode(ErrorNode node) {
        return StringPair.of(ERROR, "");
    }

    @Override
    public StringPair visitTerminal(TerminalNode node) {
        if(node.getText().equals("<EOF>")) {
            return StringPair.of(EOF, "");
        }
        return StringPair.of(TERMINAL, node.getText());
    }

    @Override
    protected StringPair defaultResult() {
        return StringPair.of(AGGREGATE, "");
    }
}
