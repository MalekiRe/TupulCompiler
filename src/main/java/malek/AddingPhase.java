package malek;

import generated.malek.TupulBaseListener;
import generated.malek.TupulParser;
import malek.scope.FunctionScope;
import malek.scope.GlobalScope;
import malek.scope.Scope;
import malek.symbol.Type;
import malek.symbol.VariableSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class AddingPhase extends TupulBaseListener {
    public String fileBuilder = "";
    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    public GlobalScope global;
    Scope currentScope;
    @Override public void enterFullFile(TupulParser.FullFileContext ctx) {
        global = new GlobalScope();
        currentScope = global;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFullFile(TupulParser.FullFileContext ctx) {
        global.printGlobalScope();
    }



    @Override public void exitVarDec(TupulParser.VarDecContext ctx) {
        defineVar(ctx.variableType().getText(), ctx.IDENTIFIER().getSymbol());
    }


    @Override public void enterFunctionDec(TupulParser.FunctionDecContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Type type = currentScope.resolveType(ctx.functionType().getText());
        FunctionScope function = new FunctionScope(name, type, currentScope);
        currentScope.define(function);
        saveScope(ctx, function);
        currentScope = function;
    }

    @Override public void exitFunctionDec(TupulParser.FunctionDecContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override public void exitFunctionDecArg(TupulParser.FunctionDecArgContext ctx) {
        defineVar(ctx.variableType().getText(), ctx.IDENTIFIER().getSymbol());
    }

    void defineVar(String varType, Token nameToken) {
        Type type = currentScope.resolveType(varType);
        System.out.println("THIS TYPE IS : " + type);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var); // Define symbol in current scope
    }

    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }
}
