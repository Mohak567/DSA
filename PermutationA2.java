import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

//ALL SORTED
public class PermutationA2 {
    public static List<String> find_permutation(String S) {
        String str = S;
        if (str.length() == 0) {
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        char fc = str.charAt(0);
        List<String> result = find_permutation(str.substring(1));
        TreeSet<String> finalSet = new TreeSet<>();

        for (String t : result) {
            for (int i = 0; i <= t.length(); i++) {
                StringBuilder sb = new StringBuilder(t);
                sb.insert(i, fc);
                finalSet.add(sb.toString());
            }
        }

        return new ArrayList<>(finalSet);
    }

    public static void main(String[] args) {
        System.out.println(find_permutation("abc"));
    }
}