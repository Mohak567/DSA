public class Power {
    static void power(int num, int pow, int re) {
        if (pow == 0) {
            System.out.print(re);
            return;
        }
        re = re * num;
        power(num, pow - 1, re);
    }

    public static void main(String[] args) {
        power(2, 3, 1);
    }
}
