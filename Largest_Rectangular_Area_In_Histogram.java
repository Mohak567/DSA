public class Largest_Rectangular_Area_In_Histogram {
    public static int largestArea(int[] arr) {
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            // previous
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    current += arr[i];
                } else {
                    break;
                }
            }
            // next
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    current += arr[i];
                } else {
                    break;
                }
            }
            temp = Math.max(temp, current);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println(largestArea(arr));
    }
}