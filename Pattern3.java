public class Pattern3 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 0; k < rows - i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
/*
 * * * * *
 * * * *
 * * *
 * *
 *
 */
