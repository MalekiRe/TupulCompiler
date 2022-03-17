package malek.parser.addingphase.scope;

import malek.parser.addingphase.symbol.AddingBuiltInType;
import malek.parser.addingphase.symbol.AddingSymbol;
import malek.parser.addingphase.symbol.AddingType;
import malek.parser.addingphase.symbol.FunctionSymbol;

import java.util.*;

public class TrueGlobalScope implements AddingPhaseScope {
    final Map<String, AddingType> types = new HashMap<>();
    final Map<String, AddingSymbol> symbols = new HashMap<>();
    final String[] builtInTypes = {"int", "string", "char", "float", "double", "bool", "void"};
    final String scopeName = "TrueGlobal";
    static TrueGlobalScope trueGlobalScope = new TrueGlobalScope();
    protected TrueGlobalScope() {
        Arrays.stream(builtInTypes).forEach((str) -> defineType(new AddingBuiltInType(str)));
        defineSymbol(new FunctionSymbol.FunctionSymbolBuilder("print", types.get("void")).build(types.get("string")));
    }
    public static TrueGlobalScope get() {
        return trueGlobalScope;
    }
    @Override
    public String getScopeName() {
        return scopeName;
    }

    @Override
    public AddingPhaseScope getEnclosingScope() {
        return null;
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
