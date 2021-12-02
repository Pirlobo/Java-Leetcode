public class LongestPalindromicSubstringDynamicProgramming {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];
         String ans = "";
         for (int g = 0; g < dp.length; g++) {
             for (int i = 0, j = g; j < dp.length; i++, j++) {
                 if (g == 0) {
                     dp[i][j] = 1;
                 }
                 else if (g == 1) {
                     if (s.charAt(i) == s.charAt(j)) {
                         dp[i][j] = 1;
                     }
                 }
                 else {
                     if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == 1) {
                         dp[i][j] = 1;
                     }
                 }
                 if (dp[i][j] == 1) {
                     ans = s.substring(i, j + 1);
                 }
             }
         }
         return ans;
     }
}