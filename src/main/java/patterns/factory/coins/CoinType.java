package patterns.factory.coins;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

/**
 * Enumeration for different types of coins.
 */
@Getter
@RequiredArgsConstructor
public enum CoinType {

    COPPER(CopperCoin::new),
    GOLD(GoldCoin::new);

    private final Supplier<Coin> constructor;

}
