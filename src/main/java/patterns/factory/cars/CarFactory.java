package patterns.factory.cars;

/**
 * Factory of cars
 */
public class CarFactory {

    public Car buildCar(CarBrand brand) {
        return brand.getConstructor().get();
    }
}
