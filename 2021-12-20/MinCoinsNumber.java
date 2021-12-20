public class MinCoinsNumber {
    private static int [] coinsNominal = new int [] {10, 5,1};
    /**
     * Compose the money from the coins 1, 5, 10 cent, so that the number of coins is min possible
     *
     * @param money the amount of money to compose
     * @return the min possible number of coins, which compose the (amount of) money
    // 23 -> 10 + 10 + 1 + 1 + 1
     */

    public int exchangeMoney(int money) {
        if (money < 1) {
            throw new IllegalArgumentException("Money amount schould be more than 0");
        }
        int countOfCoins = 0;
        int restAmount = money;
        for (int nominalIndex = 0; nominalIndex < coinsNominal.length; nominalIndex++){
            int currentNominal = coinsNominal[nominalIndex];
            countOfCoins = countOfCoins + restAmount / currentNominal;
            restAmount = restAmount % currentNominal;
        }
        return countOfCoins;
    }
}
