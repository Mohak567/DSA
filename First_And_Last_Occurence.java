import java.util.*;

class First_And_Last_Occurence {
    public static ArrayList<Integer> firstAndLast(int arr[], int n, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = n, max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }
        }

        list.add(min);
        list.add(max);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 5, 8, 3 };
        System.out.println(firstAndLast(arr, 7, 3));
    }
}
