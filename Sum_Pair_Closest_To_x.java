import java.util.Arrays;

public class Sum_Pair_Closest_To_x {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 28, 29, 30, 40 };
        int x = 45;
        int i = 0;
        int j = arr.length - 1;
        int dif = Integer.MAX_VALUE;
        int[] ans = new int[2];
        while (i < j) {
            int sum = arr[i] + arr[j];
            int abs = Math.abs(x - sum);
            if (abs < dif) {
                dif = abs;
                ans[0] = arr[i];
                ans[1] = arr[j];
            }
            if (sum < x)
                i++;
            else
                j--;
        }
        System.out.println(Arrays.toString(ans));
    }
}
