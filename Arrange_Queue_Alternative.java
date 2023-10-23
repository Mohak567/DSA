import java.util.LinkedList;
import java.util.Queue;

public class Arrange_Queue_Alternative {
    static Queue<Integer> arrange(Queue<Integer> q) {
        Queue<Integer> temp = new LinkedList<>();
        int tsize = q.size() / 2;
        int i = 0;
        while (i < tsize) {
            temp.offer(q.poll());
            i++;
        }

        while (!temp.isEmpty()) {
            q.offer(temp.poll());
            q.offer(q.poll());
        }
        return q;
    }

    // stack can also be used
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        q.offer(7);
        System.out.println(arrange(q));
    }
}
