public class Reversing_The_Equation {
    public static String reverseEqn(String S) {
        String s = "";
        StringBuilder sb = new StringBuilder();
        for (int i = S.length() - 1; i >= 0; i--) {
            if (Character.isDigit(S.charAt(i))) {
                s = S.charAt(i) + s;
            } else {
                sb.append(s);
                sb.append(S.charAt(i));
                s = "";
            }
        }
        sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEqn("20-3+5*2"));
    }
}
