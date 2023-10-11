import java.util.Stack;

public class Stock_SpanA2 {// optimized
    public static int[] profitDays(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n + 1];
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            ans[i] = s.isEmpty() ? (i + 1) : (i - s.peek());
            s.push(i);
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
