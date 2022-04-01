import java.util.*;
public class KWeakestRows {
    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0}, {1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int[] res = kWeakestRows(mat, 3);
        for (int i : res) {
            System.out.println(i);
        }
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        // row, sodiers
        List<int[]> rows = new ArrayList<int[]>();
        for(int i = 0 ; i < mat.length; i++){
            int count = 0;
            int[] row = new int[2];
            for(int j = 0 ; j < mat[0].length; j++){
                int current = mat[i][j];
                if(current == 1) count++;
            }
            row[0] = i;
            row[1] = count;
            rows.add(row);
        }
        Collections.sort(rows, 
                        (o1, o2) -> Integer.compare(o1[1], o2[1]));
        for(int i = 0 ; i < k; i++){
            res[i] = rows.get(i)[0];
        }
        
        return res;
        
    }
}

