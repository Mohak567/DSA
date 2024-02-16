package DP;

public class FibSeries {
    public static long fibrec(int n){
        if(n<=1){
            return n;
        }
        long first = fibrec(n-1);
        long second = fibrec(n-2);
        long result = first+second;
        return result;
    }
    //Using Memorization,recursion is used
    //it is a top-down approach
    public static long fibmemo(int n,long[] cache){
        if(n<=1){
            return n;
        }
        if(cache[n] != 0){
            return cache[n];
        }
        long first = fibmemo(n-1,cache);
        long second = fibmemo(n-2,cache);
        long result = first+second;
        cache[n] = result;
        return cache[n];
    } 
    public static void main(String[] args) {
        int n = 35;
        long start = System.currentTimeMillis();
        long result = fibrec(n);
        long end = System.currentTimeMillis();
        long total = end-start;
        System.out.println("Using Recursion : "+result+" Time Taken : "+total);
        long[] cache = new long[n+1];
        start = System.currentTimeMillis();
        result = fibmemo(n, cache);
        end = System.currentTimeMillis();
        total = end-start;
        System.out.println("Using DP : "+result+" Time Taken : "+total);
    }
}
