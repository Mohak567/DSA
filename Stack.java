import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int peek() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(50);
        s.push(10);
        s.push(60);
        s.push(90);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}
