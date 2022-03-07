package malek.scope;

import malek.symbol.Symbol;
import malek.symbol.Type;

import java.util.HashMap;
import java.util.Map;

public class FunctionScope extends Symbol implements Scope {
    Map<String, Symbol> symbols = new HashMap<>();
    Map<String, Type> types = new HashMap<>();
    final Scope enclosingScope;
    int numberOfDefinedVar = 0;
    public FunctionScope(String name, Type type, Scope enclosingScope) {
        super(name, type);
        this.enclosingScope = enclosingScope;
        this.enclosingScope.define(this);
    }
    @Override
    public void incrDefinedVar() {
        numberOfDefinedVar++;
    }

    @Override
    public int getNumDefinedVar() {
        return numberOfDefinedVar;
    }

    @Override
    public String uniqueResolveName(String name) {
        Scope parentScope = this;
        String current = "";
        while(parentScope != null) {
            current += parentScope.getScopeName()+".";
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
        }
        current += type;
        return current;
    }

    @Override
    public String getScopeName() {
        return this.name;
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public void define(Symbol symbol) {
        symbols.put(symbol.name, symbol);
    }



    @Override
    public Symbol resolve(String name) {
        Symbol s = symbols.get(name); // look in this scope
        if ( s!=null ) return s; // return it if in this scope
        if ( enclosingScope != null ) { // have an enclosing scope?
            return enclosingScope.resolve(name); // check enclosing scope
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
        if ( enclosingScope != null ) { // have an enclosing scope?
            return enclosingScope.resolveType(name); // check enclosing scope
        }
        System.err.println("error type : " + name + " does not exist");
        return null; // not found in this scope or there's no scope above
    }

    @Override
    public String toString() {
        String returnS = "";
        returnS += "function : " + name + " type : " + type;
        for(String s : symbols.keySet()) {
            returnS += "[" + symbols.get(s) + "]";
        }
        return returnS;
    }
}
