import java.util.HashMap;

public class Anagram_Checker {
    public static boolean isanagram(String s, String S) {
        s = s.toLowerCase();
        S = S.toLowerCase();

        // Check if the lengths of the two strings are equal
        if (s.length() != S.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : S.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);

                // Remove the character entry from the map if the count becomes 0
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            } else {
                // If the character is not found in the map, it's not an anagram
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cat";
        String S = "act";
        System.out.println(isanagram(s, S));
    }
}