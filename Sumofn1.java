/**
 * Sumofn1
 */
public class Sumofn1 {
    static int sum(int num) {
        if (num == 0) {
            return 0;
        }
        int result = sum(num - 1);
        result += num;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}