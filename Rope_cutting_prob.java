public class Rope_cutting_prob {
    static int ropecut(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        int cutfroma = ropecut(n - a, a, b, c);
        int cutfromb = ropecut(n - b, a, b, c);
        int cutfromc = ropecut(n - c, a, b, c);
        int pieces = Math.max(Math.max(cutfroma, cutfromb), cutfromc);
        if (pieces == -1) {
            return -1;
        }
        return pieces + 1;
    }

    public static void main(String[] args) {
        System.out.println(ropecut(9, 4, 5, 3));
    }
}
