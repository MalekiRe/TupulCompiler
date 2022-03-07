package malek;

import generated.malek.TupulBaseListener;
import generated.malek.TupulParser;
import malek.scope.GlobalScope;
import malek.scope.Scope;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.semantics.SymbolChecks;

public class RefPhase extends TupulBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    GlobalScope global;
    Scope currentScope;
    public RefPhase(GlobalScope global, ParseTreeProperty<Scope> scopes) {
        this.global = global;
        this.scopes = scopes;
    }
    @Override public void enterFullFile(TupulParser.FullFileContext ctx) {
        this.currentScope = global;
    }


    @Override public void enterFunctionDec(TupulParser.FunctionDecContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override public void exitFunctionDec(TupulParser.FunctionDecContext ctx) {
        currentScope = currentScope.getEnclosingScope();

    }

//    @Override public void exitExpFunction(TupulParser.ExpFunctionContext ctx) {
//        if(currentScope.resolve(ctx.functionCall().IDENTIFIER().getText()) == null) {
//            System.err.println("error function identifier not in scope: " + ctx.functionCall().IDENTIFIER().getText());
//        }
//    }
    @Override public void exitVarAssignment(TupulParser.VarAssignmentContext ctx) {
        if(currentScope.resolve(ctx.IDENTIFIER().getText()) == null) {
            System.err.println("error variable identifier not in scope: " + ctx.IDENTIFIER().getText());
        }
    }
}
