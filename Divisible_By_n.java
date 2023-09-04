public class Divisible_By_n {
    public static void main(String[] args) {
        String num = "44";
        int rem = 0;
        int n = 11;
        for (int i = 0; i < num.length(); i++) {
            rem = ((rem * 10) + (num.charAt(i) - '0')) % n;
        }
        System.out.println(rem == 0 ? "Divisible" : "Not Divisible");
    }
}
