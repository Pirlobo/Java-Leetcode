import java.util.*;
public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
    // public static int minPathSum(int[][] grid) {
    //     int max = Integer.MAX_VALUE;
    //     int m = grid.length;
    //     int n = grid[0].length;
    //     int[][] dir = {{0,1}, {1, 0}};
    //     Queue<int[]> q = new LinkedList<int[]>();
    //      q.add(new int[] {0, 0 , grid[0][0]});
    //     //  grid[0][0] = -1;
    //      while (!q.isEmpty()) {
    //          int size = q.size();
    //          while(size-- > 0) {
    //             int[] point = q.poll();
    //             if(point[0] == m - 1 && point[1] == n - 1){
    //                 if(point[2] < max) max = point[2];
    //             }
    //             for (int[] d : dir) {
    //                 int r = point[0] + d[0];
    //                 int c = point[1] + d[1];
    //                 if(r >= 0 && c >= 0 && r < m && c < n && grid[r][c] >= 0){
    //                     q.add(new int[]{r,c,point[2] + grid[r][c]} );
    //                     // grid[r][c] = -1;
    //                 }
    //             }
    //          }
    //      }
    //     return max;
    // } 
    public static int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 1; i < cols; i++) {
            grid[0][i] = grid[0][i-1] + grid[0][i];
        }
        for (int i = 1; i < rows; i++) {
            grid[i][0] = grid[i-1][0] + grid[i][0];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                int smallerNumber = grid[i-1][j];
                if (grid[i][j-1] < smallerNumber) {
                    smallerNumber = grid[i][j-1];
                }
                grid[i][j] = smallerNumber + grid[i][j];
            }
        }
        return grid[rows-1][cols-1];
    }
}
