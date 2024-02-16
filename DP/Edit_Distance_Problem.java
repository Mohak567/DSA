package DP;

public class Edit_Distance_Problem {
    public static int edpRec(String s1,String s2,int n,int m){
        if(n == 0){
            return m;
        }
        if(m == 0){
            return n;
        }
        //char matches
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return edpRec(s1, s2, n-1, m-1);
        }
        //char not matches
        int insert = edpRec(s1, s2, n, m-1);
        int replace = edpRec(s1, s2, n-1, m-1);
        int delete = edpRec(s1, s2, n-1, m);

        int min = Math.min(insert, delete);

        return 1 + Math.min(replace, min);
    }
    public static int edpTab(String s1,String s2,int m,int n){
        int[][] matrix = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i == 0){
                    matrix[i][j] = j;
                }
                else if(j == 0){
                    matrix[i][j] = i;
                }//char matches
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    matrix[i][j] = matrix[i-1][j-1];
                }
                //char not matches
                else{
                    int replace = matrix[i-1][j-1];
                    int insert = matrix[i][j-1];
                    int delete = matrix[i-1][j];
                    int min = Math.min(insert, delete);
                    matrix[i][j] = 1 + Math.min(replace, min);
                }
            }
        }
        return matrix[m][n];
    }
    public static void main(String[] args) {
        System.out.println(edpRec("sunday", "saturday", 6, 8));
        System.out.println(edpTab("sunday", "saturday", 6, 8));
    }
}
