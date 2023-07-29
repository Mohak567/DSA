import java.util.ArrayList;

public class DiceRollProbR {
    static ArrayList<String> dicegame(int currentvalue, int endvalue) {
        if (currentvalue == endvalue) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        if (currentvalue > endvalue) {
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        ArrayList<String> finaList = new ArrayList<>();
        for (int dice = 1; dice <= 6; dice++) {
            int newvalue = dice + currentvalue;
            ArrayList<String> list = dicegame(newvalue, endvalue);
            for (String s : list) {
                finaList.add(s + dice);
            }
        }
        return finaList;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = dicegame(0, 3);
        System.out.println(ans);
        System.out.println(ans.size());
    }
}
