public class Move_Negative_Elements_To_Front {
    public static void main(String[] args) {
        int[] array = { 2, -5, 3, -8, 1, 7, -4, -6 };

        int[] result = moveNegativesToFront(array);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] moveNegativesToFront(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int negIndex = 0;
        int posIndex = n - 1;

        for (int num : arr) {
            if (num < 0) {
                result[negIndex++] = num;
            } else {
                result[posIndex--] = num;
            }
        }

        return result;
    }
}
