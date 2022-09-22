package patterns.state.animal_observer;

public interface State {
    /**
     * Used to observe the current behavior of Animal
     */
    void observe();

    /**
     * Invoked when the state changes
     */
    void onStateEntry();

    /**
     * Triggers the change of the state
     */
    void onTimePassed();
}
