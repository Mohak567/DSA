public class Binary_Representation_Of_Next_Number {
    public static String nexString(String S) {
        if (S.equals("0"))
            return "1";

        int i = 0;
        int l = S.length();

        for (i = l - 1; i >= 0; i--) {
            if (S.charAt(i) == '0') {
                S = S.substring(0, i) + '1' + S.substring(i + 1);
                break;
            } else {
                S = S.substring(0, i) + '0' + S.substring(i + 1);
            }
        }
        // if the binary representation
        // contains only the set bits
        if (i < 0) {
            S = "1" + S;
        }
        while (S.charAt(0) == '0') {
            S = S.substring(1);
        }

        // final binary representation
        // of the required integer
        return S;
    }

    public static void main(String[] args) {
        String S = "10101";
        System.out.println(nexString(S));
    }
}