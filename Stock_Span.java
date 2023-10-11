public class Stock_Span {
    public static int[] profitDays(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = 1;
            if (i != 0 && arr[i] > arr[i - 1]) {
                int k = i - 1;
                while (k >= 0 && arr[i] >= arr[k]) {
                    temp++;
                    k--;
                }
            }
            ans[i] = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] rate = { 60, 50, 40, 30, 85, 90, 50 };
        int[] ans = profitDays(rate);
        for (int i : ans) {
            System.out.print(" " + i);
        }
    }
}
