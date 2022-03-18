package malek.parser.addingphase.scope.nonglobals;

import malek.parser.addingphase.scope.AddingPhaseScope;
import malek.parser.addingphase.symbol.SymbolType;

public abstract class NonGlobalTypeScope extends NonGlobalScope implements SymbolType {
    final String typeName;
    protected NonGlobalTypeScope(String typeName, String scopeName, AddingPhaseScope enclosingScope) {
        super(scopeName, enclosingScope);
        this.typeName = typeName;
    }

    @Override
    public String getName() {
        return typeName;
    }
}