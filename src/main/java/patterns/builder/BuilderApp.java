package patterns.builder;

import patterns.builder.hero.*;

public class BuilderApp {

    public static void main(String[] args) {

        //region Hero builder
        Hero warrior = new Hero.Builder("Ragnar", Profession.WARRIOR)
                .addHairType(HairType.SHORT)
                .addHairColor(HairColor.BROWN)
                .addArmor(Armor.CHAIN_MAIL)
                .addWeapon(Weapon.AXE)
                .addSkill(Skill.LEADERSHIP)
                .build();
        System.out.println(warrior.toString());
        //endregion
        
    }
}
