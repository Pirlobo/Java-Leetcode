import java.util.*;
public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[] ans = findDiagonalOrder(a);
        for (int i : ans) {
            System.out.println(i);
        }
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        List<Integer> list = new ArrayList<Integer>();
        for( int k = 0 ; k < mat.length*2 ; k++ ) {
            for( int j = 0 ; j <= k ; j++ ) {
                int i = k - j;
                if( i < mat.length && j < mat.length ) {
                    list.add(mat[i][j]);
                }
            }
        }
        int[] integerArray = new int[list.size()];
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = list.get(i);
        }
        return integerArray;
    }
}
