import java.util.ArrayList;
import java.util.List;

public class Pascal_TriangleA2 {
    public static List<List<Integer>> triangle(int rows) {
        List<List<Integer>> totaList = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Integer> coloumn = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    coloumn.add(1);
                } else {
                    coloumn.add(j, totaList.get(i - 1).get(j - 1) + totaList.get(i - 1).get(j));
                }
            }
            totaList.add(coloumn);
        }
        return totaList;
    }

    public static void main(String[] args) {
        int numrows = 5;
        List<List<Integer>> ans = triangle(numrows);
        System.out.println(ans);
    }
}
