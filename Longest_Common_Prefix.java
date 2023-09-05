public class Longest_Common_Prefix {
    public static String LCP(String[] arr) {
        int maxl = Integer.MAX_VALUE;
        for (String s : arr) {
            if (maxl > s.length()) {
                maxl = s.length();
            }
        }
        String ans = "";

        for (int i = 0; i < maxl; i++) {
            char c = arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (arr[j].charAt(i) != c) {
                    return ans;
                }
            }
            ans += c;
        }
        if (ans.length() == 0) {
            System.out.println("no common prefix");
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] arr = { "list", "listen", "like" };
        System.out.println(LCP(arr));
    }
}
