public class Minimum_Number_Of_Jumps {
    /*
     * Given an array of N integers arr[] where each element represents the maximum
     * length of the jump that can be made forward from that element. This means if
     * arr[i] = x, then we can jump any distance y such that y ≤ x.
     * Find the minimum number of jumps to reach the end of the array (starting from
     * the first element). If an element is 0, then you cannot move through that
     * element.
     * 
     * Note: Return -1 if you can't reach the end of the array.(GFG)
     */
    public static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return 0;
        }
        if (arr[0] == 0) {
            return -1;
        }
        int jumps = 1;
        int max = arr[0];
        int remaining = arr[0];
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return jumps;
            }
            max = Math.max(max, i + arr[i]);
            remaining--;
            if (remaining == 0) {
                jumps++;
                if (i >= max) {
                    return -1;
                }
                remaining = max - i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println(minJumps(arr));
    }
}