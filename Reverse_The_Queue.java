import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_The_Queue {// using stack
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.offer(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println("Original " + q);
        reverse(q);
        System.out.println("Reversed " + q);
    }
}
