package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Kth_Most_Occuring_Element {

    static void find_K_Elements(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxheap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxheap.addAll(map.entrySet());
        for (int i = 0; i < k; i++) {
            System.out.print(maxheap.poll().getKey() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 3, 8, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6 };
        int k = 2;
        find_K_Elements(arr, k);
    }
}