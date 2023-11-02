import java.util.HashMap;

public class Kth_Non_Repeating_Character {

    public static void find_Kth(String str, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                if (k == 1) {
                    System.out.println(c);
                    return;
                }
                k--;
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabcccdeeeefg";
        int k = 2;
        find_Kth(str, k);
    }
}
