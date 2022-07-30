package patterns.prototype.hero.mage;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import patterns.prototype.hero.Prototype;

/**
 * Mage
 */
@NoArgsConstructor
@EqualsAndHashCode
public abstract class Mage implements Prototype {

    public Mage(Mage source) {
    }

    @Override
    public abstract Mage copy();
}

