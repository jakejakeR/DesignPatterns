package patterns.state.animal_observer;

public interface State {
    /**
     * used to observe the current behavior of Animal
     */
    void observe();

    /**
     * invoked when the state changes
     */
    void onStateEntry();

    /**
     * triggers the change of the state
     */
    void onTimePassed();
}
