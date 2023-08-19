import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 5, 2 };
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[arr.length - 1];
        list.add(max);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] > arr[i]) {
                max = arr[i - 1];
                list.add(max);
            }
        }
        System.out.println(list);
    }
}
