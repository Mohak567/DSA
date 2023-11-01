package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Median {
    public static void find(int[] arr) {
        // for storing two half of the array
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            maxHeap.offer(arr[i]);
            minHeap.offer(maxHeap.poll());

            if (maxHeap.size() < minHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }
        }

        if (maxHeap.size() == minHeap.size()) {
            System.out.println((maxHeap.peek() + minHeap.peek()) / 2.0);
        } else {
            System.out.println(maxHeap.peek());
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1, 4, 6 };
        find(arr);
    }
}
