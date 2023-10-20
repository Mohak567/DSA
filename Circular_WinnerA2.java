import java.util.LinkedList;
import java.util.Queue;

public class Circular_WinnerA2 {
    static int Josephus(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 4;
        System.out.println(Josephus(n, k));
    }
}
