public class Binary_To_Decimal {
    public static int bintodec(String num) {
        int ans = 0;
        int mask = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            int bit = num.charAt(i) - '0';
            ans += bit << mask;
            mask++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String num = "1001";
        System.out.println(bintodec(num));
    }
}