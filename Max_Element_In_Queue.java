import java.util.Queue;
import java.util.LinkedList;

public class Max_Element_In_Queue {
    static int maxElement(Queue<Integer> q) {
        int max = Integer.MIN_VALUE;
        int qs = q.size();
        for (int i = 0; i < qs; i++) {
            if (q.peek() > max) {
                max = q.poll();
            } else {
                q.poll();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(0);
        q.offer(10);
        System.out.println(maxElement(q));
    }
}
