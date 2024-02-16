package CP;

public class Big_Multi {
    public static void mux(String n1,String n2){
        if(n1.length()<n2.length()){//Swap
            String temp = n1;
            n1 = n2;
            n2 = temp;
        }
        int carry = 0;
        for(int i=n1.length()-1;i>=0;i--){
            int t = n1.charAt(i);
            for(int j = n2.length()-1;j>=0;j--){
                int te = n2.charAt(j);
                int  = 0;

            }
        }
    }
    public static void main(String[] args) {
        
    }
}
