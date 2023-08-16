import java.util.ArrayList;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.(LEET CODE [22])
public class Generate_Parentese {
    public static ArrayList<String> generateParentheses(int n) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generate(result, n, 0, 0, sb);
        return result;
    }

    public static void generate(ArrayList<String> result, int n, int opening, int closing, StringBuilder sb) {
        // Termination case
        if (n * 2 == sb.length()) {
            result.add(sb.toString());
            return;
        }
        // Opening condition
        if (opening < n) {
            sb.append("(");
            generate(result, n, opening + 1, closing, sb);
            // Stack fall
            sb.deleteCharAt(sb.length() - 1);
        }
        // Closing condition
        if (closing < opening) {
            sb.append(")");
            generate(result, n, opening, closing + 1, sb);
            // Stack fall
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> result = generateParentheses(n);
        System.out.println(result);
    }
}
