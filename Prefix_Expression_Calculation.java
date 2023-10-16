import java.util.Stack;

public class Prefix_Expression_Calculation {// polish notation
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        String str = "-/*5944";
        for (int i = str.length() - 1; i >= 0; i--) {
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
