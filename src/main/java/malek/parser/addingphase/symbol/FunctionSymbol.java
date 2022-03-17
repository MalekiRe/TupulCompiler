package malek.parser.addingphase.symbol;

import malek.parser.scope.FunctionModifier;

public class FunctionSymbol extends AddingSymbol{
    AddingType[] argumentTypes;
    private FunctionSymbol(String name, AddingType[] types, AddingType[] argumentTypes) {
        super(name, types);
        this.argumentTypes = argumentTypes;
    }
    public static class FunctionSymbolBuilder {
        String name;
        AddingType[] types;
        public FunctionSymbolBuilder(String name, AddingType... types) {
            this.name = name;
            this.types = types;
        }
        public FunctionSymbol build(AddingType... argumentTypes) {
            return new FunctionSymbol(name, types, argumentTypes);
        }
    }

}
