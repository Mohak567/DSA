import java.util.*;

public class K {
    public static void main(String[] args) {
        int[] arr = { 10, 40, 20 };
        int n = 3;
        int[] ar = Arrays.copyOf(arr, n);
        Arrays.sort(ar);
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (arr[i] == ar[j]) {
                arr[j] = i;
                j = 0;
                i++;
            } else {
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}