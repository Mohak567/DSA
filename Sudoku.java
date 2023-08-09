public class Sudoku {
    final int MAX_SIZE = 9;

    private boolean isPresentInRow(int row, char value) {// the value is present in row
        // row fixed checking every column
        for (int col = 0; col < MAX_SIZE; col++) {
            if (board[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean isPresentInCol(int col, char value) {// the value is present in col
        // column fixed checking every row
        for (int row = 0; row < MAX_SIZE; row++) {
            if (board[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean isPresentInSubGrid(int col, int row, char value) {// the value is present in subgrid
        int startrow = row - (row % 3);
        int startcol = col - (col % 3);
        for (int i = startrow; i < startrow + 3; i++) {
            for (int j = startcol; i < startcol + 3; j++) {
                if (board[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isCorrectToPlaceANumber(int row, int col, char value) {
        return !isPresentInRow(row, value) && !isPresentInCol(col, value) && !isPresentInSubGrid(col, row, value);// calling
                                                                                                                  // every
                                                                                                                  // condition
        // taking above values complement so that we can get true if value is not
        // present

        /*
         * conditions to be checked
         * // the value is present in row eg: isPresentInRow
         * // the value is present in col eg: isPresentInCol
         * // the value is present in subgrid eg: isPresentInSubGrid
         */
    }

    char[][] board;

    private boolean solveSudoku(int row, int col) {
        // if we reach to the last column,then move to the next row
        if (col == MAX_SIZE) {
            row++;
            col = 0;
        }
        if (row == MAX_SIZE) {// termination case
            return true;
        }
        // if cell is not empty move to the next column
        if (board[row][col] != '.') {
            return solveSudoku(row, col + 1);
        }

        // if cell is empty, then place the value (1 to 9(loop)) but with pre check
        // eg:isCorrectToPlaceANumber
        for (int i = 1; i <= MAX_SIZE; i++) {// loop for 1 to 9 options
            if (isCorrectToPlaceANumber(row, col, (char) (i + '0'))) {// checking for value should be placed or not
                // if it gives true
                board[row][col] = (char) (i + '0');// value placed
                boolean result = solveSudoku(row, col + 1);
                if (result) {
                    return true;// stackfall
                }
                // if above condition becomes false backtrack
                board[row][col] = '.';// undo the cell(empty the cell)
            }
        }
        // loop is ended so stackfall
        return false;
    }

    public void solveSudoku(char[][] board) {
        this.board = board;
        solveSudoku(0, 0);

    }

    public static void main(String[] args) {
        char[][] board = { { '5', '3', '.', '.', '.', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
    }
}
