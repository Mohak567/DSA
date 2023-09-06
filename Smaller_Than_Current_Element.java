import java.util.HashMap;
import java.util.Arrays;

public class Smaller_Than_Current_Element {
    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 2, 3 };
        int[] ans = arr.clone();
        Arrays.sort(ans);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ans.length; i++) {
            if (!map.containsKey(ans[i]))
                map.put(ans[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
