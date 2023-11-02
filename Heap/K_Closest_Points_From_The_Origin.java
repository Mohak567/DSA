package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class K_Closest_Points_From_The_Origin {

    static void find(int[] a, int[] A, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int x = (int) Math.pow(a[i], 2);// a[i]*a[i]
            int y = (int) Math.pow(A[i], 2);
            int cal = (int) Math.sqrt(x + y);
            map.put(i + 1, cal);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minheap = new PriorityQueue<>(
                (a1, b) -> a1.getValue() - b.getValue());
        minheap.addAll(map.entrySet());

        for (int i = 0; i < k; i++) {
            System.out.print(minheap.poll().getKey() + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { -3, 4, 2 };
        int[] A = { 7, -3, 2 };
        int k = 2;
        find(a, A, k);

    }
}