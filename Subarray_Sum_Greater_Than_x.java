public class Subarray_Sum_Greater_Than_x {
    // Given an array of integers (A[]) and a number x, find the smallest subarray
    // with sum greater than the given value. If such a subarray do not exist return
    // 0 in that case.(GFG)
    public static int smallestSubWithSum(int a[], int n, int x) {
        int asum = 0;
        for (Integer i : a) {
            asum += i;
        }
        if (asum < x) {
            return 0;
        }
        int minlen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            while (sum > x) {
                minlen = Math.min(minlen, i - start + 1);
                sum -= a[start];
                start++;
            }
        }
        if (minlen == Integer.MAX_VALUE) {
            return 0;
        }
        return minlen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 7, 10, 10, 8, 10 };
        int n = 8;
        int x = 10;
        System.out.println(smallestSubWithSum(arr, n, x));
    }
}
