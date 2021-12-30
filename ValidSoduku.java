import java.util.*;

public class ValidSoduku {
    public static void main(String[] args) {
        char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '5', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char current = board[i][j];
                if (current != '.') {
                    if (!set.add(current + "found in row " + i) ||
                            !set.add(current + "found in col " + j) ||
                            !set.add(current + "found in sub box " + i / 3 + "-" + j / 3))
                        return false;
                }
            }
        }
        return true;
    }
}
