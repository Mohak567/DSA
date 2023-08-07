public class Coin_Problem {
    public static int possibleWays(int[] coins, int amount, int index) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        if (amount > 0 && index == coins.length) {
            return 0;
        }
        return possibleWays(coins, amount - coins[index], index) + possibleWays(coins, amount, index + 1);

    }

    public static void main(String[] args) {
        int[] coins = { 1, 2 };
        int amount = 3;
        System.out.println(possibleWays(coins, amount, 0));
    }
}
