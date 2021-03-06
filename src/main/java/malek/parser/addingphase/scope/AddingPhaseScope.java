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
    Map<String, AddingPhaseScope> getChildScopes();
    Map<String, AddingSymbol> getSymbols();
    Map<String, ValueType> getValueTypes();

    default void addChildScope(AddingPhaseScope scope) {
        addChildScope(scope.getScopeName(), scope);
    }
    default void addChildScope(String s, AddingPhaseScope scope) {
        this.getChildScopes().put(s, scope);
    }
    default AddingPhaseScope getChildScope(String s) {
        AddingPhaseScope current = this;
        while(current != null) {
            if(getChildScopes().get(s) == null) {
                current = current.getEnclosingScope();
            } else {
                return getChildScopes().get(s);
            }
        }
        return null;
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
            if(currentScope == null) {
                return null;
            }
            if(currentScope.getValueTypes().containsKey(name)) {
                return currentScope.getValueTypes().get(name);
            }
            if(currentScope.getValueTypes().containsKey(name.replace(currentScope.getScopeName()+".", "")))
                return currentScope.getValueTypes().get(name.replace(currentScope.getScopeName()+".", ""));
            for(AddingPhaseScope scope : currentScope.getChildScopes().values()) {
                ValueType t = scope.resolveTypeNoUp(name, scope);
                if(t != null) {
                    return t;
                }
            }
//            if(currentScope.getEnclosingScope() != null)
//                System.out.println("going up a level from: " + currentScope.getScopeName() + " to: " + currentScope.getEnclosingScope().getScopeName());
//            else
//                System.out.println("going up a level from True Global to null");
            currentScope = currentScope.getEnclosingScope();
        }
    }
    default ValueType resolveTypeNoUp(String name, AddingPhaseScope currentScope) {
        if(currentScope.getValueTypes().containsKey(name))
            return currentScope.getValueTypes().get(name);
        if(currentScope.getValueTypes().containsKey(name.replace(currentScope.getScopeName()+".", "")))
            return currentScope.getValueTypes().get(name.replace(currentScope.getScopeName()+".", ""));
        for(AddingPhaseScope scope : getChildScopes().values()) {
            ValueType t = scope.resolveTypeNoUp(name, scope);
            if(t != null) {
                return t;
            }
        }
        return null;
    }

    default boolean thisScopeDirectlyContainsSymbol(String name) {
        return getSymbols().containsKey(name);
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
        getChildScopes().values().forEach(addingPhaseScope -> addingPhaseScope.printScope(pos+1));
    }
}
