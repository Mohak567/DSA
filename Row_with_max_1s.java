public class Row_with_max_1s {
    // Given a boolean 2D array of n x m dimensions where each row is sorted. Find
    // the 0-based index of the first row that has the maximum number of 1's.(GFG)
    public static int rowWithMax1s(int arr[][], int n, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == 1) {
                    return j;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 },
                { 0, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };
        System.out.println(rowWithMax1s(arr, 4, 4));
    }
}