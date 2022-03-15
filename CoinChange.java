import static java.lang.Math.*;
import java.util.*;
public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {2,5,10,1};
        int amount = 27;
        System.out.println(coinChange(coins, amount));
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1]; 
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                int currentCoin = coins[j]; 
                if (i - currentCoin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - currentCoin] + 1);
                }
            }
        }
        
        return dp[amount] > amount ? - 1 : dp[amount];
    }
}
