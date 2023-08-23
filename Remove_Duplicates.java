import java.util.Arrays;

/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k. *///Leet code 26
public class Remove_Duplicates {// without using extra space
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 4, 6, 8, 9, 7, 3 };
        Arrays.sort(arr);// 1,2,3,3,4,4,4,5,6,7,8,9
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
