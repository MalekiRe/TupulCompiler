package malek.parser.scope;

import malek.parser.symbol.InterfaceType;
import malek.parser.symbol.Type;

import java.util.ArrayList;
import java.util.List;

public class InterfaceScope extends TypeInterfaceScope {
    public InterfaceScope(String name, Scope enclosingScope) {
        super(name, InterfaceType.type, enclosingScope);
    }

}
