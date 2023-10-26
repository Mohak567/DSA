package Heap;

import java.util.PriorityQueue;

class Minimum_Cost_Of_Ropes {
    public static int minCost(int arr[]) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for (int i : arr) {
            minheap.offer(i);
        }

        int cost = 0;

        while (minheap.size() != 1) {
            int i = minheap.poll();
            int j = minheap.poll();
            cost += i + j;
            minheap.offer(i + j);
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 6, 9 };
        System.out.println(minCost(arr));
    }
}
