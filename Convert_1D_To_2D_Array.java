public class Convert_1D_To_2D_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int row = 3; // Change the number of rows to 3
        int col = 4;
        if (row * col != arr.length) {
            System.out.println("Array length is greater than 2D array length");
            return;
        }
        int rowcount = 0;
        int colcount = 0;
        int[][] ans = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            ans[rowcount][colcount] = arr[i];
            colcount++;
            if (colcount == col) {
                rowcount++;
                colcount = 0;
            }
        }
        for (int[] a : ans) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}