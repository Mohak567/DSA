package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Running_Median {
    static void medians(int[] arr) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            maxHeap.offer(arr[i]);
            minHeap.offer(maxHeap.poll());

            if (maxHeap.size() < minHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }

            if (maxHeap.size() == minHeap.size()) {
                System.out.print((maxHeap.peek() + minHeap.peek()) / 2.0 + " , ");
            } else {
                System.out.print(maxHeap.peek() + " , ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 7, 9, 5, 4, 1, 6 };
        medians(arr);
    }
}
