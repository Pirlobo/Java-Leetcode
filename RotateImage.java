import java.util.*;
public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5,6}};
        int[][] output = rotate(matrix);
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[0].length; j++) {
                System.out.print(output[i][j]);
            }
            System.out.println();
        }
        
    }
    public static int[][] rotate(int[][] matrix) {
        // second way
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                list.add(matrix[matrix.length - j - 1][i]);
            }
        }
        int[][] output = new int[matrix[0].length][matrix.length];
        int index = 0;
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[0].length; j++) {
                output[i][j] = list.get(index);
                index += 1;
            }
        }
        return output;
    }
}
