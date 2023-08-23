import java.util.Arrays;

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
