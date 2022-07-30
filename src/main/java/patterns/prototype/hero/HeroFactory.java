package patterns.prototype.hero;

import patterns.prototype.hero.beast.Beast;
import patterns.prototype.hero.mage.Mage;
import patterns.prototype.hero.warlord.Warlord;

public interface HeroFactory {
    Mage createMage();

    Warlord createWarlord();

    Beast createBeast();
}
