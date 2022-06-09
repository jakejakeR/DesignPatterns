package patterns.factory.coins;

/**
 * Factory of coins.
 */
public class CoinFactory {

    public static Coin getCoin(CoinType type) {
        return type.getConstructor().get();
    }
}
