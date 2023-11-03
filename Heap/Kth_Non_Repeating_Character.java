package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Kth_Non_Repeating_Character {

    public static void find_Kth(String str, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> minheap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            minheap.offer(c);
        }
        int j = 0;
        for (int i = 0; i < k; i++) {
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                if (j == k - 1) {
                    System.out.println(k + " Non-Repeating Character : " + minheap.peek());
                    return;
                } else {
                    minheap.poll();
                    j++;
                }
            }
        }
        System.out.println("K is greater");
    }

    public static void main(String[] args) {
        String str = "aabcccdeeeefg";
        int k = 2;
        find_Kth(str, k);
    }
}
