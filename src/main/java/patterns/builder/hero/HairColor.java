package patterns.builder.hero;

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
