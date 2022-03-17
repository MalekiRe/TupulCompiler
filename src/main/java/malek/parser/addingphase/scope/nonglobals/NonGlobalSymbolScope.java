package malek.parser.addingphase.scope.nonglobals;

import malek.parser.addingphase.scope.AddingPhaseScope;
import malek.parser.addingphase.symbol.AddingSymbol;
import malek.parser.addingphase.symbol.AddingType;

import java.util.HashMap;
import java.util.Map;

public abstract class NonGlobalSymbolScope extends AddingSymbol implements AddingPhaseScope {
    private final AddingPhaseScope enclosingScope;
    private final Map<String, AddingSymbol> symbols = new HashMap<>();
    private final Map<String, AddingType> types = new HashMap<>();

    protected NonGlobalSymbolScope(String scopeName, AddingPhaseScope enclosingScope) {
        super(scopeName);
        this.enclosingScope = enclosingScope;
    }

    @Override
    public String getScopeName() {
        return getName();
    }

    @Override
    public AddingPhaseScope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public Map<String, AddingSymbol> getSymbols() {
        return symbols;
    }

    @Override
    public Map<String, AddingType> getTypes() {
        return types;
    }
}
