import java.util.ArrayList;

public class PhoneNumberPro {
    public static ArrayList<String> combinations(String[] phonekeys, String digits) {
        if (digits.length() == 0) {// termination case
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char firstchar = digits.charAt(0);// first char
        int index = firstchar - '0';// conversion of first char into integer
        String valueofkey = phonekeys[index];// getting value according to the index of phonekeys
        String RemainingDigits = digits.substring(1);// store remaining string
        ArrayList<String> finalresult = new ArrayList<>();
        for (int i = 0; i < valueofkey.length(); i++) {
            ArrayList<String> result = combinations(phonekeys, RemainingDigits);
            for (String s : result) {
                finalresult.add(valueofkey.charAt(i) + s);
            }
        }
        return finalresult;
    }

    public static void main(String[] args) {
        String Phonekeys[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        String digits = "23";
        ArrayList<String> ans = combinations(Phonekeys, digits);
        System.out.println(ans);
    }
}
