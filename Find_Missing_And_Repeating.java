import java.util.Arrays;

public class Find_Missing_And_Repeating {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27,
                28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47 };
        int n = 47;
        Arrays.sort(arr);
        int[] ans = new int[2];
        int[] copy = new int[n + 1];
        int miss = -1;
        int repeat = -1;
        for (int i : arr) {
            copy[i]++;
        }
        for (int i = 1; i <= arr.length; i++) {
            if (copy[i] == 2) {
                repeat = i;
                ans[0] = repeat;
            } else if (copy[i] == 0) {
                miss = i;
                ans[1] = miss;
            }
            if (miss != -1 && repeat != -1) {
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
