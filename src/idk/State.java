package idk;

class State {
    public ParsingState state;
    public State(ParsingState state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return state.toString();
    }
    public ParsingState get() {
        return state;
    }
}
