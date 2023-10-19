import java.util.LinkedList;
import java.util.Queue;

public class Reverse_The_QueueR {
    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int front = q.poll();
        reverse(q);
        q.offer(front);
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