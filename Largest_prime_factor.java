public class Largest_prime_factor {
    // find largest prime factor(GFG)
    public static long largestPrimeFactor(int N) {
        long largestFactor = -1;

        // Step 1 and 2: Remove factors of 2
        while (N % 2 == 0) {
            largestFactor = 2;
            N /= 2;
        }

        // Step 3 and 4: Check odd factors up to N/2
        for (int i = 3; i <= N / 2; i += 2) {
            while (N % i == 0) {
                largestFactor = i;
                N /= i;
            }
        }

        // Step 5: If N is still greater than 2, it's a prime factor
        if (N > 2) {
            largestFactor = N;
        }

        return largestFactor;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(23));
    }
}