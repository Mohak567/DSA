import java.util.*;

public class Lucky_Number {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        List<Integer> minl = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            minl.add(min);
            min = Integer.MAX_VALUE;
        }
        int max = Integer.MIN_VALUE;
        List<Integer> maxl = new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            maxl.add(max);
            max = Integer.MIN_VALUE;
        }

        List<Integer> result = new ArrayList<>();
        for (int e : minl) {
            if (maxl.contains(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        System.out.println(luckyNumbers(arr));
    }
}