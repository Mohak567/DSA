public class Pattern_NRSF {
    static void printstar(int star) {
        if (star == 0) {
            return;
        }
        System.out.print("*");
        printstar(star - 1);
    }

    static void line(int row) {
        if (row == 0) {
            return;
        }
        line(row - 1);
        printstar(row);
        System.out.println();
    }

    public static void main(String[] args) {
        line(5);
    }
}
// *
// **
// ***
// ****
// *****
