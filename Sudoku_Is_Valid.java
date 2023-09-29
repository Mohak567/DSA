public class Sudoku_Is_Valid {
    public static int isVaild(int[][] mat) {
        for (int row = 0; row < 9; row++) {
            boolean[] seen = new boolean[10];
            for (int col = 0; col < 9; col++) {
                int num = mat[row][col];
                if (num != 0) {
                    if (seen[num]) {
                        return 0;
                    }
                    seen[num] = true;
                }
            }
        }

        for (int col = 0; col < 9; col++) {
            boolean[] seen = new boolean[10];
            for (int row = 0; row < 9; row++) {
                int num = mat[row][col];
                if (num != 0) {
                    if (seen[num]) {
                        return 0;
                    }
                    seen[num] = true;
                }
            }
        }

        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {
                boolean[] seen = new boolean[10];
                for (int row = startRow; row < startRow + 3; row++) {
                    for (int col = startCol; col < startCol + 3; col++) {
                        int num = mat[row][col];
                        if (num != 0) {
                            if (seen[num]) {
                                return 0;
                            }
                            seen[num] = true;
                        }
                    }
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[][] mat = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        System.out.println(isVaild(mat));
    }
}
