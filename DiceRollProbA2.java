public class DiceRollProbA2 {// without ArrayList
    static void dicegame(int current, int end, String result) {
        if (current == end) {
            System.out.println(result);
            return;
        }
        if (current > end) {
            return;
        }
        for (int dice = 1; dice <= 6; dice++) {
            int newvalue = current + dice;
            dicegame(newvalue, end, result + dice);
        }
    }

    public static void main(String[] args) {
        dicegame(0, 10, "");
    }
}
