public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < result.length; i++){
            for(int j  = 0 ; j < result[0].length; j++){
                result[i][j] = matrix[i][j];
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j  = 0 ; j < matrix[0].length; j++){
                int current = matrix[i][j];
                if (current == 0) {
                    for (int k = 0; k < matrix[0].length; k++){
                        result[i][k] = 0;
                    }
                    for (int l = 0; l < matrix.length; l++){
                        result[l][j] = 0;
                    }
                } else {
                    continue;
                }
            }
        }
        for(int i = 0; i < result.length; i++){
            for(int j  = 0 ; j < result[0].length; j++){
                matrix[i][j] = result[i][j];
            }
        }
    }
}
