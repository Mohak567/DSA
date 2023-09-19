public class Window_Sliding {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 5, 4, 6, 7, 9, 5, 8 };
        int k = 3;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.print(sum + " ");
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            System.out.print(sum + " ");
        }
    }
}
