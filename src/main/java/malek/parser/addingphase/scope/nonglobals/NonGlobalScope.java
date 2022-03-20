package malek.parser.addingphase.scope.nonglobals;

import malek.parser.addingphase.scope.AddingPhaseScope;
import malek.parser.addingphase.symbol.AddingSymbol;
import malek.parser.addingphase.symbol.SymbolType;
import malek.parser.addingphase.symbol.ValueType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class NonGlobalScope implements AddingPhaseScope {
    private final String scopeName;
    private final AddingPhaseScope enclosingScope;
    private final Map<String, AddingPhaseScope> childScopes = new HashMap<>();
    private final Map<String, AddingSymbol> symbols = new HashMap<>();
    private final Map<String, ValueType> types = new HashMap<>();

    protected NonGlobalScope(String scopeName, AddingPhaseScope enclosingScope) {
        this.scopeName = scopeName;
        this.enclosingScope = enclosingScope;
        this.enclosingScope.addChildScope(this);
    }

    @Override
    public String getScopeName() {
        return scopeName;
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
    public Map<String, ValueType> getValueTypes() {
        return types;
    }

    @Override
    public Map<String, AddingPhaseScope> getChildScopes() {
        return childScopes;
    }
}
