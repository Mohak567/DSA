package DP;

public class Longest_Common_Subsequence {
    //recursion
    public static int lcsrec(String s1,String s2){
        //termination case
        if(s1.length() == 0 || s2.length() == 0){
            return 0;
        }
        int count = 0;
        //if char matches
        if(s1.charAt(0) == s2.charAt(0)){
            count = 1 + lcsrec(s1.substring(1), s2.substring(1));
        }
        else{
            //if char not matches
            int result1 = lcsrec(s1.substring(1), s2);
            int result2 = lcsrec(s1, s2.substring(1));
            count = Math.max(result1, result2);
        }
        return count;
    }
    //memorization
    public static int lcsmemo(String s1,String s2,int m,int n,int[][] cache){
        //termination case
        if(m == 0 || n == 0){
            return 0;
        }
        //present in cache?
        if(cache[m-1][n-1] != 0){
            return cache[m-1][n-1];
        }
        //char matches
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            cache[m-1][n-1] = 1 + lcsmemo(s1, s2, m-1, n-1, cache);
            return cache[m-1][n-1];
        }
        else{
            //char not matches
            int result1 = lcsmemo(s1, s2, m-1, n, cache);
            int result2 = lcsmemo(s1, s2, m, n-1, cache);
            cache[m-1][n-1] = Math.max(result1, result2);
            return cache[m-1][n-1];
        }
    }

    //Tabulation
    public static int lcstab(String s1,String s2,int m,int n){
        int[][] matrix = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i == 0 || j == 0){
                    matrix[i][j] = 0;
                }
                else{
                    //char matches
                    if(s1.charAt(i-1) == s2.charAt(j-1)){
                        matrix[i][j] = 1 + matrix[i-1][j-1];
                    }
                    //char not matches
                    else{
                        matrix[i][j] = Math.max(matrix[i-1][j],matrix[i][j-1]);
                    }
                }
            }
        }
        return matrix[m][n];
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        //System.out.println(lcsrec(s1,s2));
        //int[][] cache = new int[s1.length()][s2.length()];
        // System.out.println(lcsmemo(s1,s2,s1.length(),s2.length(),cache));
        System.out.println(lcstab(s1,s2,s1.length(),s2.length()));
    }
}