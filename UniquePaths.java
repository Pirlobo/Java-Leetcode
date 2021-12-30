public class UniquePaths {
    public static void main(String[] args) {
        uniquePaths(3, 7);
    }
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = n-1; i >= 0; i--) {
            dp[m - 1][i] = 1;
        } 
        for (int i = m-1; i >= 0; i--) {
            dp[i][n-1] = 1;
        } 
        for (int i = m-2; i >=0; i--) {
            for (int j = n-2; j >= 0; j--) {
                dp[i][j] = dp[i][j+1] + dp[i+1][j];
            }
        }
        return dp[0][0];
    }
}
