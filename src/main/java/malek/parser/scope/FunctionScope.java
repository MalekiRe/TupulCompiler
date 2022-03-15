package malek.parser.scope;

import malek.parser.symbol.Symbol;
import malek.parser.symbol.Type;

public class FunctionScope extends NonGlobalSymbolScope {
    final Scope enclosingScope;
    public FunctionScope(String name, Type type, Scope enclosingScope) {
        super(name, type);
        this.enclosingScope = enclosingScope;
        this.enclosingScope.define(this);
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
    public String toString() {
        String returnS = "";
        returnS += "function : " + name + " type : " + type;
        for(String s : symbols.keySet()) {
            returnS += "[" + symbols.get(s) + "]";
        }
        return returnS;
    }
}
