public class Pascal_Triangle {
    public static void pascal_tri(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < rows - i; k++) {
                System.out.print("*");// spacing
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");// values
            }
            System.out.println();// new line
        }
    }

    public static int pascal(int rows, int col) {
        if (col == 0 || col == rows) {
            return 1;
        } else {
            return pascal(rows - 1, col - 1) + pascal(rows - 1, col);
        }
    }

    public static void main(String[] args) {
        int numrows = 5;
        pascal_tri(numrows);
    }
}
