package patterns.state.animal_observer;

import lombok.AllArgsConstructor;

/**
 * Implementation of State interface, corresponding to ConcreteState.
 * State objects define when and where their transition to another state happens.
 */
@AllArgsConstructor
public class CalmState implements State{
    private final Animal animal;
    @Override
    public void observe() {
        System.out.println(animal + " is lying in the grass.");
    }

    @Override
    public void onStateEntry() {
        System.out.println(animal + " calms down and stops.");
    }

    @Override
    public void onTimePassed() {
        animal.setState(new AngryState(animal));
    }
}
