package Heap;

import java.util.PriorityQueue;

public class Minimum_Difference {
    public static int min(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for (int i : arr) {//// inserting in PQ where values are stored in accending order
            minheap.offer(i);
        }

        int top = minheap.poll();
        int min = Integer.MAX_VALUE;

        while (!minheap.isEmpty()) {
            int curr = minheap.poll();
            int diff = curr - top;
            min = Math.min(min, diff);
            top = curr;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 9, 2, 4, 6, 8, 3, 11, 15, 16 };
        System.out.println(min(arr));
    }
}
