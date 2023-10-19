import java.util.LinkedList;
import java.util.Queue;

public class Print_N_Numbers_In_Binary_Form {
    static void print(int n) {
        Queue<String> q = new LinkedList<>();
        q.offer("1");

        for (int i = 0; i < n; i++) {
            String current = q.poll();
            System.out.println(current);
            String e1 = current + "0";
            String e2 = current + "1";
            q.offer(e1);
            q.offer(e2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}
