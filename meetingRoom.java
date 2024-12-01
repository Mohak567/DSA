package SomePrograms;

import java.util.Arrays;

public class meetingRoom {
    public static void main(String[] args) {
        int[][] time = {{1, 4}, {10, 15}, {7, 10}};

        System.out.println(sol(time));
        // System.out.println(time[0][0]);
        // System.out.println(time[1][0]);
        // System.out.println(time[2][0]);
    }

    public static boolean sol(int[][] time){
        int n = time.length;
        
        Arrays.sort(time,(a,b) -> Integer.compare(a[0], b[0]));

        for(int i=0;i<n-1;i++){
            if(time[i][1] > time[i+1][0]){
                return false;
            }
        }
        return true;
    }
}
