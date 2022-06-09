package patterns.factory.cars;

public class Porsche extends Car {

    public Porsche() {
        this.name = "Porsche";
        this.color = Color.BLUE;
        this.maxSpeed = 240;
    }

    @Override
    public void introduce() {
        System.out.println("This is a Porsche.");
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
