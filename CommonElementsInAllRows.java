import java.util.*;
public class CommonElementsInAllRows {
    public static void main(String[] args) {
        int[][] matrix = {{12,1,4,1,9}, 
                          {3,8,0,4,1}, 
                        {2,7,4,1,5},
                        {6,3,1,9,4}};
        findCommon(matrix);
    }
    public static void findCommon(int[][] mat)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }
 
        Map<Integer, Integer> map = new HashMap<>();
 
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[0].length; j++)
            {
                // insert elements of the first row into the map and
                // initialize them with a value of 1
                if (i == 0) {
                    map.put(mat[0][j], 1);
 
                    // if matrix contains the single row, print all its elements
                    if (mat.length == 1) {
                        System.out.print(mat[i][j] + " ");
                    }
                }
 
                // from the second row onwards, check if the current element
                // exists in the map and first in the current row
                if (i > 0 && map.containsKey(mat[i][j]) && map.get(mat[i][j]) == i)
                {
                    // increment the count of the element by 1
                    map.put(mat[i][j], i + 1);
 
                    // if `i` represent the last row, print the element
                    if (i == mat.length - 1) {
                        System.out.print(mat[i][j] + " ");
                    }
                }
            }
        }
    }
 
}

