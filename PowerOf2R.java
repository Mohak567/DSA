public class PowerOf2R {
    static boolean isPowerOf2(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 == 0) {
            return isPowerOf2(n / 2);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPowerOf2(31));
    }
}
