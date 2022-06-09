package patterns.factory.cars;

public class Ferrari extends Car {

    public Ferrari() {
        this.name = "Ferrari";
        this.color = Color.RED;
        this.maxSpeed = 282;
    }

    @Override
    public void introduce() {
        System.out.println("This is a Ferrari.");
    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
