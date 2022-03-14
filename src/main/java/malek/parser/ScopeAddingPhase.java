package malek.parser;

import generated.malek.TupulBaseVisitor;
import generated.malek.TupulParser;
import malek.parser.scope.FileScope;
import malek.parser.scope.GlobalScope;
import malek.parser.scope.Scope;
import malek.parser.util.FileStore;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;



public class ScopeAddingPhase<T> extends TupulBaseVisitor<T> {
    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    public GlobalScope global;
    Scope currentScope;

    void saveScope(ParserRuleContext context, Scope s) {
        this.scopes.put(context, s);
    }


    @Override public T visitAllMultipleLinkedFiles(TupulParser.AllMultipleLinkedFilesContext ctx) {
        global = new GlobalScope();
        currentScope = global;
        return visitChildren(ctx);
    }
    @Override public T visitFile(TupulParser.FileContext ctx) {
        FileStore fileLocation = new FileStore();
        for(int i = 0; i < ctx.declarePackage().IDENTIFIER().size(); i++) {
            if(i+1 == ctx.declarePackage().IDENTIFIER().size()) {
                fileLocation.fileName = ctx.declarePackage().IDENTIFIER(i).getText();
            } else {
                fileLocation.folders.add(ctx.declarePackage().IDENTIFIER(i).getText());
            }
        }
        FileScope fileScope = new FileScope(fileLocation, currentScope);
        for(TupulParser.ImportSomethingContext thing : ctx.importSomething()) {
            FileStore fileStore = new FileStore();
            for(int i = 0; i < thing.IDENTIFIER().size(); i++) {
                if(i+1 == thing.IDENTIFIER().size()) {
                    fileStore.fileName = thing.IDENTIFIER(i).getText();
                } else {
                    fileStore.folders.add(thing.IDENTIFIER(i).getText());
                }
            }
            fileScope.defineImportedThing(fileStore);
        }
        currentScope = fileScope;
        saveScope(ctx, fileScope);
        T children = visitChildren(ctx);
        currentScope = currentScope.getEnclosingScope();
        return children;
    }




}
