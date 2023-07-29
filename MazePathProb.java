import java.util.ArrayList;

public class MazePathProb {
    static ArrayList<String> path(int initial_row, int initial_coloumn, int end_row, int end_coloumn) {
        if (initial_coloumn > end_coloumn || initial_row > end_row) {
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        if (initial_coloumn == end_coloumn && initial_row == end_row) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        ArrayList<String> finallist = new ArrayList<>();
        ArrayList<String> rightmove = path(initial_row, initial_coloumn + 1, end_row, end_coloumn);
        for (String e : rightmove) {
            finallist.add("R" + e);
        }
        ArrayList<String> downmove = path(initial_row + 1, initial_coloumn, end_row, end_coloumn);
        for (String e : downmove) {
            finallist.add("D" + e);
        }
        return finallist;
    }

    public static void main(String[] args) {
        ArrayList<String> result = path(0, 0, 2, 2);
        System.out.println(result);
    }
}
