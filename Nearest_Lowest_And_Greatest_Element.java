public class Nearest_Lowest_And_Greatest_Element {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int element = 72;
        int greatestelement = 0;
        int lowestelement = 0;
        int index = -1;
        int low = 0;
        int i = 0;// it is maintained because may be the given element is not found so we traverse
                  // hole array
        int high = arr.length;
        while (i < arr.length) {
            int mid = (low + high) / 2;
            if (arr[mid] == element) {
                index = mid;
                System.out.println(index);
                return;
            } else if (arr[mid] < element) {
                lowestelement = arr[mid];
                low = mid + 1;
            } else if (arr[mid] > element) {
                greatestelement = arr[mid];
                high = mid - 1;
            }
            i++;
        }
        System.out.println(lowestelement);
        System.out.println(greatestelement);
    }
}
