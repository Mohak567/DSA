public class Sub_String_Palindrome {
    public static boolean IsPalindrome(String S) {
        int i = 0;
        int j = S.length() - 1;
        while (i < j) {
            if (S.charAt(i) != S.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String S = "abcbca";
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                String temp = S.substring(i, j);
                if (IsPalindrome(temp)) {
                    System.out.print(temp + " ");
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
