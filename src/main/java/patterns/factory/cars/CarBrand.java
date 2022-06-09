package patterns.factory.cars;

import java.util.function.Supplier;

/**
 * Brand of a car
 */
public enum CarBrand {
    FERRARI(Ferrari::new),
    LAMBORGHINI(Lamborghini::new),
    PORSCHE(Porsche::new);

    private final Supplier<Car> constructor;

    CarBrand(Supplier<Car> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Car> getConstructor() {
        return constructor;
    }
}
