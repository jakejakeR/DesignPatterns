package patterns.builder;

/**
 * Weapon enumeration
 */
public enum Weapon {

    SWORD, AXE, DAGGER, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
