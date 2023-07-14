public class Pattern_NR1SF {
    static void printstar(int s) {
        if (s == 0) {
            return;
        }
        System.out.print("*");
        printstar(s - 1);
    }

    static void line(int row, int star) {
        if (row == 0) {
            return;

        }
        line(row - 1, star + 1);
        System.out.println();
        printstar(star);

    }

    public static void main(String[] args) {
        line(5, 1);
    }
}
