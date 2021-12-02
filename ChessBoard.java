public class ChessBoard {
    public static void main(String[] args) {
        
    }
    public static char[][] getChessBoard(int dim) {
        char[][] board = new char[dim][dim];
        for (int i = 0; i < dim*dim; i++) {
            int integetPart = i/dim;
            int remainder = i % dim;
            if ((integetPart + remainder) % 2 == 0) {
                board[integetPart][remainder] = 'B';    
            } else {
                board[integetPart][remainder] = 'W';    
            }
        }
        return board;
    }
}
