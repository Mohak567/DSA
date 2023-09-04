public class Bit_question {
    public static void main(String[] args) {
        // shift operator
        // int n = 5;
        // System.out.println(n << 1);// left shift
        // System.out.println(n >> 1);// right shift

        // checking n is even or odd
        // int num = 5;
        // System.out.println((num & 1) == 1 ? "odd" : "even");// by checking last bit
        // of n

        // get bit on k th position of number
        // int number = 20;
        // int k = 2;
        // int mask = 1 << k;// left shift so that it can reach at that position of the
        // bit of number
        // // 1 0 1 0 0 number in bits
        // // 0 0 1 0 0 mask
        // System.out.println((number & mask) > 0 ? "1" : "0");
        // if output is greater than 0 ,bit is 1 otherwise 0 at that position

        // set bit 1 at kth position
        // int num = 4;
        // int k = 1;// position
        // int mask = 1 << k;//left shift
        // // 1 0 0 num
        // // 0 1 0 mask
        // // 1 1 0 result
        // System.out.println((num | mask));

        // clear k th bit
        // int a = 12;
        // int k = 3;
        // int mask = ~(1 << k);
        // // 1 1 0 0 a
        // // 0 1 1 1 after negation of 1 0 0 0 mask
        // // 0 1 0 0 result
        // System.out.println(a & mask);

        // check weather the number is power of 2 or not
        // int b = 20;
        // System.out.println((b & (b - 1)) == 0 ? "yes" : "no");

        // clear i bits from the number

        // int c = 12;
        // int i = 3;
        // int mask = (~0 << i);
        // System.out.println(c & mask);

        // check given numbers are of same signs or not

        // int a = -66465;
        // int b = 25;
        // int n = a ^ b;
        // System.out.println(n < 0 ? "no" : "yes");

        // Increase the number by one

        // int n = 6;
        // int temp = -(~n);
        // System.out.println(temp);

        // second approach

        // int n = 6;
        // int temp = n | 1;
        // System.out.println(temp);

        // multiply without using * operator

        // int n = 10;
        // // double number_to_be_multiply = 4.5; 4 can be only 2^k
        // System.out.println((n << 2) + (n >> 1));
        // // 2^k //divide by 2^k

        // find xor without xor operator

        int a = 5;
        int b = 6;
        // a ^ b = ~b&a+~a&b
        System.out.println((~b & a) + (~a & b));
    }
}
