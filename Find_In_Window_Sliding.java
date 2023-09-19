public class Find_In_Window_Sliding {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 2, 1, 1, 1, 2, 2, 3 };
        int x = 2;
        int k = 3;
        int f = 0;
        for (int i = 0; i < k; i++) {
            if (x == arr[i]) {
                f++;
            }
        }
        System.out.print(f + " ");

        for (int i = k; i < arr.length; i++) {
            int outelement = arr[i - k];
            if (outelement == x) {
                f--;
            }
            int inelement = arr[i];
            if (inelement == x) {
                f++;
            }
            System.out.print(f + " ");
        }
    }
}
