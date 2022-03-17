package malek.parser.addingphase.scope;

import malek.buildtool.printlib.Color;
import malek.buildtool.printlib.PrintLib;
import malek.parser.addingphase.symbol.AddingSymbol;
import malek.parser.addingphase.symbol.AddingType;
import malek.parser.scope.Scope;
import malek.parser.symbol.Symbol;
import malek.parser.symbol.Type;

import java.util.Arrays;
import java.util.Map;


public interface AddingPhaseScope {
    String getScopeName();
    AddingPhaseScope getEnclosingScope();
    Map<String, AddingSymbol> getSymbols();
    Map<String, AddingType> getTypes();

    default void defineSymbol(AddingSymbol symbol) {
        if(this.getSymbols().containsKey(symbol.getName())) {
            PrintLib.println("Error, symbol: " + symbol + " already defined", Color.RED);
        }
        this.getSymbols().put(symbol.getName(), symbol);
    }
    default void defineType(AddingType type) {
        if(this.getTypes().containsKey(type.getName())) {
            PrintLib.println("Error, type: " + type + " already defined", Color.RED);
        }
        getTypes().put(type.getName(), type);
    }
    default AddingSymbol resolveSymbol(String name) {
        AddingPhaseScope currentScope = this;
        while(currentScope != null) {
            if(getSymbols().containsKey(name)) {
                return getSymbols().get(name);
            }
            currentScope = currentScope.getEnclosingScope();
        }
        return null;
    }
    default AddingType resolveType(String name) {
        AddingPhaseScope currentScope = this;
        while(currentScope != null) {
            if(getTypes().containsKey(name)) {
                return getTypes().get(name);
            }
            currentScope = currentScope.getEnclosingScope();
        }
        return null;
    }

    default void defineSymbols(AddingSymbol ...symbols) {
        Arrays.stream(symbols).forEach(this::defineSymbol);
    }

    default void defineTypes(AddingType ...types) {
        Arrays.stream(types).forEach(this::defineTypes);
    }

    default void printScope(int pos) {
        PrintLib.println(PrintLib.spacing(pos)+"Scope Name: " + getScopeName(), pos);
        PrintLib.println(PrintLib.spacing(pos)+"Types", pos);
        getTypes().keySet().stream().forEach((str) -> PrintLib.println(PrintLib.spacing(pos+1)+str, pos));
        PrintLib.println(PrintLib.spacing(pos)+"Symbols", pos);
        getSymbols().keySet().stream().forEach((str) -> PrintLib.println(PrintLib.spacing(pos+1)+str, pos));
        PrintLib.println(PrintLib.spacing(pos)+"Children", pos+1);
        getSymbols().values().stream().filter((addingSymbol -> addingSymbol instanceof AddingPhaseScope))
                .map(addingSymbol -> (AddingPhaseScope)addingSymbol).forEach(addingPhaseScope -> addingPhaseScope.printScope(pos+1));
    }
}
