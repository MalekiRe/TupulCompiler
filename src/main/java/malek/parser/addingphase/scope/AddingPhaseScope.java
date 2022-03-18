package malek.parser.addingphase.scope;

import malek.buildtool.printlib.Color;
import malek.buildtool.printlib.PrintLib;
import malek.parser.addingphase.symbol.AddingSymbol;
import malek.parser.addingphase.symbol.SymbolType;
import malek.parser.addingphase.symbol.ValueType;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;


public interface AddingPhaseScope {
    String getScopeName();
    AddingPhaseScope getEnclosingScope();
    Set<AddingPhaseScope> getChildScopes();
    Map<String, AddingSymbol> getSymbols();
    Map<String, ValueType> getValueTypes();

    default void addChildScope(AddingPhaseScope scope) {
        this.getChildScopes().add(scope);
    }

    default void defineSymbol(AddingSymbol symbol) {
        this.defineSymbol(symbol.getName(), symbol);
    }
    default void defineSymbol(String name, AddingSymbol symbol) {
        if(this.getSymbols().containsKey(name)) {
            PrintLib.println("Error, symbol: " + symbol + " already defined", Color.RED);
        }
        this.getSymbols().put(symbol.getName(), symbol);
    }
    default void defineType(ValueType type) {
        if(this.getValueTypes().containsKey(type.getName())) {
            PrintLib.println("Error, type: " + type + " already defined", Color.RED);
        }
        getValueTypes().put(type.getName(), type);
    }
    default AddingSymbol resolveSymbol(String name) {
        AddingPhaseScope currentScope = this;
        while(currentScope != null) {
            if(currentScope.getSymbols().containsKey(name)) {
                return currentScope.getSymbols().get(name);
            }
            currentScope = currentScope.getEnclosingScope();
        }
        return null;
    }
    default ValueType resolveType(String name) {
        AddingPhaseScope currentScope = this;
        while(true) {
            if(currentScope == null)
                return null;
            if(currentScope.getValueTypes().containsKey(name))
                return currentScope.getValueTypes().get(name);
            currentScope = currentScope.getEnclosingScope();
        }
    }

    default void defineSymbols(AddingSymbol ...symbols) {
        Arrays.stream(symbols).forEach(this::defineSymbol);
    }

    default void defineTypes(SymbolType...types) {
        Arrays.stream(types).forEach(this::defineTypes);
    }

    default void printScope(int pos) {
        PrintLib.println(PrintLib.spacing(pos)+"Scope Name: " + getScopeName(), pos);
        PrintLib.println(PrintLib.spacing(pos)+"Types", pos);
        getValueTypes().keySet().forEach((str) -> PrintLib.println(PrintLib.spacing(pos+1)+str, pos));
        PrintLib.println(PrintLib.spacing(pos)+"Symbols", pos);
        getSymbols().keySet().forEach((str) -> PrintLib.println(PrintLib.spacing(pos+1)+getSymbols().get(str), pos));
        PrintLib.println(PrintLib.spacing(pos)+"Children", pos+1);
        getChildScopes().forEach(addingPhaseScope -> addingPhaseScope.printScope(pos+1));
    }
}
