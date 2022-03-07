package malek.symbol;

public class UserDefinedTypeSymbol extends Symbol implements Type{
    public UserDefinedTypeSymbol(String name) {
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
