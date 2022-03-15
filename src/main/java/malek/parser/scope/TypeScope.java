package malek.parser.scope;

import malek.parser.symbol.Type;
import malek.parser.symbol.TypeType;

public class TypeScope extends TypeInterfaceScope{
    public TypeScope(String name, Scope enclosingScope) {
        super(name, TypeType.type, enclosingScope);
    }
}
