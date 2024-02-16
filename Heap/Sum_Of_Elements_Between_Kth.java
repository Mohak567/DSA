package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Sum_Of_Elements_Between_Kth {
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        long num1 = ksmallest(A,K1);
        long num2 = ksmallest(A,K2);
        
        long sum = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i]>num1 && A[i]<num2){
                sum+=A[i];
            }
        }
        return sum;
    }
    
    public static long ksmallest(long arr[],long k){
        PriorityQueue<Long>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size() > k){
                pq.remove();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        long[] arr = {20, 8, 22, 4, 12, 10, 14};
        long k1 = 3,k2 = 6;
        System.out.println(sumBetweenTwoKth(arr, 7, k1, k2));
    }
}
