package patterns.state;

import patterns.state.animal_observer.Animal;
import patterns.state.animal_observer.CalmState;

public class StateApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setState(new CalmState(animal));

        for (int i = 0; i < 4; i++) {
            animal.observe();
            animal.onTimePassed();
        }
    }
}
