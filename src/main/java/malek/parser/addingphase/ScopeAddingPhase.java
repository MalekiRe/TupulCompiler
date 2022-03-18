package malek.parser.addingphase;

import generated.malek.TupulBaseVisitor;
import generated.malek.TupulParser;
import malek.buildtool.printlib.Color;
import malek.buildtool.printlib.PrintLib;
import malek.parser.addingphase.scope.*;
import malek.parser.addingphase.scope.typeinterface.InterfaceScope;
import malek.parser.addingphase.scope.typeinterface.TypeScope;
import malek.parser.addingphase.symbol.*;
import malek.parser.addingphase.symbol.VariableSymbol;
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
        if(ctx.typeDeclaration() != null) {
            visitTypeDeclaration(ctx.typeDeclaration());
        } else {
            visitInterfaceDeclaration(ctx.interfaceDeclaration());
        }
        resetCurrentScope();
        return null;
    }

    @Override public Object visitTypeDeclaration(TupulParser.TypeDeclarationContext ctx) {
        currentScope.defineSymbol(getTypeSymbol(ctx));
        currentScope = new TypeScope(ctx.IDENTIFIER().getText(), currentScope);
        //Don't know how to deal with having extended interfaces yet.
        //For now, only adding it if it isn't overrided or implemented.
        visitTypeCodeBlock(ctx.typeCodeBlock());
        resetCurrentScope();
        return null;
    }

    @Override public Object visitInterfaceDeclaration(TupulParser.InterfaceDeclarationContext ctx) {
        currentScope.defineSymbol(getInterfaceSymbol(ctx));
        currentScope = new InterfaceScope(ctx.IDENTIFIER().getText(), currentScope);
        //Don't know how to deal with having extended interfaces yet.
        //For now, only adding it if it isn't overrided or implemented.
        visitInterfaceCodeBlock(ctx.interfaceCodeBlock());
        resetCurrentScope();
        return null;
    }

    private AddingSymbol getInterfaceSymbol(TupulParser.InterfaceDeclarationContext interfaceDeclaration) {
        return new AddingSymbol(interfaceDeclaration.IDENTIFIER().getText(), SymbolBuiltInType.INTERFACE);
    }

    private AddingSymbol getTypeSymbol(TupulParser.TypeDeclarationContext typeDeclaration) {
        return new AddingSymbol(typeDeclaration.IDENTIFIER().getText(), SymbolBuiltInType.TYPE);
    }


    @Override public Object visitInterfaceFunctionDeclaration(TupulParser.InterfaceFunctionDeclarationContext ctx) {
        ValueType[] returnType = ctx.universalFunctionModifiers().typeWithVoid().stream().map(TupulParser.TypeWithVoidContext::getText).map(currentScope::resolveType).collect(Collectors.toList()).toArray(new ValueType[ctx.universalFunctionModifiers().typeWithVoid().size()]);
        ValueType[] argumentsTypes = ctx.universalFunctionPost().universalPostIdentifierFuncDec().functionDecArguments().type().stream().map(TupulParser.TypeContext::getText).map(currentScope::resolveType).collect(Collectors.toList()).toArray(new ValueType[ctx.universalFunctionPost().universalPostIdentifierFuncDec().functionDecArguments().type().size()]);
        FunctionSymbol functionSymbol = new FunctionSymbol.FunctionSymbolBuilder().addArguments(argumentsTypes).addTypes(returnType).addName(ctx.IDENTIFIER().getText()).build();
        if(currentScope.resolveSymbol(functionSymbol.getStringRep()) != null) {
            PrintLib.println("error, function: " + functionSymbol.getName() + " already defined", Color.RED);
            return null;
        }
        currentScope.defineSymbol(functionSymbol.getStringRep(), functionSymbol);
        return null;
    }

    @Override public Object visitTypeFunctionDeclaration(TupulParser.TypeFunctionDeclarationContext ctx) {
        ValueType[] returnType = ctx.universalFunctionModifiers().typeWithVoid().stream().map(TupulParser.TypeWithVoidContext::getText).map(currentScope::resolveType).collect(Collectors.toList()).toArray(new ValueType[ctx.universalFunctionModifiers().typeWithVoid().size()]);
        ValueType[] argumentsTypes;
        if(ctx.universalFunctionPost() == null || ctx.universalFunctionPost().universalPostIdentifierFuncDec() == null || ctx.universalFunctionPost().universalPostIdentifierFuncDec().functionDecArguments() == null || ctx.universalFunctionPost().universalPostIdentifierFuncDec().functionDecArguments().type() == null) {
            argumentsTypes = new ValueType[0];
        } else {
            argumentsTypes = ctx.universalFunctionPost().universalPostIdentifierFuncDec().functionDecArguments().type().stream().map(TupulParser.TypeContext::getText).map(currentScope::resolveType).collect(Collectors.toList()).toArray(new ValueType[ctx.universalFunctionPost().universalPostIdentifierFuncDec().functionDecArguments().type().size()]);
        }
        FunctionSymbol functionSymbol = new FunctionSymbol.FunctionSymbolBuilder().addArguments(argumentsTypes).addTypes(returnType).addName(ctx.universalFunctionPost().universalPostIdentifierFuncDec().IDENTIFIER().getText()).build();
        if(currentScope.resolveSymbol(functionSymbol.getStringRep()) != null) {
            PrintLib.println("error, function: " + functionSymbol.getName() + " already defined", Color.RED);
            return null;
        }
        currentScope.defineSymbol(functionSymbol.getStringRep(), functionSymbol);
        return null;
    }

    @Override public Object visitSingleVarDec(TupulParser.SingleVarDecContext ctx) {
        ValueType type = currentScope.resolveType(ctx.type().getText());
        if(type == null) {
            PrintLib.println("error, unknown type: " + ctx.type().IDENTIFIER().getText() + ", for variable: " + ctx.IDENTIFIER(0).getText());
            return null;
        }
        for(int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            if(currentScope.resolveSymbol(ctx.IDENTIFIER(i).getText()) != null) {
                PrintLib.println("error, identifier: " + ctx.IDENTIFIER(i) + " already declared as: " + currentScope.resolveSymbol(ctx.IDENTIFIER(i).getText()));
                return null;
            }
            currentScope.defineSymbol(new VariableSymbol(ctx.IDENTIFIER().get(i).getText(), type));
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitMultiVarDec(TupulParser.MultiVarDecContext ctx) {
        return visitChildren(ctx);
    }



}
