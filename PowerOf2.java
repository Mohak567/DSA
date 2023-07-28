public class PowerOf2 {
    public static void main(String[] args) {
        /*
         * int n = 4;
         * int div = 2;
         * int ans = -1;
         * while (n >= div) {
         * if (div == n) {
         * ans = 1;
         * break;
         * } else {
         * div *= 2;
         * }
         * }
         * System.out.println(ans);
         */
        int n = 31;
        boolean s = false;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            if (n == 1) {
                s = true;
                break;
            } else if (n % 2 != 0) {
                break;
            }
        }
        System.out.println(s);
    }
}
