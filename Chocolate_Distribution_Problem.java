import java.util.ArrayList;
import java.util.Arrays;

public class Chocolate_Distribution_Problem {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(1);
        a.add(9);
        a.add(56);
        a.add(7);
        a.add(9);
        a.add(12);
        int n = 8;
        int m = 5;
        int[] packets = new int[n];
        for (int i = 0; i < n; i++) {
            packets[i] = a.get(i);
        }
        if (n < m) {
            System.out.println(-1);
        }
        Arrays.sort(packets);
        long minDifference = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            long diff = packets[i + m - 1] - packets[i];
            minDifference = Math.min(minDifference, diff);
        }
        System.out.println(minDifference);
    }
}
