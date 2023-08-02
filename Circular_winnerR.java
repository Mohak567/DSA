public class Circular_winnerR {
    public static int ans(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (ans(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int i = ans(5, 2) + 1;
        System.out.println(i);
    }
}
