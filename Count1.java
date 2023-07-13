public class Count1 {
    static int count(int num) {
        if (num <= 1) {
            return 0;
        }
        int con = count(num / 10);
        int sd = num % 10;
        if (sd == 0) {
            con++;
        }
        return con;
    }

    public static void main(String[] args) {
        System.out.println(count(1020300));
    }
}
