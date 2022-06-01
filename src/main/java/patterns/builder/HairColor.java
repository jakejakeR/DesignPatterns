package patterns.builder;

/**
 * HairColor enumeration
 */
public enum HairColor {

    WHITE, BLACK, GREY, BLONDE, BROWN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
