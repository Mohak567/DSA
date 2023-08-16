public class Subset_Sum_Problem {
    public static boolean subset(int n, int[] arr, int sum) {
        if (sum == 0) {// termination case
            return true;
        }
        if (n == 0) {// termination case
            return false;
        }
        if (arr[n - 1] <= sum) {// logic
            return subset(n - 1, arr, sum - arr[n - 1]) || subset(n - 1, arr, sum);
        }
        // include case not include case
        else {// logic
            return subset(n - 1, arr, sum);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 2, 3, 4, 5, 12, 34 };
        int sum = 12;
        System.out.println(subset(n, arr, sum));
    }
}