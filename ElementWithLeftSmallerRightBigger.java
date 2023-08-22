public class ElementWithLeftSmallerRightBigger {
    public static int findElement(int arr[], int n) {
        int[] mini = new int[n];
        int[] maxi = new int[n];
        for (int i = 0; i < n; i++) {
            mini[i] = Integer.MAX_VALUE;
        }
        maxi[0] = arr[0];
        for (int i = 1; i < n; i++) {
            maxi[i] = Math.max(maxi[i - 1], arr[i]);
        }
        mini[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            mini[i] = Math.min(mini[i + 1], arr[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= maxi[i - 1] && arr[i] <= mini[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 7 };
        System.out.println(findElement(arr, 4));
    }
}
