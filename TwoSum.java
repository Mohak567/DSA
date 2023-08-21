public class TwoSum {

    public static void main(String[] args) {
        int nums[] = { 3, 2, 4 };
        int target = 6;
        int left = 0;
        int right = nums.length - 1;
        int[] ans = new int[2];
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                ans[0] = left;
                ans[1] = right;
                System.out.println(left + " " + right);
                break;
            } else if (sum != target && left != right - 1) {
                right--;
                continue;
            } else {
                left++;
                right = nums.length - 1;
            }
        }
    }
}
