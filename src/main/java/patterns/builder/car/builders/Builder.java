package patterns.builder.car.builders;

import patterns.builder.car.CarType;
import patterns.builder.car.components.Engine;
import patterns.builder.car.components.GPSNavigator;
import patterns.builder.car.components.Transmission;
import patterns.builder.car.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
