public class PalindromeStr {
    static String palin(String s) {
        if (s.length() == 1) {
            return s;
        }
        String ss = s.substring(1);
        String sr = palin(ss);
        char ch = sr.charAt(0);
        return ss + ch;
    }

    public static void main(String[] args) {
        String str = "kkk";
        String s = palin(str);
        if (s.equals(str)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
