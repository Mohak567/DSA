public class OddEvensum {
    public static void main(String[] args) {
        int n = 2566879;
        int o = 0, e = 0;
        int count = 0;
        int num = n;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        for (int i = 0; i < count; i++) {
            int temp = n % 10;
            n = n / 10;
            if (i % 2 == 0) {
                e += temp;
            } else if (i % 2 != 0) {
                o += temp;
            }
        }
        System.out.println(o + "  " + e);
    }

}
