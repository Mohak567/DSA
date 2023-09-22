public class Sum_Of_Upper_Matrix_And_Lower_Matrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int uppersum = 0;
        int lowersum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i <= j) {
                    uppersum += mat[i][j];
                } else if (j <= i) {
                    lowersum += mat[i][j];
                }
            }
        }
        System.out.println("uppersum " + uppersum);
        System.out.println("lowersum " + lowersum);
    }
}
