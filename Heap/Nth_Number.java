package Heap;

import java.util.PriorityQueue;

public class Nth_Number {
    public static int find(int n) {
        if (n <= 6) {
            return n;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        for (int i = 1; i < n; i++) {
            int curr = pq.poll();
            while (!pq.isEmpty() && pq.peek() == curr) {
                curr = pq.poll();
            }
            pq.add(curr * 2);
            pq.add(curr * 3);
            pq.add(curr * 5);
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(find(n));
    }
}
