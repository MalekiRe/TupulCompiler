package malek.parser.symbol;

public class TypeType implements Type {

    public static TypeType type = new TypeType();

    @Override
    public String getName() {
        return "Type";
    }
}
