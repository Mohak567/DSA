public class Reverse_string {
    static String reverse(String str) {
        if (str.length() == 1) {
            return str;// because at last str will point to the last address
            // or
            // return str.substring(0);
            // or
            // return String.valueOf(str.charAt(0));
        }
        String re = str.substring(1);
        String sresult = reverse(re);
        char ch = str.charAt(0);
        return sresult + ch;

    }

    public static void main(String[] args) {
        System.out.println(reverse("987654321"));
    }
}
