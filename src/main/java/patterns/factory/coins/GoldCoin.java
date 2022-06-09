package patterns.factory.coins;

/**
 * GoldCoin implementation.
 */
public class GoldCoin implements Coin {

    static final String DESCRIPTION = "This is a gold coin.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
