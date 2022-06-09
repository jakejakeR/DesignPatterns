package patterns.factory.cars;

public class Lamborghini extends Car {

    public Lamborghini() {
        this.name = "Lamborghini";
        this.color = Color.YELLOW;
        this.maxSpeed = 299;
    }

    @Override
    public void introduce() {
        System.out.println("This is a Lamborghini.");
    }

    @Override
    public String toString() {
        return "Lamborghini{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
