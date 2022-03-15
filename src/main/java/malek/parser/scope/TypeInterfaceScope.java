package malek.parser.scope;

import malek.parser.symbol.Symbol;
import malek.parser.symbol.Type;

public class TypeInterfaceScope extends NonGlobalScope implements Type {
    Scope enclosingScope;
    String name;
    Type type;
    public TypeInterfaceScope(String name, Type type, Scope enclosingScope) {
        this.name = name;
        this.type = type;
        this.enclosingScope = enclosingScope;
    }

    @Override
    public String getScopeName() {
        return name;
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[name: " + name + "]";
    }
}
