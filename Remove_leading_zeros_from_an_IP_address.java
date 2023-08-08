public class Remove_leading_zeros_from_an_IP_address {
    /*
     * Given an IP address, remove leading zeros from the IP address. Note that our
     * IP address here can be a little different. It can have numbers greater than
     * 255. Also, it does not necessarily have 4 numbers. The count can be
     * lesser/more.
     */
    public static String findzero(String S) {
        String[] s = S.split("[.]");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            String temp = checkzero(s[i]);
            sb.append(temp);
            sb.append('.');
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static String checkzero(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != '0') {
                return str.substring(i);
            }
        }
        return str.substring(str.length() - 1);
    }

    public static void main(String[] args) {
        String S = "100.020.003.400";
        System.out.println((findzero(S)));

    }
}