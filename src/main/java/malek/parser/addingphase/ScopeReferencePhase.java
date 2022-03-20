package malek.parser.addingphase;

import generated.malek.TupulBaseVisitor;
import generated.malek.TupulParser;
import malek.buildtool.printlib.Color;
import malek.buildtool.printlib.PrintLib;
import malek.parser.addingphase.scope.AddingPhaseScope;
import malek.parser.addingphase.scope.FileScope;
import malek.parser.addingphase.scope.PerRunGlobalScope;
import malek.parser.addingphase.scope.function.FunctionScope;
import malek.parser.addingphase.symbol.FileLocation;
import malek.parser.addingphase.symbol.FunctionSymbol;
import malek.parser.addingphase.symbol.ValueType;
import malek.parser.addingphase.symbol.VariableSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ScopeReferencePhase extends TupulBaseVisitor<Object> {
    public ParseTreeProperty<AddingPhaseScope> scopes;
    public PerRunGlobalScope global;
    AddingPhaseScope currentScope;
    Map<String, File> fileMap;
    String currentFileLocation;
    public ScopeReferencePhase(ScopeAddingPhase scopeAddingPhase) {
        this.global = scopeAddingPhase.global;
        this.currentScope = global;
        this.scopes = scopeAddingPhase.scopes;
    }
    public void visitFile(ParseTree tree, String s) {
        this.currentFileLocation = s;
        this.visit(tree);
    }
//    AddingPhaseScope getFileScope() {
//        FileScope theScope = this.global.getFileScope(currentFileLocation);
//        System.out.println(theScope);
//        FileScope copiedScope = theScope.clone();
//        System.out.println("global: " + global.getFileScopeNames());
//        return copiedScope;
//    }
    void setCurrentScope(AddingPhaseScope scope) {
        this.currentScope = scope;
    }
    void resetCurrentScope() {
        this.currentScope = currentScope.getEnclosingScope();
    }
    @Override public Object visitTypeDeclaration(TupulParser.TypeDeclarationContext ctx) {
        if(currentScope == global) {
            setCurrentScope(currentScope.getChildScope(currentFileLocation));
        } else {
            setCurrentScope(currentScope.getChildScope(ctx.IDENTIFIER().getText()));
        }
        System.out.println("Our current scope in this thingy is : " + currentScope.getScopeName());
        visitChildren(ctx);
        resetCurrentScope();
        return null;
    }
    @Override public Object visitSingleVarAssignment(TupulParser.SingleVarAssignmentContext ctx) {
        PrintLib.println("assigning variable: " + (currentScope.resolveSymbol(ctx.IDENTIFIER().getText())) + " to: " + ctx.finalValue().getText());
        visitChildren(ctx);
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
        setCurrentScope(currentScope.getChildScope(functionSymbol.getStringRep()));
        visitFunctionCodeBlock(ctx.universalFunctionPost().functionCodeBlock());
        resetCurrentScope();
        return null;
    }

//    @Override public Object visitFile(TupulParser.FileContext ctx) {
//        setCurrentScope(getFileScope());
//        PrintLib.println("printing reference scope for: " + currentScope.getScopeName());
//        currentScope.printScope(0);
//        resetCurrentScope();
//        return null;
//    }

}
