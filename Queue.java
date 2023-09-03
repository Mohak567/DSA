import java.util.*;

public class QueueReversal {
    public static Queue<Integer> rev(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // Push all elements from the queue into the stack
        while (!q.isEmpty()) {
            s.push(q.poll());
        }

        // Pop elements from the stack and enqueue them back into the queue
        while (!s.isEmpty()) {
            q.offer(s.pop());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("Original Queue: " + queue);
        
        rev(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}