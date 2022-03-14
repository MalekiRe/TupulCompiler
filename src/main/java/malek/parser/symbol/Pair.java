package malek.parser.symbol;

public class Pair<T, U>{
    public T t;
    public U u;
    public Pair(T t, U u) {
        this.t = t;
        this.u = u;
    }
    public static <T, U> Pair<T, U> of(T t, U u) {
        return new Pair<T, U>(t, u);
    }
}
