import java.util.Stack;

public class Next_Greatest_Element {
    public static long[] nextLargerElement(long[] arr, int n) {
        long[] a = new long[n];
        Stack<Long> s = new Stack<>();
        s.push(arr[n - 1]);
        a[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (s.isEmpty() == false && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty() == true) {
                a[i] = -1;
            } else {
                a[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return a;
    }

    public static void main(String[] args) {
        long[] arr = { 1, 3, 2, 4 };
        int n = 4;
        System.out.println(nextLargerElement(arr, n));
    }
}
