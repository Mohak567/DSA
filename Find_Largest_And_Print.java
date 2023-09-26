import java.util.Arrays;

public class Find_Largest_And_Print {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = { 1, 5, 7, 3, -4, 6, 7, 3 };
        int[] ans = new int[arr.length - k + 1];
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            ans[i] = max;
        }
        System.out.println(Arrays.toString(ans));
    }
}
