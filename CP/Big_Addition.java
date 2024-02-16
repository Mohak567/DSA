package CP;

public class Big_Addition {
    public static void add(String n1,String n2){
        if(n1.length()<n2.length()){//Swap
            String temp = n1;
            n1 = n2;
            n2 = temp;
        }
        int carry = 0;
        int diff = n1.length()-n2.length();
        StringBuilder sb = new StringBuilder();
        for(int i=n2.length()-1;i>=0;i--){
            int temp1 = n1.charAt(i+diff)-'0';
            int temp2 = n2.charAt(i)-'0';
            int sum = temp1+temp2+carry;
            carry = sum/10;
            sum = sum%10;
            sb.insert(0,sum);
        }
        for(int i=diff-1;i>=0;i--){
            int num = n1.charAt(i)-'0';
            int sum = num+carry;
            carry = sum/10;
            sum = sum%10;
            sb.insert(0,sum);
        }
        if(carry>0){
            sb.insert(0, carry);
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        add("1234","8766");
    }
}