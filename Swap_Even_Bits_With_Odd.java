public class Swap_Even_Bits_With_Odd {
    public static void main(String[] args) {
        int num = 10;
        int even = num & 0xAAAAAAAA;
        int odd = num & 0x55555555;
        even = even >> 1;
        odd = odd << 1;
        System.out.println(even | odd);
    }
}
