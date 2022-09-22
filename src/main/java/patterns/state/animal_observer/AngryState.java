package patterns.state.animal_observer;

import lombok.AllArgsConstructor;

/**
 * Implementation of State interface, corresponding to ConcreteState.
 * State objects define when and where their transition to another state happens.
 */
@AllArgsConstructor
public class AngryState implements State {
    private final Animal animal;

    @Override
    public void observe() {
        System.out.println(animal + " is chasing you. Run away!");
    }

    @Override
    public void onStateEntry() {
        System.out.println(animal + " has spotted you.");
    }

    @Override
    public void onTimePassed() {
        animal.setState(new CalmState(animal));
    }
}
