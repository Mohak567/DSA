public class Median_Of_Two_Sorted_Array {
    public static double median(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0, k = 0;
        int total = n + m;
        int[] arr = new int[total];

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        while (i < n) {
            arr[k++] = arr1[i++];
        }

        while (j < m) {
            arr[k++] = arr2[j++];
        }

        if (total % 2 == 0) {
            return (arr[total / 2 - 1] + arr[total / 2]) / 2.0;
        } else {
            return arr[total / 2];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        int[] ar = { 3, 4 };
        System.out.println(median(arr, ar));
    }
}