public class Sumofn {
    static void sum(int num, int result) {
        if (num == 0) {
            System.out.println(result);
            return;
        }
        result += num;
        sum(num - 1, result);
    }

    public static void main(String[] args) {
        sum(5, 0);
    }
}