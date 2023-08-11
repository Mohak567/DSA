public class Coin_ProblemDP {// optimized using DP
    public static int possibleWays(int[] coins, int amount, int index) {
        long[] dp = new long[amount + 1];
        dp[0] = 1; // There is one way to make a sum of 0 (using no coins)

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return (int) dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2 };
        int amount = 3;
        System.out.println(possibleWays(coins, amount, 0));
    }
}
