package malek.parser;

import generated.malek.TupulBaseVisitor;
import generated.malek.TupulParser;
import malek.buildtool.printlib.PrintLib;
import malek.parser.scope.*;
import malek.parser.symbol.Type;
import malek.parser.symbol.VariableSymbol;
import malek.parser.util.FileStore;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

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
        try {
            global.defineFileScope(fileScope);
        } catch (Exception e) {
            e.printStackTrace();
            PrintLib.println(e.getMessage(), RED);
            return null;
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
        interfaceScope.addExtendingInterfaces(visitInterfaceExtensions(ctx.interfaceExtensions()));
        visitInterfaceCodeBlock(ctx.interfaceCodeBlock());
        currentScope = interfaceScope.getEnclosingScope();
        saveScope(ctx, interfaceScope);
        return interfaceScope;
    }
    @Override public TypeScope visitTypeDeclaration(TupulParser.TypeDeclarationContext ctx) {
        TypeScope typeScope = new TypeScope(ctx.IDENTIFIER().getText(), currentScope);
        currentScope = typeScope;
        typeScope.addExtendingInterfaces(visitInterfaceExtensions(ctx.interfaceExtensions()));
        visitTypeCodeBlock(ctx.typeCodeBlock());
        currentScope = typeScope.getEnclosingScope();
        saveScope(ctx, typeScope);
        return typeScope;
    }

    @Override public List<String> visitInterfaceExtensions(TupulParser.InterfaceExtensionsContext ctx) {
        List<String> returnList = new ArrayList<>();
        if(ctx == null || ctx.IDENTIFIER() == null) {
            return returnList;
        }
        returnList.add(ctx.IDENTIFIER().getText());
        ctx.interfaceExtensionName().forEach((a) -> returnList.add(a.IDENTIFIER().getText()));
        return returnList;
    }

    @Override public Object visitSingleVarDec(TupulParser.SingleVarDecContext ctx) {
        String typeString = ctx.type().getText();
        Type type = currentScope.resolveType(typeString);
        for(int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            currentScope.define(new VariableSymbol(type, ctx.IDENTIFIER().get(i).getText()));
        }
        if(ctx.finalValue() != null) {
            for(TupulParser.FinalValueContext a : ctx.finalValue()) {
                visitChildren(a);
            }
        }
        return null;
    }


    @Override public Object visitFunctionCodeBlock(TupulParser.FunctionCodeBlockContext ctx) {

        return null;

    }

}
