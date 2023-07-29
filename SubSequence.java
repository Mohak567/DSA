public class SubSequence {// without ArrayList or storing
    static void sub(String s, String result) {
        if (s.length() == 0) {
            System.out.print(" " + result);
            return;
        }
        char fc = s.charAt(0);
        String smallstring = s.substring(1);
        sub(smallstring, result);
        sub(smallstring, result + fc);
    }

    public static void main(String[] args) {
        sub("abc", "");
    }
}
