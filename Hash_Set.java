import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();
        // Add
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(1);
        // Contain
        if (set.contains(3)) {
            System.out.println("contains");
        }
        if (!set.contains(6)) {
            System.out.println("6 is not present");
        }
        // Remove
        set.remove(1);
        // Iteration
        Iterator it = set.iterator();
        while (it.hasNext()) {// hasNext() for checking
            System.out.print(it.next() + " ");// next for printing
        }
    }
}
