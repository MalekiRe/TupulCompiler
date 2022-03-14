package malek.parser.symbol;

public class BuiltInTypeSymbol extends Symbol implements Type{
    public BuiltInTypeSymbol(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return getName();
    }
}
