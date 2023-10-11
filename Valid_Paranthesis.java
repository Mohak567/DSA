import java.util.Stack;

public class Valid_Paranthesis {
    public static boolean VP(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            // if(s.isEmpty() && i == str.length()-1){
            // return true;
            // }
            char ch = str.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                } else if (!isPair(s.peek(), ch)) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }

    public static boolean isPair(char a, char b) {
        if (a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(){}{[]}";
        System.out.println(VP(str));
    }
}