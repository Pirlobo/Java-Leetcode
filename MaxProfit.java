import java.util.*;
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {1,7,2};
        maxProfit(prices);
    }
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            } else if (prices[i] > minPrice && prices[i] - minPrice > max) {
                max = prices[i] - minPrice;
            }
        }
        return max;
    }
}
