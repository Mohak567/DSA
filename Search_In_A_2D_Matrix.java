public class Search_In_A_2D_Matrix {
    // conditions
    // 1 all rows are sorted
    // The first integer of each row is greater than the last integer of the
    // previous row
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        System.out.println(searchMatrix(mat, target));
    }
}
