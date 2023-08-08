public class NQueen {
    public static boolean isqueensafe(boolean[][] board, int row, int col) {
        // upper rows check
        for (int i = row; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
        // left diagonal check
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // right diagonal check
        for (int i = row, j = col; i >= 0 && j < board[row].length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static int numberofways(boolean[][] board, int currentrow) {
        int count = 0;
        // Termination case
        if (currentrow == board.length) {
            return 1;// possibility
        }
        for (int col = 0; col < board[currentrow].length; col++) {// need to check every possibility
            // put the queen in coloumn but first check is queen safe at that position
            if (isqueensafe(board, currentrow, col)) {
                board[currentrow][col] = true;// placing the queen on board
                int result = numberofways(board, currentrow + 1);// after placing the queen next row
                count += result;
                // stackfall if condition is false(backtrack)
                board[currentrow][col] = false;// undo
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int count = numberofways(board, 0);
        System.out.println(count);
    }
}