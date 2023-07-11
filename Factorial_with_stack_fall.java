public class Factorial_with_stack_fall {
    static int fact(int num) {
        if (num <= 1) {
            return 1;
        }
        int result = fact(num - 1);
        return result * num;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
