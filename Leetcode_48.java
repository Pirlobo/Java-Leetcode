import java.util.Arrays;

public class Leetcode_48 {

    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6}, { 7, 8, 9}};
        rotate(nums);

    }

    public static void rotate(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        int index = -1;
        int reversedRow = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            ++index;
            reversedRow = matrix[0].length;
            for (int j = 0; j < result.length; j++) {
                --reversedRow;
                result[i][j] = matrix[reversedRow][index];
            }
        }
        matrix = result;
        
        for (int[] is : result) {
            for (int a : is) {
                System.out.println(a);
            }
        }
    }
}
