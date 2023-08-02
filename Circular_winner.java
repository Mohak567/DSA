public class Circular_winner {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int w = 0;
        for (int i = 2; i <= n; i++) {
            w = (w + k) % i;
        }
        System.out.println(w + 1);
    }
}