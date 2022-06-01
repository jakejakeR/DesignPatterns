package patterns.builder;

import patterns.builder.car.Car;
import patterns.builder.car.CarType;
import patterns.builder.car.Manual;
import patterns.builder.car.builders.CarBuilder;
import patterns.builder.car.builders.CarManualBuilder;
import patterns.builder.car.components.Engine;
import patterns.builder.car.components.Transmission;
import patterns.builder.car.director.Director;
import patterns.builder.hero.*;

public class BuilderApp {

    public static void main(String[] args) {

        //region Hero builder

        System.out.println("* Hero builder *");
        Hero warrior = new Hero.Builder("Ragnar", Profession.WARRIOR)
                .addHairType(HairType.SHORT)
                .addHairColor(HairColor.BROWN)
                .addArmor(Armor.CHAIN_MAIL)
                .addWeapon(Weapon.AXE)
                .addSkill(Skill.LEADERSHIP)
                .build();
        System.out.println(warrior.toString());

        //endregion

        System.out.println();

        //region Car builder

        System.out.println("* Car builder *");
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car ferrari = builder.getResult();
        System.out.println("Car built: " + ferrari.getCarType().toString());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual ferrariManual = manualBuilder.getResult();
        System.out.println("\nFerrari manual built: ");
        System.out.println(ferrariManual.print());

        System.out.println();

        // Building a car without director
        CarBuilder myCarBuilder = new CarBuilder();
        myCarBuilder.setCarType(CarType.SUV);
        myCarBuilder.setSeats(5);
        myCarBuilder.setEngine(new Engine(5.7, 3021));
        myCarBuilder.setTransmission(Transmission.AUTOMATIC);

        Car dodgeRam = myCarBuilder.getResult();
        System.out.println(dodgeRam.getCarType().toString());

        CarManualBuilder myManualBuilder = new CarManualBuilder();
        myManualBuilder.setCarType(CarType.SUV);
        myManualBuilder.setSeats(5);
        myManualBuilder.setEngine(new Engine(5.7, 3021));
        myManualBuilder.setTransmission(Transmission.AUTOMATIC);

        Manual dodgeRamManual = myManualBuilder.getResult();
        System.out.println("\nDodge RAM manual built: ");
        System.out.println(dodgeRamManual.print());

        //endregion

        System.out.println();
    }
}
