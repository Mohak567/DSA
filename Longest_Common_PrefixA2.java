import java.util.Arrays;

public class Longest_Common_PrefixA2 {
    public static String LCP(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] arr = { "list", "listen", "like" };
        System.out.println(LCP(arr));
    }
}
