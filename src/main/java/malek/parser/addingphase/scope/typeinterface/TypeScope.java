package malek.parser.addingphase.scope.typeinterface;

import malek.parser.addingphase.scope.AddingPhaseScope;

public class TypeScope extends TypeInterfaceScope{
    public TypeScope(String typeName, AddingPhaseScope enclosingScope) {
        super(typeName, enclosingScope);
    }
}
