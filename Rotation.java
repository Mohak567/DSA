public class Rotation {
    // find number of rotation to make the array sorted
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
