public class OddEvensumRSF {
    static int[] sumoddeven(int num, int pos) {
        if (num == 0) {
            int[] result = new int[2];
            return result;
        }
        int[] arr = sumoddeven(num / 10, pos + 1);
        int temp = num % 10;
        if (pos % 2 == 0) {
            arr[0] += temp;
        } else {
            arr[1] += temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = sumoddeven(101010, 0);
        System.out.println(arr[0] + " odd");
        System.out.println(arr[1] + " even");
    }
}
