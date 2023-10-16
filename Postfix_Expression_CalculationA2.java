import java.util.Stack;

public class Postfix_Expression_CalculationA2 {// more than 1 digit can be used
    public static int calculation(String str) {
        String[] arr = str.split(" ");
        Stack<Integer> s = new Stack<>();
        for (String i : arr) {
            if (operand(i)) {
                s.push(Integer.parseInt(i));
            } else if (operator(i)) {
                int num1 = s.pop();
                int num2 = s.pop();
                int ans = operation(num1, num2, i);
                s.push(ans);
            }
        }
        return s.peek();
    }

    public static boolean operand(String s) {
        return s.matches("-?\\d+");// -? is for negative numbers \\d+ is for positivive numbers
    }

    public static boolean operator(String s) {
        return s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-");
    }

    public static int operation(int num1, int num2, String operator) {
        switch (operator) {
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            default:
                throw new IllegalArgumentException("invalid operator");
        }
    }

    public static void main(String[] args) {
        String s = "17 8 5 * +";
        System.out.println(calculation(s));
    }
}
