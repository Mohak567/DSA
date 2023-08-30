class First_And_Last_Occurence{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = n-1;
        int min = -1;
        int max = -1;
        
        // first occurence
        while(start <= end) {
            int mid = start + (end-start)/2;
            
            if(arr[mid] == x) {
                min = mid;
                end = mid-1;
            } else if(arr[mid] < x) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        
        start=0;
        end = n-1;
        
          // last occurence
        while(start <= end) {
            int mid = start + (end-start)/2;
            
            if(arr[mid] == x) {
                max = mid;
                start = mid+1;
            } else if(arr[mid] > x) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        
        if(min == -1 && max == -1) {
            list.add(-1);
        } else {
            list.add(min);
            list.add(max); 
        }
        
        
        return list;
    }
  public static void main(String[] args){
    int[] arr ={1,2,3,6,5,8,3};
    System.out.println(firstAndLast(arr,7,3));
  }
}
