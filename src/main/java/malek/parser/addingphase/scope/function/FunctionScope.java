package malek.parser.addingphase.scope.function;

import malek.parser.addingphase.scope.AddingPhaseScope;
import malek.parser.addingphase.scope.nonglobals.NonGlobalScope;
import malek.parser.addingphase.scope.nonglobals.NonGlobalSymbolScope;
import malek.parser.addingphase.symbol.SymbolType;

public class FunctionScope extends NonGlobalScope {
    public FunctionScope(String scopeName, AddingPhaseScope enclosingScope) {
        super(scopeName, enclosingScope);
    }
}
