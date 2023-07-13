public class Power1 {
    static int power(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        int result = power(num, pow - 1);
        return result * num;

    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
