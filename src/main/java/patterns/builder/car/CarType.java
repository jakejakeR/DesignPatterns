package patterns.builder.car;

/**
 * CarType enumeration
 */
public enum CarType {

    CITY_CAR("city car"),
    SPORTS_CAR("sports car"),
    SUV("suv");

    private final String title;

    CarType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
