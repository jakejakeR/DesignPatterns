package patterns.prototype.hero.beast;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor
public class OrcBeast extends Beast {
    private final String weapon;

    public OrcBeast(OrcBeast orcBeast) {
        super(orcBeast);
        this.weapon = orcBeast.weapon;
    }

    @Override
    public OrcBeast copy() {
        return new OrcBeast(this);
    }

    @Override
    public String toString() {
        return "Orcish wolf attacks with" + weapon;
    }
}
