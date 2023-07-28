import java.util.Arrays;

//to find the range to make a sorted array
public class Length_unsorted_array {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
        int[] ans = new int[2];
        int[] copy = arr.clone();
        Arrays.sort(copy);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != copy[i]) {
                ans[0] = i;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != copy[i]) {
                ans[1] = i;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
