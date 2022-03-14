package malek.parser;

public class StringPair {
    VisitorType first;
    String second;
    public StringPair(VisitorType first, String second) {
        this.first = first;
        this.second = second;
    }
    public static StringPair of(VisitorType first, String second) {
        return new StringPair(first, second);
    }
    public String toString() {
        return "[first: " + first + ", second: " + second + "]";
    }
}
