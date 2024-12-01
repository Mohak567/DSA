package SomePrograms;

import java.util.Arrays;
import java.util.PriorityQueue;

public class nearlySorted {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        int length = arr.length;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i=0;i<=k && i < length;i++){
            minHeap.offer(arr[i]);
        }

        int index = 0;
        for(int i=k+1;i<length;i++){
            arr[index++] = minHeap.poll();
            minHeap.offer(arr[i]);
        }

        while(!minHeap.isEmpty()){
            arr[index++] = minHeap.poll();
        }

        System.out.println(Arrays.toString(arr));
    }
}
