public class Count {
    static void count(int num, int con) {
        if (num <= 1) {
            System.out.println(con);
            return;
        }
        int temp = num % 10;
        if (temp == 0) {
            con++;
        }
        count(num / 10, con);
    }

    public static void main(String[] args) {
        count(1020300, 0);
    }
}

public class Count {
    static void count(int num, int con) {
        if (num <= 1) {
            System.out.println(con);
            return;
        }
        int temp = num % 10;
        if (temp == 0) {
            con++;
        }
        count(num / 10, con);
    }

    public static void main(String[] args) {
        count(1020300, 0);
    }
}
