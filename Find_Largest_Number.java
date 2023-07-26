import java.util.*;

public class Find_Largest_Number {
    public static int findLargestNonDecreasing(int N) {
        int result = 0;
        int prevDigit = 10; // Set the previous digit to a value larger than any possible digit (0-9).

        while (N > 0) {
            int digit = N % 10; // Get the last digit of N.

            if (digit > prevDigit) {
                // If the current digit is greater than the previous digit, decrease the
                // previous digit by 1.
                result = result * 10 + (prevDigit - 1);
                N = N / 10 - 1; // Reduce N by one for a non-decreasing number.
            } else {
                // Otherwise, keep the current digit and add it to the result.
                result = result * 10 + digit;
                prevDigit = digit;
                N = N / 10;
            }
        }

        // Reverse the result to get the correct number.
        int reversedResult = 0;
        while (result > 0) {
            reversedResult = reversedResult * 10 + (result % 10);
            result /= 10;
        }

        return reversedResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = scanner.nextInt();
        scanner.close();

        int result = findLargestNonDecreasing(N);
        System.out.println("The largest number smaller than or equal to " + N +
                " with digits in non-decreasing order is: " + result);
    }
}