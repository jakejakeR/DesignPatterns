package patterns.prototype.hero;

import lombok.RequiredArgsConstructor;
import patterns.prototype.hero.beast.Beast;
import patterns.prototype.hero.mage.Mage;
import patterns.prototype.hero.warlord.Warlord;

@RequiredArgsConstructor
public class HeroFactoryImpl implements HeroFactory {
    private final Mage mage;
    private final Warlord warlord;
    private final Beast beast;

    @Override
    public Mage createMage() {
        return mage.copy();
    }

    @Override
    public Warlord createWarlord() {
        return warlord.copy();
    }

    @Override
    public Beast createBeast() {
        return beast.copy();
    }
}
