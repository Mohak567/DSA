import java.math.BigInteger;

public class Sum_of_two_large_numbers_given_in_String {
    public static String findSum(String X, String Y) {
        /* java.math. */BigInteger x = new BigInteger(X);// without header file
        BigInteger y = new BigInteger(Y);
        BigInteger ans = x.add(y);

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(findSum("150", "300"));
    }
}
