import java.util.Stack;

public class Sort_The_Stack {
    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> S = new Stack<>();
        while (!s.isEmpty()) {
            int temp = s.pop();
            while (!S.isEmpty() && temp > S.peek()) {
                s.push(S.pop());
            }
            S.push(temp);
        }
        return S;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(11);
        s.push(2);
        s.push(32);
        s.push(3);
        s.push(41);
        Stack<Integer> S = sort(s);
        while (!S.isEmpty()) {
            System.out.print(S.pop() + " ");
        }
    }
}