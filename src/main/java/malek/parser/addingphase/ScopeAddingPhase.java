package malek.parser.addingphase;

import generated.malek.TupulBaseVisitor;
import generated.malek.TupulParser;
import malek.buildtool.printlib.Color;
import malek.buildtool.printlib.PrintLib;
import malek.parser.addingphase.scope.*;
import malek.parser.addingphase.scope.function.FunctionScope;
import malek.parser.addingphase.scope.typeinterface.InterfaceScope;
import malek.parser.addingphase.scope.typeinterface.TypeScope;
import malek.parser.addingphase.symbol.*;
import malek.parser.addingphase.symbol.VariableSymbol;
import malek.parser.symbol.*;
import malek.parser.util.FileStore;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static malek.buildtool.printlib.Color.RED;


public class ScopeAddingPhase extends TupulBaseVisitor<Object> {
    public ParseTreeProperty<AddingPhaseScope> scopes = new ParseTreeProperty<>();
    public PerRunGlobalScope global = PerRunGlobalScope.get();
    public AddingPhaseScope currentScope;
    Map<String, File> fileMap;
    String currentFileLocation;
    public ScopeAddingPhase(Map<String, File> fileMap) {
        this.fileMap = fileMap;
    }
    public void finishedParsingFile() {
        currentScope = global;
    }
    void saveScope(ParserRuleContext context, AddingPhaseScope s) {
        this.scopes.put(context, s);
    }
    void setCurrentScope(AddingPhaseScope scope) {
        this.currentScope = scope;
    }
    void resetCurrentScope() {
        this.currentScope = currentScope.getEnclosingScope();
    }
    public void visitFile(ParseTree tree, String s) {
        this.currentFileLocation = s;
        this.visit(tree);
    }
    @Override
    public Object visitFile(TupulParser.FileContext ctx) {
        FileScope.FileScopeBuilder fileScopeBuilder = new FileScope.FileScopeBuilder();
        fileScopeBuilder.addEnclosingScope(global);
        fileScopeBuilder.addFileLocation(new FileLocation(currentFileLocation));
        fileScopeBuilder.addName(currentFileLocation);
        List<FileLocation> importedLocations = new ArrayList<>();
        for(TupulParser.ImportSomethingContext importSomethingContext : ctx.importSomething()) {
            String str = importSomethingContext.STRING().getText();
            str = str.substring(1, str.length()-1);
            importedLocations.add(new FileLocation(str));
        }
        fileScopeBuilder.addImportedThings(importedLocations.toArray(new FileLocation[0]));
        FileScope fileScope = fileScopeBuilder.build();
        global.addFileScope(fileScope);
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
        currentScope.defineType(new ConcreteValueType(ctx.IDENTIFIER().getText()));
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
        setCurrentScope(new FunctionScope(functionSymbol.getStringRep(), currentScope));
        visitFunctionCodeBlock(ctx.universalFunctionPost().functionCodeBlock());
        resetCurrentScope();
        return null;
    }

    @Override public Object visitSingleVarDec(TupulParser.SingleVarDecContext ctx) {
        ValueType type = new ConcreteValueType(ctx.type().getText());
        for(int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            if(currentScope.thisScopeDirectlyContainsSymbol(ctx.IDENTIFIER(i).getText())) {
                PrintLib.println("error, identifier: " + ctx.IDENTIFIER(i) + " already declared as: " + currentScope.resolveSymbol(ctx.IDENTIFIER(i).getText()), RED);
                return null;
            }
            currentScope.defineSymbol(new VariableSymbol(ctx.IDENTIFIER().get(i).getText(), type));
        }
        return null;
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
