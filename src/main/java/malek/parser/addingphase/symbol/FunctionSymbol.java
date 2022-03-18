package malek.parser.addingphase.symbol;

import malek.buildtool.printlib.PrintLib;

public class FunctionSymbol extends AddingSymbol {
    ValueType[] argumentTypes;
    ValueType[] returnTypes;
    private FunctionSymbol(String name, ValueType[] returnTypes, ValueType[] argumentTypes) {
        super(name, SymbolBuiltInType.FUNCTION);
        this.returnTypes = returnTypes;
        this.argumentTypes = argumentTypes;
    }
    public static class FunctionSymbolBuilder {
        String name;
        ValueType[] types;
        ValueType[] arguments;
        public FunctionSymbolBuilder addName(String name) {
            this.name = name;
            return this;
        }
        public FunctionSymbolBuilder addArguments(ValueType... arguments) {
            this.arguments = arguments;
            return this;
        }
        public FunctionSymbolBuilder addTypes(ValueType... types) {
            this.types = types;
            return this;
        }

        public FunctionSymbol build() {
            PrintLib.println(name);
            PrintLib.println(String.valueOf(types));
            PrintLib.println(String.valueOf(arguments));
            return new FunctionSymbol(name, types, arguments);
        }
    }
    public boolean equals(Object object) {
        if(object instanceof FunctionSymbol) {
            FunctionSymbol functionSymbol = (FunctionSymbol) object;
            if(functionSymbol.argumentTypes.length == argumentTypes.length) {
                if(functionSymbol.returnTypes.length == argumentTypes.length) {
                    for(int i = 0; i < argumentTypes.length; i++) {
                        if(!argumentTypes[i].equals(functionSymbol.argumentTypes[i])) {
                            return false;
                        }
                    }
                    for(int i = 0; i < returnTypes.length; i++) {
                        if(!returnTypes[i].equals(functionSymbol.returnTypes[i])) {
                            return false;
                        }
                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }
    public String toString() {
        return getSymbolType()+":"+getStringRep();
    }
    public String getStringRep() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < returnTypes.length; i++) {
            ValueType valueType = returnTypes[i];
            s.append(valueType.getName());
            if((i+1 < returnTypes.length)) {
                s.append(";");
            }
        }
        s.append(":");
        s.append(getName());
        s.append(":");
        for (int i = 0; i < argumentTypes.length; i++) {
            ValueType valueType = argumentTypes[i];
            s.append(valueType.getName());
            if((i+1 < argumentTypes.length)) {
                s.append(";");
            }
        }
        return s.toString();
    }

}
