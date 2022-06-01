package patterns.builder;

/**
 * Weapon enumeration
 */
public enum Weapon {

    SWORD, AXE, DAGGER, WAR_HAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
