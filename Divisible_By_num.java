public class Divisible_By_num {
    public static void main(String[] args) {
        String binary_num = "101100";// 22
        int rem = 0;
        int num = 11;
        for (int i = 0; i < binary_num.length(); i++) {
            rem = (rem * 2 + (binary_num.charAt(i) - '0')) % num;
        }
        System.out.println(rem == 0 ? "Divisible" : "Not Divisble");
    }
}
