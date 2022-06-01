package patterns.builder;

/**
 * Hero, the class with many parameters.
 */
public final class Hero {

    private final String name;
    private final Profession profession;
    private final HairType hairType;
    private final HairColor hairColor;
    private final Armor armor;
    private final Weapon weapon;
    private final Skill skill;

    // Constructor
    private Hero(Builder builder) {
        this.name = builder.name;
        this.profession = builder.profession;
        this.hairType = builder.hairType;
        this.hairColor = builder.hairColor;
        this.armor = builder.armor;
        this.weapon = builder.weapon;
        this.skill = builder.skill;
    }

    //region Getters
    public String getName() {
        return name;
    }

    public Profession getProfession() {
        return profession;
    }

    public HairType getHairType() {
        return hairType;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Skill getSkill() {
        return skill;
    }
    //endregion


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("This is a ")
                .append(profession)
                .append(" named ")
                .append(name);
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor).append(' ');
            }
            if (hairType != null ) {
                sb.append(hairType).append(' ');
            }
            sb.append(hairType != HairType.BALD ? "hair" : "head");
        }
        if (armor != null) {
            sb.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a/an ").append(weapon).append('.');
        }
        if (skill != null) {
            sb.append(" Hero's main skill is ").append(skill);
        }
        sb.append('.');
        return sb.toString();
    }

    /**
     * The builder class.
     */
    public static class Builder {
        private final String name;
        private final Profession profession;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;
        private Skill skill;

        /**
         * Constructor
         */
        public Builder(String name, Profession profession) {
            if(name == null || profession == null){
                throw new IllegalArgumentException("Name and profession cannot be null");
            }
            this.name = name;
            this.profession = profession;
        }

        public Builder addHairType(HairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder addHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder addArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder addWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Builder addSkill(Skill skill) {
            this.skill = skill;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
