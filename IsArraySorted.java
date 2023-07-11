public class IsArraySorted {
    static boolean check(int[] ar, int i) {
        if (ar.length - 1 == i) {
            return true;
        }
        if (ar[i + 1] < ar[i]) {
            return false;
        }
        return check(ar, i + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 6, 7, 8, 9 };
        System.out.println(check(arr, 0) ? "Sorted" : "not Sorted");
    }
}
