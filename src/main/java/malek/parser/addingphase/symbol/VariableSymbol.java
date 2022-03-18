package malek.parser.addingphase.symbol;

public class VariableSymbol extends AddingSymbol{
    ValueType type;
    public VariableSymbol(String name, ValueType type) {
        super(name, SymbolBuiltInType.VARIABLE);
        this.type = type;
    }
    public ValueType getType() {
        return type;
    }
    @Override
    public String toString() {
        return getSymbolType()+":"+getType()+":"+getName();
    }
}
