package idk;

public class State2 {
    public TokenState state;
    public State2 (TokenState state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return state.toString();
    }
    public TokenState get() {
        return state;
    }
}
