package patterns.factory;

import patterns.factory.coins.Coin;
import patterns.factory.coins.CoinFactory;
import patterns.factory.coins.CoinType;

public class FactoryApp {

    public static void main(String[] args) {

        System.out.println("Factory design pattern practice\r\n");

        Coin coin1 = CoinFactory.getCoin(CoinType.GOLD);
        Coin coin2 = CoinFactory.getCoin(CoinType.COPPER);
        System.out.println(coin1.getDescription());
        System.out.println(coin2.getDescription());
    }
}
