package malek.parser.scope;

import malek.parser.symbol.Symbol;
import malek.parser.symbol.Type;

public interface Scope {
    public String getScopeName();
    public Scope getEnclosingScope();
    public void define(Symbol symbol);
    public Symbol resolve(String name);
    public void defineType(Type type);
    public Type resolveType(String name);
    public String uniqueResolveName(String name);
    public String uniqueResolveTypeName(String type);
    /*
    public Symbol resolve(String name) {
        Symbol s = members.get(name); // look in this scope
        if ( s!=null ) return s; // return it if in this scope
        if ( enclosingScope != null ) { // have an enclosing scope?
            return enclosingScope.resolve(name); // check enclosing scope
        }
        return null; // not found in this scope or there's no scope above
    }
     */
}
