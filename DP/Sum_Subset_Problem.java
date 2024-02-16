package DP;

public class Sum_Subset_Problem {
    static Boolean isSubsetSum(int N, int arr[], int sum){
        boolean[][] matrix = new boolean[N+1][sum+1];
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=sum;j++){
                if(j==0){
                    matrix[i][j] = true;
                }
                else if(i==0){
                    matrix[i][j] = false;
                }
                else {
                    if(arr[i-1]>j){
                        matrix[i][j] = matrix[i-1][j] ;
                    }
                    else{
                        matrix[i][j] = matrix[i-1][j] || matrix[i-1][j-arr[i-1]];
                    }
                }
            }
        }
   return matrix[N][sum];
    }
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        System.out.println(isSubsetSum(6,arr,9));
    }
}
