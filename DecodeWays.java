import java.util.*;
public class DecodeWays {
    public static void main(String[] args) {
        String s = "2126";
        System.out.println(numDecodings(s));
    }
	// dp[0] = 1
	// dp[1] = 1
	// 1 => B, 1
	// dp[2] = 1
	// dp[2] += dp[i-2]
	
    public static int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0)  == '0' ? 0 : 1;
        for (int i = 2; i <= s.length(); i++) {
            int oneDigit = Integer.valueOf(s.substring(i - 1, i));
            int twoDigits = Integer.valueOf(s.substring(i - 2, i));
			// 21
			// BA

			// 2         21
			// 1 16		 
			// 6
            if (oneDigit >= 1) {

                dp[i] = dp[i-1];
            }
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()];
        // 2921 => AAAA => KAA = > AAK = > KK => AKA
    }
}
