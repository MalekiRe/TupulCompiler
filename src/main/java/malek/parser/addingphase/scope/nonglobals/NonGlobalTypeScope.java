package malek.parser.addingphase.scope.nonglobals;

import malek.parser.addingphase.scope.AddingPhaseScope;
import malek.parser.addingphase.symbol.AddingSymbol;
import malek.parser.addingphase.symbol.AddingType;
import malek.parser.symbol.Symbol;

import java.util.HashMap;
import java.util.Map;

public abstract class NonGlobalTypeScope extends NonGlobalScope implements AddingType {
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