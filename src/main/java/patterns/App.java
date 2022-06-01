package patterns;

import patterns.builder.hero.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Hero mage = new Hero.Builder("Solmyr", Profession.MAGE)
                .addHairType(HairType.BALD)
                .addHairColor(HairColor.BLACK)
                .addWeapon(Weapon.WARHAMMER)
                .build();
        System.out.println(mage.toString());

        Hero warrior = new Hero.Builder("Ragnar", Profession.WARRIOR)
                .addHairType(HairType.SHORT)
                .addHairColor(HairColor.BROWN)
                .addArmor(Armor.CHAIN_MAIL)
                .addWeapon(Weapon.AXE)
                .addSkill(Skill.LEADERSHIP)
                .build();
        System.out.println(warrior.toString());
    }
}
