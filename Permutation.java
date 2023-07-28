import java.util.ArrayList;

public class Permutation {
    static ArrayList<String> getperm(String str) {
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();// return new list with a ""
            list.add("");
            return list;
        }
        char fc = str.charAt(0);// first char of every substring
        ArrayList<String> result = getperm(str.substring(1));// each substring stored
        ArrayList<String> finaList = new ArrayList<>();
        for (String t : result) {// iterating at every element stored in result
            for (int i = 0; i <= t.length(); i++) {// till length of each element
                StringBuilder sb = new StringBuilder(t);// setting length everytime
                sb.insert(i, fc);// inserting 'fc' at 'i' index(0,1,2,3....)
                finaList.add(sb.toString());// add
            }
        }
        return finaList;
    }

    public static void main(String[] args) {
        System.out.println(getperm("abc"));
    }
}
/*
 * LOGIC
 * ""
 * c+""
 * b+c,c+b
 * a+bc, b+a+c, bc+a, a+cb, c+a+b, cb+a
 */