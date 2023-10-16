import java.util.Stack;

public class Postfix_Expression_Calculation {// reverse polish notation
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        String str = "3897*/+";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int temp = ch - '0';
                s.push(temp);
            } else {
                if (ch == '/') {
                    int num1 = s.pop();
                    int num2 = s.pop();
                    int ans = num1 / num2;
                    s.push(ans);
                } else if (ch == '*') {
                    int num1 = s.pop();
                    int num2 = s.pop();
                    int ans = num1 * num2;
                    s.push(ans);
                } else if (ch == '+') {
                    int num1 = s.pop();
                    int num2 = s.pop();
                    int ans = num1 + num2;
                    s.push(ans);
                } else if (ch == '-') {
                    int num1 = s.pop();
                    int num2 = s.pop();
                    int ans = num1 - num2;
                    s.push(ans);
                }
            }
        }
        System.out.println(s.peek());
    }
}
