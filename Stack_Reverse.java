import java.util.Stack;

public class Stack_Reverse {
    public static void reverse(Stack<Integer> s) {
        Stack<Integer> S = new Stack<>();
        while (!s.isEmpty()) {
            S.push(s.pop());
        }
        s.addAll(S);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(7);
        s.push(6);
        System.out.println("Original Stack " + s);
        reverse(s);
        System.out.println("Reverse Stack " + s);
    }
}
