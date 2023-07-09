public class Sum_Of_Digit {
    static void sod(int num, int sum) {
        if (num == 0) {
            System.out.println("sum " + sum);
            return;// tail recursion
        }
        int sd = num % 10;
        sum += sd;
        sod(num / 10, sum);
    }

    public static void main(String[] args) {
        int num = 123;
        sod(num, 0);
    }
}