package DP;

public class DiceCount {
    //recursion
    public static int countwaysrec(int current,int target){
        if(current == target){
            return 1;
        }
        if(current > target){
            return 0;
        }
        int count = 0;
        for(int dice = 1;dice<=6;dice++){
            count = count + countwaysrec(current+dice,target);
        }
        return count;
    }
    //memorization
    public static int countwaysmemo(int current,int target,int[] cache){
        if(current == target){
            return 1;
        }
        if(current > target){
            return 0;
        }
        if(cache[current] != 0){
            return cache[current];
        }
        int count = 0;
        for(int dice = 1;dice<=6;dice++){
            count = count + countwaysmemo(current+dice,target,cache);
        }
        cache[current] = count;
        return count;
    }
    public static void main(String[] args) {
        int target = 4;
        System.out.println(countwaysrec(0, target));
        int[] cache = new int[target+1];
        System.out.println(countwaysmemo(0, target,cache));
    }
}
