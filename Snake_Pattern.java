import java.util.ArrayList;

public class Snake_Pattern {
    public static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            // odd
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    result.add(matrix[i][j]);
                }
            }
            // even
            else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = { { 45, 48, 54 },
                { 21, 89, 87 },
                { 70, 78, 15 } };
        ArrayList<Integer> ans = snakePattern(mat);
        System.out.println(ans);
    }
}
