package patterns.state;

import patterns.state.animal_observer.Animal;

public class StateApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        for (int i = 0; i < 4; i++) {
            animal.observe();
            animal.onTimePassed();
        }
    }
}
