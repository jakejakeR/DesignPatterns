package patterns.state.animal_observer;

/**
 * Corresponds to Context
 */
public class Animal {

    State state;

    public void observe() {
        state.observe();
    }

    public void onTimePassed() {
        state.onTimePassed();
    }

    public void setState(State state) {
        if (this.state == null) {
            this.state = state; // no announcement on initial assignment
        } else {
            this.state = state;
            this.state.onStateEntry();
        }
    }

    @Override
    public String toString() {
        return "Animal";
    }
}
