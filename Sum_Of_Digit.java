public class Sum_Of_Digit {
    static void sod(int num, int sum) {// using stack build
        if (num == 0) {
            System.out.println("sum " + sum);
            return;// tail recursion because there is no further processing
        }
        int sd = num % 10;
        sum += sd;
        sod(num / 10, sum);
    }

    public static void main(String[] args) {
        sod(123, 0);
    }
}