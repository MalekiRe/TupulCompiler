package main;

public class Pair<T, T1> {
    public T first;
    public T1 second;
    public Pair(T first, T1 second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString() {
        return "first : " + first + ", second : " + second;
    }
}
