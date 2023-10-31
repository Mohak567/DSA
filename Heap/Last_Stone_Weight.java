package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Last_Stone_Weight {

    public static int find(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());// (a, b) -> b - a (same condition)
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (pq.size() > 1) {
            int top1 = pq.poll();
            int top2 = pq.poll();
            if (top1 == top2) {
                continue;
            } else {
                pq.add(Math.abs(top1 - top2));
            }
        }
        return pq.size() == 0 ? 0 : pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2 };// 2, 7, 4, 1, 8, 1
        System.out.println(find(arr));
    }
}
