package malek.parser.addingphase;

import generated.malek.TupulBaseVisitor;
import generated.malek.TupulParser;
import malek.buildtool.printlib.PrintLib;
import malek.parser.addingphase.scope.AddingPhaseScope;
import malek.parser.addingphase.scope.PerRunGlobalScope;
import malek.parser.addingphase.symbol.ConcreteValueType;
import malek.parser.addingphase.symbol.FunctionSymbol;
import malek.parser.addingphase.symbol.ValueType;
import malek.parser.addingphase.symbol.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static malek.buildtool.printlib.Color.RED;

public class ScopeReferencePhase extends TupulBaseVisitor<Object> {
    public ParseTreeProperty<AddingPhaseScope> scopes;
    public PerRunGlobalScope global;
    AddingPhaseScope currentScope;
    Map<String, File> fileMap;
    String currentFileLocation;
    public Map<String, StringBuffer> bufferMap = new HashMap<>();
    public ScopeReferencePhase(ScopeAddingPhase scopeAddingPhase) {
        this.global = scopeAddingPhase.global;
        setCurrentScope(global);
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
        if(!bufferMap.containsKey(scope.getScopeName())) {
            bufferMap.put(scope.getScopeName(), new StringBuffer());
        }
        this.currentScope = scope;
    }
    void resetCurrentScope() {
        bufferMap.get(currentScope.getEnclosingScope().getScopeName()).append(bufferMap.get(currentScope.getScopeName()));
        this.currentScope = currentScope.getEnclosingScope();
    }
    @Override public Object visitTypeDeclaration(TupulParser.TypeDeclarationContext ctx) {
        if(currentScope == global) {
            setCurrentScope(currentScope.getChildScope("'" + currentFileLocation + "'"));
        } else {
            setCurrentScope(currentScope.getChildScope(ctx.fileOrNormalID().getText()));
        }
        System.out.println("Our current scope in this thingy is : " + currentScope.getScopeName());
        appendOutput("struct " + currentScope.getScopeName() + " {");
        visitChildren(ctx);
        appendOutput(" }");
        resetCurrentScope();
        return null;
    }
    @Override public Object visitSingleVarAssignment(TupulParser.SingleVarAssignmentContext ctx) {
        PrintLib.println("assigning variable: " + (currentScope.resolveSymbol(ctx.IDENTIFIER().getText())) + " to: " + ctx.finalValue().getText());
        appendOutput(convertToCCCompatibleIdentifier(currentScope.resolveSymbol(ctx.IDENTIFIER().getText()).toString()));
        appendOutput("=");
        appendOutput(ctx.finalValue().getText());
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
    @Override public Object visitSingleVarDec(TupulParser.SingleVarDecContext ctx) {
        String typeStr = ctx.type().getText();
        System.out.println("type: " + typeStr);
        System.out.println(currentScope.resolveType(typeStr));
        String type = currentScope.resolveType(typeStr).toString();
        for(int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            appendOutput(type + " " + currentScope.resolveSymbol(ctx.IDENTIFIER().get(i).getText()).toString() + ";");
            if(ctx.finalValue(i) != null) {
                appendOutput(currentScope.resolveSymbol(ctx.IDENTIFIER().get(i).getText()) + "=" + ctx.finalValue(i).getText());
            }
        }
        return null;
    }
    void appendOutput(String s) {
        bufferMap.get(currentScope.getScopeName()).append(convertToCCCompatibleIdentifier(s));
    }

    String convertToCCCompatibleIdentifier(String id) {
        id = id.replaceAll("\\.", "_DOT_");
        id = id.replaceAll(":", "_COLON_");
        id = id.replaceAll(";", "_SEMICOLON_");
        id = id.replaceAll("'", "_SINGLE_QUOTE_");
        id = id.replaceAll("-", "_DASH_");
        return id;
    }

//    @Override public Object visitFile(TupulParser.FileContext ctx) {
//        setCurrentScope(getFileScope());
//        PrintLib.println("printing reference scope for: " + currentScope.getScopeName());
//        currentScope.printScope(0);
//        resetCurrentScope();
//        return null;
//    }

}
