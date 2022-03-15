package malek.parser.symbol;

public class InterfaceType implements Type{

    public static InterfaceType type = new InterfaceType();

    @Override
    public String getName() {
        return "Interface";
    }
}
