package DP;

public class Minimum_Cost_Path {//MCP
    public static int mcpRec(int[][] cost,int m,int n){
        if(m == 0 && n == 0){//square matrix
            return cost[m][n];
        }
        if(m < 0 || n < 0){
            return Integer.MAX_VALUE;
        }
        //diagonal,left,up
        return cost[m][n] + Math.min(Math.min(mcpRec(cost, m-1, n-1),mcpRec(cost, m-1, n)),mcpRec(cost, m, n-1));
    }
    public static int mcpTab(int[][] cost,int m,int n){
        int[][] result = new int[m][n];
        //filling first cell
        result[0][0] = cost[0][0];
        //filling first row
        for(int i=1;i<result.length;i++){
            result[i][0] = cost[i][0]+result[i-1][0];
        }
        //filling first col
        for(int i=1;i<result.length;i++){
            result[0][i] = cost[0][i]+result[0][i-1];
        }
        //diagonal,left,up
        for(int i=1;i<result.length;i++){
            for(int j=1;j<result.length;j++){
                result[i][j] = Math.min(Math.min(result[i-1][j-1],result[i-1][j]),result[i][j-1])+cost[i][j];
            }
        }
        return result[m-1][n-1];
    }
    public static void main(String[] args) {
        int[][] cost = {{2,0,6},{3,1,7},{4,5,9}};
        int res = mcpRec(cost,cost.length-1,cost[0].length-1);
        System.out.println(res);
        res = mcpTab(cost,cost.length,cost.length);
        System.out.println(res);
    }
}
