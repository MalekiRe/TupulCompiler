package malek.parser.addingphase;

import generated.malek.TupulBaseVisitor;
import generated.malek.TupulParser;
import malek.buildtool.printlib.PrintLib;
import malek.parser.addingphase.scope.AddingPhaseScope;
import malek.parser.addingphase.scope.FileScope;
import malek.parser.addingphase.scope.PerRunGlobalScope;
import malek.parser.addingphase.symbol.FileLocation;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.File;
import java.util.Arrays;
import java.util.Map;

public class ScopeReferencePhase extends TupulBaseVisitor<Object> {
    public ParseTreeProperty<AddingPhaseScope> scopes;
    public PerRunGlobalScope global;
    AddingPhaseScope currentScope;
    Map<String, File> fileMap;
    FileLocation currentFileLocation;
    public ScopeReferencePhase(ScopeAddingPhase scopeAddingPhase) {
        this.global = scopeAddingPhase.global;
        this.currentScope = global;
        this.scopes = scopeAddingPhase.scopes;
    }
    public void visitFile(ParseTree tree, String s) {
        this.currentFileLocation = new FileLocation(s);
        this.visit(tree);
    }
    AddingPhaseScope getFileScope() {
        FileScope theScope = this.global.getFileScope(currentFileLocation.getFileLocation());
        System.out.println(theScope);
        FileScope copiedScope = theScope.clone();
        System.out.println("global: " + global.getFileScopeNames());
        //Now we have to add all the things that were imported ALSO into the scope.
        for(FileLocation importedFileLocation : theScope.getImportedThings()) {
            System.out.println(importedFileLocation.getFileLocation());
            System.out.println("the files scope actual object: " + global.getFileScope(importedFileLocation.getFileLocation()));
            copiedScope.copySymbolsAndTypes(global.getFileScope(importedFileLocation.getFileLocation()));
        }
        return copiedScope;
    }
    void setCurrentScope(AddingPhaseScope scope) {
        this.currentScope = scope;
    }
    void resetCurrentScope() {
        this.currentScope = currentScope.getEnclosingScope();
    }
    @Override public Object visitFile(TupulParser.FileContext ctx) {
        setCurrentScope(getFileScope());
        PrintLib.println("printing reference scope for: " + currentScope.getScopeName());
        currentScope.printScope(0);
        resetCurrentScope();
        return null;
    }

}
