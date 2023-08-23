import java.util.Arrays;
import java.util.HashMap;

public class Two_SumA2 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3 };
        int target = 7;
        int[] ans = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hash.get(arr[i]) == null) {
                int index = target - arr[i];
                hash.put(index, i);// put (key,value)
            } else {
                ans[1] = hash.get(arr[i]);
                ans[0] = i;
                System.out.println(Arrays.toString(ans));
                return;
            }
        }
    }
}
