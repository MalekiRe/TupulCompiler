package malek.parser.scope;

import malek.parser.symbol.Symbol;
import malek.parser.symbol.Type;

import java.util.HashMap;
import java.util.Map;

public abstract class NonGlobalSymbolScope extends Symbol implements Scope {
    Map<String, Symbol> symbols = new HashMap<>();
    Map<String, Type> types = new HashMap<>();

    public NonGlobalSymbolScope(String name, Type type) {
        super(name, type);
    }

    public NonGlobalSymbolScope(String name) {
        super(name);
    }


    Map<String, Type> getTypesMap() {
        return types;
    }

    Map<String, Symbol> getSymbolsMap() {
        return symbols;
    }

    @Override
    public String uniqueResolveName(String name) {
        Scope parentScope = this;
        String current = "";
        while(parentScope != null) {
            current += parentScope.getScopeName()+".";
            parentScope = parentScope.getEnclosingScope();
        }
        current += name;
        return current;
    }

    @Override
    public String uniqueResolveTypeName(String type) {
        Scope parentScope = this;
        String current = "";
        while(parentScope != null) {
            current += parentScope.getScopeName()+".";
            parentScope = parentScope.getEnclosingScope();
        }
        current += type;
        return current;
    }



    @Override
    public void define(Symbol symbol) {
        symbols.put(symbol.name, symbol);
    }



    @Override
    public Symbol resolve(String name) {
        Symbol s = symbols.get(name); // look in this scope
        if ( s!=null ) return s; // return it if in this scope
        if ( getEnclosingScope() != null ) { // have an enclosing scope?
            return getEnclosingScope().resolve(name); // check enclosing scope
        }
        System.err.println("error symbol : " + name + " does not exist");
        return null; // not found in this scope or there's no scope above
    }

    @Override
    public void defineType(Type type) {
        types.put(type.getName(), type);
    }

    @Override
    public Type resolveType(String name) {
        Type s = types.get(name); // look in this scope
        if ( s!=null ) return s; // return it if in this scope
        if ( getEnclosingScope() != null ) { // have an enclosing scope?
            return getEnclosingScope().resolveType(name); // check enclosing scope
        }
        System.err.println("error type : " + name + " does not exist");
        return null; // not found in this scope or there's no scope above
    }

}
