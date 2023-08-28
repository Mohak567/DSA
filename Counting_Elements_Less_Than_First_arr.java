import java.util.ArrayList;
import java.util.Arrays;

public class Counting_Elements_Less_Than_First_arr {
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr2);

        for (int i = 0; i < m; i++) {
            int index = binarysearch(arr2, 0, n - 1, arr1[i]);
            list.add(index + 1);
        }
        return list;
    }

    public static int binarysearch(int[] arr, int left, int right, int value) {
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] <= value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 7, 9 };
        int[] b = { 0, 1, 2, 1, 1, 4 };
        int m = a.length;
        int n = b.length;
        System.out.println(countEleLessThanOrEqual(a, b, m, n));
    }
}