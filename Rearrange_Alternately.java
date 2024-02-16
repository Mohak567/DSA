public class Rearrange_Alternately {
    public static void rearrange(long arr[], int n){
        
        long max = arr[n-1]+1;
        int firstIndex = 0;
        int lastIndex = n-1;
        for(int i=0; i<n; i++){
            if(i%2==0){
                arr[i] = arr[i] + (arr[lastIndex]%max)*max;
                System.out.println(arr[i]);
                lastIndex--;
            }
            else {
                arr[i] = arr[i] + (arr[firstIndex]%max)*max;
                System.out.println(arr[i]);
                firstIndex++;
            }
        }
        
        for(int i=0; i<n; i++){
            arr[i] = arr[i]/max;
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5,6};
        rearrange(arr,6);
    }
}