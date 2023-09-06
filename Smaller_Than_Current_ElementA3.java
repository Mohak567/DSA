import java.util.Arrays;

public class Smaller_Than_Current_ElementA3 {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] hash = new int[501];
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        // prefix sum
        for (int i = 1; i < hash.length; i++) {
            int curr = hash[i];
            int pre = hash[i - 1];
            hash[i] = curr + pre;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
                continue;
            }
            ans[i] = hash[nums[i] - 1];
        }
        System.out.println(Arrays.toString(ans));
    }
}
