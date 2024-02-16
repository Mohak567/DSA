package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class id {
    public static void Knumber(int[]arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> max = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        max.addAll(map.entrySet());
        for(int i=0;i<k;i++){ 
            if(max.size()==0){
                System.out.println("K is greater then number present");
                return;
            }
            System.out.println(max.poll().getKey()+" ");
        }
    }

    public static void KClosest(int[]a,int[] ar,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<ar.length;i++){
            int temp = a[i]*a[i];
            int temp2 = ar[i]*ar[i];
            int cal = temp + temp2;
            map.put(i+1, cal);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> min = new PriorityQueue<>((a1,b)->a1.getValue()-b.getValue());
        min.addAll(map.entrySet());
        for(int i=0;i<k;i++){ 
            if(min.size()==0){
                System.out.println("K is greater then number present");
                return;
            }
            System.out.println(min.poll().getKey()+" ");
        }
    }
    public static void main(String[] args) {
        // int[] arr ={1,1,1,1,2,2,2,3,3,3,3,3,3};
        // int k = 4;
        // Knumber(arr, k);
        int[] a = {-2,5,-2,-4};
        int[] arr = {-2,2,5,4};
        int k = 2;
        KClosest(a,arr,k);
    }
}
