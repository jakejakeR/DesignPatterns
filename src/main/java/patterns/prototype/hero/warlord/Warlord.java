package patterns.prototype.hero.warlord;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import patterns.prototype.hero.Prototype;

/**
 * Mage
 */
@NoArgsConstructor
@EqualsAndHashCode
public abstract class Warlord implements Prototype {

    public Warlord(Warlord source) {
    }

    @Override
    public abstract Warlord copy();
}
