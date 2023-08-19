import java.util.ArrayList;

public class CommonElements {
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                if (!ans.contains(A[i])) {
                    ans.add(A[i]);
                }
                i++;
                j++;
                k++;
            } else if (A[i] < B[j] || A[i] < C[k]) {
                i++;
            } else if (B[j] < A[i] || B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 5, 10, 20, 40, 80 };
        int[] b = { 6, 7, 20, 80, 100 };
        int[] c = { 3, 4, 15, 20, 30, 70, 80, 120 };
        ArrayList<Integer> list = commonElements(a, b, c, 6, 5, 8);
        System.out.println(list);
    }
}
