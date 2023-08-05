import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Permutation_According_to_First_Char {
    static ArrayList<String> permutation(String S) {
        if (S.length() == 0) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        char ch = S.charAt(0);
        ArrayList<String> ans = permutation(S.substring(1));
        ArrayList<String> finalans = new ArrayList<>();
        for (String s : ans) {
            for (int i = 0; i <= s.length(); i++) {
                StringBuilder sb = new StringBuilder(s);
                sb.insert(i, ch);
                finalans.add(sb.toString());
            }
        }
        Collections.sort(finalans, new Sort());
        return finalans;
    }

    static class Sort implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            char firstLetterS1 = s1.charAt(0);
            char firstLetterS2 = s2.charAt(0);
            return Character.compare(firstLetterS1, firstLetterS2);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(permutation(str));
        // ABC ACB BAC BCA CAB CBA
    }
}
