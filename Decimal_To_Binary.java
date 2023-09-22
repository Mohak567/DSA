public class Decimal_To_Binary {
    public static String dectobin(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int bit = num & 1;
            sb.append(bit);
            num = num >> 1;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(dectobin(num));
    }
}
