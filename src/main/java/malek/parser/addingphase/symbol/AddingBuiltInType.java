package malek.parser.addingphase.symbol;

public class AddingBuiltInType implements AddingType{
    final String name;
    public AddingBuiltInType(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
