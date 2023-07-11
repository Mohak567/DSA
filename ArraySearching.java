public class ArraySearching {
    static int search(int[] ar, int num, int i) {
        if (ar[i] == num) {
            return i;
        }
        if (ar.length == i) {
            return -1;
        }
        return search(ar, num, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(search(arr, 5, 0) >= 0 ? "found" : "not found");
        // System.out.println(search(arr, 5, 0));
    }
}
