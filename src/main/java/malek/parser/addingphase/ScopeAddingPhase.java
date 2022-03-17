package malek.parser.addingphase;

import generated.malek.TupulBaseVisitor;
import generated.malek.TupulParser;
import malek.buildtool.printlib.PrintLib;
import malek.parser.addingphase.scope.*;
import malek.parser.scope.InterfaceScope;
import malek.parser.scope.TypeScope;
import malek.parser.symbol.*;
import malek.parser.util.FileStore;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static malek.buildtool.printlib.Color.RED;


public class ScopeAddingPhase extends TupulBaseVisitor<Object> {
    public ParseTreeProperty<AddingPhaseScope> scopes = new ParseTreeProperty<>();
    public PerRunGlobalScope global = PerRunGlobalScope.get();
    AddingPhaseScope currentScope;

    void saveScope(ParserRuleContext context, AddingPhaseScope s) {
        this.scopes.put(context, s);
    }
    void setCurrentScope(AddingPhaseScope scope) {
        this.currentScope = scope;
    }
    void resetCurrentScope() {
        this.currentScope = currentScope.getEnclosingScope();
    }
    @Override public Object visitAllMultipleLinkedFiles(TupulParser.AllMultipleLinkedFilesContext ctx) {
        currentScope = global;
        return visitChildren(ctx);
    }
    @Override
    public FileStore visitDeclarePackage(TupulParser.DeclarePackageContext ctx) {
        FileStore.FileStoreBuilder fileStoreBuilder = new FileStore.FileStoreBuilder();
        for(int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            if(i+1 == ctx.IDENTIFIER().size()) {
                fileStoreBuilder.addFileName(ctx.IDENTIFIER(i).getText());
            } else {
                fileStoreBuilder.addFolder(ctx.IDENTIFIER(i).getText());
            }
        }
        return fileStoreBuilder.build();
    }
    @Override
    public FileStore visitImportSomething(TupulParser.ImportSomethingContext ctx) {
        FileStore.FileStoreBuilder fileStoreBuilder = new FileStore.FileStoreBuilder();
        for(int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            if(i+1 == ctx.IDENTIFIER().size()) {
                fileStoreBuilder.addFileName(ctx.IDENTIFIER(i).getText());
            } else {
                fileStoreBuilder.addFolder(ctx.IDENTIFIER(i).getText());
            }
        }
        return fileStoreBuilder.build();
    }
    public FileStore getDeclaredPackage(TupulParser.DeclarePackageContext ctx) {
        return visitDeclarePackage(ctx);
    }
    public FileStore getImportedThing(TupulParser.ImportSomethingContext ctx) {
        return visitImportSomething(ctx);
    }
    @Override public Object visitFile(TupulParser.FileContext ctx) {
        FileStore fileLocation = getDeclaredPackage(ctx.declarePackage());
        FileScope.FileScopeBuilder fileScopeBuilder = new FileScope.FileScopeBuilder();
        fileScopeBuilder.addEnclosingScope(global).addName(fileLocation.fileName);
        List<FileStore> fileStoreList = new ArrayList<>();
        for(TupulParser.ImportSomethingContext importCtx : ctx.importSomething()) {
            fileStoreList.add(getImportedThing(importCtx));
        }
        FileStore[] fileStores = new FileStore[fileStoreList.size()];
        for(int i = 0; i < fileStoreList.size(); i++) {
            fileStores[i] = fileStoreList.get(i);
        }
        fileScopeBuilder.addImportedThings(fileStores);
        FileScope fileScope = fileScopeBuilder.build();
        try {
            global.defineSymbol(fileScope);
        } catch (Exception e) {
            e.printStackTrace();
            PrintLib.println(e.getMessage(), RED);
            return null;
        }
        setCurrentScope(fileScope);
        saveScope(ctx, fileScope);

        resetCurrentScope();
        //currentScope = global;
        return null;
    }

//    @Override public InterfaceScope visitInterfaceDeclaration(TupulParser.InterfaceDeclarationContext ctx) {
//        InterfaceScope interfaceScope = new InterfaceScope(ctx.IDENTIFIER().getText(), currentScope);
//        currentScope = interfaceScope;
//        interfaceScope.addExtendingInterfaces(visitInterfaceExtensions(ctx.interfaceExtensions()));
//        visitInterfaceCodeBlock(ctx.interfaceCodeBlock());
//        currentScope = interfaceScope.getEnclosingScope();
//        saveScope(ctx, interfaceScope);
//        return interfaceScope;
//    }
//    @Override public TypeScope visitTypeDeclaration(TupulParser.TypeDeclarationContext ctx) {
//        TypeScope typeScope = new TypeScope(ctx.IDENTIFIER().getText(), currentScope);
//        currentScope = typeScope;
//        typeScope.addExtendingInterfaces(visitInterfaceExtensions(ctx.interfaceExtensions()));
//        visitTypeCodeBlock(ctx.typeCodeBlock());
//        currentScope = typeScope.getEnclosingScope();
//        saveScope(ctx, typeScope);
//        return typeScope;
//    }
//
//    @Override public List<String> visitInterfaceExtensions(TupulParser.InterfaceExtensionsContext ctx) {
//        List<String> returnList = new ArrayList<>();
//        if(ctx == null || ctx.IDENTIFIER() == null) {
//            return returnList;
//        }
//        returnList.add(ctx.IDENTIFIER().getText());
//        ctx.interfaceExtensionName().forEach((a) -> returnList.add(a.IDENTIFIER().getText()));
//        return returnList;
//    }
//
//    @Override public Object visitSingleVarDec(TupulParser.SingleVarDecContext ctx) {
//        String typeString = ctx.type().getText();
//        Type type = currentScope.resolveType(typeString);
//        for(int i = 0; i < ctx.IDENTIFIER().size(); i++) {
//            currentScope.define(new VariableSymbol(type, ctx.IDENTIFIER().get(i).getText()));
//        }
//        if(ctx.finalValue() != null) {
//            for(TupulParser.FinalValueContext a : ctx.finalValue()) {
//                visitChildren(a);
//            }
//        }
//        return null;
//    }

    @Override public Object visitInterfaceFunctionDeclaration(TupulParser.InterfaceFunctionDeclarationContext ctx) {
        return visitChildren(ctx);
    }



}
