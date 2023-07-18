public class Reverse_a_string {
    static String reverse(String str) {
        if (str.length() == 1) {
            return str;
        }
        String ss = str.substring(1);
        String sr = reverse(ss);
        char ch = str.charAt(1);
        return sr + ch;
    }

    public static void main(String[] args) {
        String ori = "bbaaeecc";
        System.out.println(reverse(ori));
    }
}
