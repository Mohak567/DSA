import java.util.ArrayList;

class Subsequence {
    static ArrayList<String> getsubseq(String str) {
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char fc = str.charAt(0);
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> list = getsubseq(str.substring(1));
        for (String s : list) {
            result.add(s);
            result.add(fc + s);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> li = getsubseq("mohak");
        System.out.println(li);
    }
}