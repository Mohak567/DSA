import java.util.ArrayList;
import java.util.Collections;

public class Permutation_ALL_Sorted {
    public static ArrayList<String> permutation(String S) {
        ArrayList<String> result = new ArrayList<>();
        permute(S.toCharArray(), 0, result);
        Collections.sort(result); // Sort the result to match the expected order
        return result;
    }

    private static void permute(char[] arr, int index, ArrayList<String> result) {
        if (index == arr.length - 1) {
            result.add(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1, result);
            swap(arr, index, i); // Backtrack to restore the original order
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String str = "ARMY";
        System.out.println(permutation(str));
    }
}
