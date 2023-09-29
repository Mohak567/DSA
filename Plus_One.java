import java.util.ArrayList;

public class Plus_One {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        int carry = 1;
        for (int i = N - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry;
            arr.set(i, sum % 10);
            carry = sum / 10;
        }
        if (carry != 0) {
            arr.add(0, carry);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        System.out.println(increment(arr, 3));
    }
}
