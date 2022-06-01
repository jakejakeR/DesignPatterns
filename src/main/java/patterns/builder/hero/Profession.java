package patterns.builder.hero;

/**
 * Profession enumeration.
 */
public enum Profession {

    WARRIOR, MAGE, THIEF, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
