package patterns.prototype;

import patterns.prototype.hero.HeroFactoryImpl;
import patterns.prototype.hero.beast.ElfBeast;
import patterns.prototype.hero.beast.OrcBeast;
import patterns.prototype.hero.mage.ElfMage;
import patterns.prototype.hero.mage.OrcMage;
import patterns.prototype.hero.warlord.ElfWarlord;
import patterns.prototype.hero.warlord.OrcWarlord;

/**
 * Specify the kinds of objects to create,
 * using a prototypical instance
 * and create new objects by copying this prototype.
 */
public class PrototypeApp {

    public static void main(String[] args) {
        var factory = new HeroFactoryImpl(
                new ElfMage("cooking"),
                new ElfWarlord("cleaning"),
                new ElfBeast("protecting")
        );

        var mage = factory.createMage();
        var warlord = factory.createWarlord();
        var beast = factory.createBeast();
        System.out.println(mage.toString());
        System.out.println(warlord.toString());
        System.out.println(beast.toString());

        factory = new HeroFactoryImpl(
                new OrcMage("axe"),
                new OrcWarlord("sword"),
                new OrcBeast("laser")
        );

        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();
        System.out.println(mage.toString());
        System.out.println(warlord.toString());
        System.out.println(beast.toString());
    }
}
