import java.util.ArrayList;

public class Matrix_Traversal {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int r = 4, c = 4;
        ArrayList<Integer> ans = new ArrayList<>();
        int right = c - 1;
        int left = 0;
        int top = 0;
        int down = r - 1;
        while (left <= right && top <= down) {
            for (int i = top; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= down; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            if (top <= down) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[down][i]);
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(ans);
    }
}