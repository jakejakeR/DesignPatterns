package patterns.prototype.hero.beast;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor
public class ElfBeast extends Beast {
    private final String helpType;

    public ElfBeast(ElfBeast elfBeast) {
        super(elfBeast);
        this.helpType = elfBeast.helpType;
    }

    @Override
    public ElfBeast copy() {
        return new ElfBeast(this);
    }

    @Override
    public String toString() {
        return "Elven eagle helps in " + helpType;
    }
}
