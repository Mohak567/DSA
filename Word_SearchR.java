public class Word_SearchR {
    public static boolean exist(char[][] board, String word) {// finding entry point
        int m = board.length;// row
        int n = board[0].length;// col

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;// entry point not found
    }

    private static boolean dfs(char[][] board, int i, int j, String word, int index) {// searching logic
        if (index == word.length()) {// termination case
            return true; // All characters of the word are found
        }

        int m = board.length;// row
        int n = board[0].length;// col

        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(index)) {// negative cases
            return false; // Out of bounds or character doesn't match
        }

        char originalChar = board[i][j];
        board[i][j] = '#'; // Mark the cell as visited

        // Explore neighbors
        boolean found = dfs(board, i + 1, j, word, index + 1) || // down
                dfs(board, i - 1, j, word, index + 1) || // up
                dfs(board, i, j + 1, word, index + 1) || // right
                dfs(board, i, j - 1, word, index + 1);// left

        board[i][j] = originalChar; // Backtrack by restoring the original character

        return found;// if it gets false the exist function again finds
    }

    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' },
        };
        boolean ans = exist(board, "AKL");

        System.out.println(ans);
    }
}
