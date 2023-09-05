import java.util.ArrayList;

public class Suffix_Prefix {
    public static void main(String[] args) {
        String s = "mohak khare";
        int n = s.length();
        int j = 1;
        ArrayList<String> pre = new ArrayList<>();
        ArrayList<String> suf = new ArrayList<>();
        for (int i = 0; i < n && j <= n; i++) {
            pre.add(s.substring(0, j++));
            suf.add(s.substring(n - 1 - i));
        }
        System.out.println(pre);
        System.out.println(suf);
    }
}
