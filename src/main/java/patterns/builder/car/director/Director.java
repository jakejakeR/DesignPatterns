package patterns.builder.car.director;

import patterns.builder.car.CarType;
import patterns.builder.car.builders.Builder;
import patterns.builder.car.components.Engine;
import patterns.builder.car.components.GPSNavigator;
import patterns.builder.car.components.Transmission;
import patterns.builder.car.components.TripComputer;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore, it may not know what product is
 * being built.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(5.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1.8, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSuv(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.2, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
