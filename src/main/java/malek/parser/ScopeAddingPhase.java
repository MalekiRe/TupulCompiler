package malek.parser;

import generated.malek.TupulBaseVisitor;
import generated.malek.TupulParser;
import malek.buildtool.printlib.PrintLib;
import malek.parser.exception.ParsingException;
import malek.parser.scope.*;
import malek.parser.util.FileStore;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import static malek.buildtool.printlib.Color.RED;


public class ScopeAddingPhase extends TupulBaseVisitor<Object> {
    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    public GlobalScope global;
    Scope currentScope;

    void saveScope(ParserRuleContext context, Scope s) {
        this.scopes.put(context, s);
    }


    @Override public Object visitAllMultipleLinkedFiles(TupulParser.AllMultipleLinkedFilesContext ctx) {
        global = new GlobalScope();
        currentScope = global;
        return visitChildren(ctx);
    }
    @Override public Object visitFile(TupulParser.FileContext ctx) {
        FileStore fileLocation = new FileStore();
        for(int i = 0; i < ctx.declarePackage().IDENTIFIER().size(); i++) {
            if(i+1 == ctx.declarePackage().IDENTIFIER().size()) {
                fileLocation.fileName = ctx.declarePackage().IDENTIFIER(i).getText();
            } else {
                fileLocation.folders.add(ctx.declarePackage().IDENTIFIER(i).getText());
            }
        }
        FileScope fileScope = new FileScope(fileLocation, global);
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
        if(ctx.interfaceDeclaration() != null) {
            fileScope.defineType(visitInterfaceDeclaration(ctx.interfaceDeclaration()));
        } else {
            fileScope.defineType(visitTypeDeclaration(ctx.typeDeclaration()));
        }
        currentScope = global;
        return null;
    }
    @Override public InterfaceScope visitInterfaceDeclaration(TupulParser.InterfaceDeclarationContext ctx) {
        InterfaceScope interfaceScope = new InterfaceScope(ctx.IDENTIFIER().getText(), currentScope);
        currentScope = interfaceScope;
        visitInterfaceCodeBlock(ctx.interfaceCodeBlock());
        currentScope = interfaceScope.getEnclosingScope();
        return interfaceScope;
    }
    @Override public TypeScope visitTypeDeclaration(TupulParser.TypeDeclarationContext ctx) {
        TypeScope typeScope = new TypeScope(ctx.IDENTIFIER().getText(), currentScope);
        currentScope = typeScope;
        visitTypeCodeBlock(ctx.typeCodeBlock());
        currentScope = typeScope.getEnclosingScope();
        return typeScope;
    }


}
