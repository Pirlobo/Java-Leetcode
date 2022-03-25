public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'a', 'b', 'c','e'}, {'s', 'f', 'c','s'}, {'a','d','e','e'}};
        System.out.println(exist(board, "abcced"));
    }
    static boolean[][] visited;
    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int columns = board[0].length;
        visited = new boolean[rows][columns];
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < columns; j++) {
                if (board[i][j] == word.charAt(0) && searchWord(i , j , 0, word, board)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean searchWord(int i , int j, int index, String word, char[][] board) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || word.charAt(index) != board[i][j] || visited[i][j]) {
            return false;
        }
        visited[i][j] = true;
        if (searchWord(i+1, j, index + 1, word, board) ||
        searchWord(i-1, j, index + 1, word, board) ||
        searchWord(i, j+1, index + 1, word, board) ||
        searchWord(i, j-1, index + 1, word, board) ) {
                return true; 
            }
            visited[i][j] = false;
            return false;
    }
}