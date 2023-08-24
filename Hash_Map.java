import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // key , value

        // Insertion
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(5, "d");
        map.put(4, "e");
        map.put(2, "f");

        // remove
        map.remove(3);

        map.containsKey(4);// checking by key
        map.containsValue("kldm");// checking by value

        // extracting particular key
        map.get(6);// using key if exists return true

        // Iteration A1
        for (Map.Entry<Integer, String> e : map.entrySet()) {// for each
            System.out.print(e.getKey() + " ");// by key
            System.out.println(e.getValue());// by value
        }

        // Iteration A2
        Set<Integer> keys = map.keySet();
        for (Integer i : keys) {
            System.out.println(i + " " + map.get(i));
        }

        // full map display
        System.out.println(map);
    }
}
