import java.util.ArrayList;

public class Nth_Row_Of_Pascal_Triangle {
    static ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<Long>list=new ArrayList<>();
        long[][] arr = new long[n][n]; 
        int m=1000000007;
    for (int i = 0; i < n; i++){
        for (int j = 0; j <= i; j++){
            if (i == j || j == 0){
                arr[i][j] = 1;
                // System.out.print(arr[i][j]);
            }
            else{
                arr[i][j] = (arr[i-1][j-1]%m + arr[i-1][j]%m)%m;
                // System.out.print(arr[i][j]);
            }
        }
        // System.out.println();
    }
    for(int i=0;i<=n-1;i++){
        list.add(arr[n-1][i]);
    }
    return list;
    }

    public static void main(String[] args) {
        ArrayList<Long> l = nthRowOfPascalTriangle(4);
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i));
        }
    }
}
