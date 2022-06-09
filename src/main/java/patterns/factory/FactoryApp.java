package patterns.factory;

import patterns.factory.cars.Car;
import patterns.factory.cars.CarBrand;
import patterns.factory.cars.CarFactory;

public class FactoryApp {

    public static void main(String[] args) {

        System.out.println("Factory design pattern practice\r\n");

        CarFactory carFactory = new CarFactory();

        Car ferrari = carFactory.buildCar(CarBrand.FERRARI);
        ferrari.introduce();
        System.out.println(ferrari);

        Car lambo = carFactory.buildCar(CarBrand.LAMBORGHINI);
        lambo.introduce();
        System.out.println(lambo);

        Car porsche = carFactory.buildCar(CarBrand.PORSCHE);
        porsche.introduce();
        System.out.println(porsche);
    }
}
