package patterns.prototype.hero.beast;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import patterns.prototype.hero.Prototype;

/**
 * Beast
 */
@NoArgsConstructor
@EqualsAndHashCode
public abstract class Beast implements Prototype {

    public Beast(Beast source) {
    }

    @Override
    public abstract Beast copy();
}
