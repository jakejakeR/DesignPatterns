package patterns.builder.hero;

/**
 * Skill enumeration
 */
public enum Skill {
    DARK_MAGIC("dark magic"),
    LIGHT_MAGIC("light magic"),
    LUCK("luck"),
    LOGISTICS("logistics"),
    MAGIC_RESISTANCE("magic resistance"),
    ATTACK("attack"),
    DEFENSE("defense"),
    LEADERSHIP("leadership");

    private final String title;

    Skill(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
