package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Sort_By_Frequency {
    public static String sort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // for adding characters in
        // decending order
        // according to their
        // frequecy
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            int f = map.get(c);
            for (int i = 0; i < f; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(sort(str));
    }
}
