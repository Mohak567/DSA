public class Rotate_The_Matrix {
    /*
     * 1 2 3 --> 7 4 1
     * 4 5 6 --> 8 5 2
     * 7 8 9 --> 9 6 3
     */
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int n = mat.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[n - 1 - j][i];
                mat[n - 1 - j][i] = mat[n - 1 - i][n - 1 - j];
                mat[n - 1 - i][n - 1 - j] = mat[j][n - 1 - i];
                mat[j][n - 1 - i] = mat[i][j];
                mat[i][j] = temp;
            }
        }
        for (int[] innermat : mat) {
            for (int outermat : innermat) {
                System.out.print(outermat + " ");
            }
            System.out.println();
        }
    }
}
