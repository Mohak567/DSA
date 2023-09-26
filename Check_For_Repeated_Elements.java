public class Check_For_Repeated_Elements {
    public static boolean hasDuplicateInRow(int[][] arr, int row) {
        for (int col1 = 0; col1 < arr[row].length - 1; col1++) {
            for (int col2 = col1 + 1; col2 < arr[row].length; col2++) {
                if (arr[row][col1] == arr[row][col2]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasDuplicateInColumn(int[][] arr, int col) {
        for (int row1 = 0; row1 < arr.length - 1; row1++) {
            for (int row2 = row1 + 1; row2 < arr.length; row2++) {
                if (arr[row1][col] == arr[row2][col]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkRepeatedElements(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            if (hasDuplicateInRow(arr, row) || hasDuplicateInColumn(arr, row)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
        System.out.println(checkRepeatedElements(arr));
    }
}
