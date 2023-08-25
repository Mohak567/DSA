public class Rotation_Of_Array {
    static public void Reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int rotations = 6;
        int[] arr = { 10, 20, 30, 40, 50 };
        // if rotations are in negative
        if (rotations < 0) {
            rotations += arr.length;// negative rotations should be <=arr.length
        }
        // for converting rotations into range
        rotations = rotations % arr.length;
        // rotating first part of array
        Reverse(arr, 0, arr.length - rotations - 1);
        // rotating second part of array
        Reverse(arr, arr.length - rotations, arr.length - 1);
        // rotating full array to get ans
        Reverse(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
