import java.util.HashMap;

public class Find_Iternary_From_Ticket {
    public static String getStar(HashMap<String, String> from) {
        HashMap<String, String> RevMap = new HashMap<>();

        for (String key : from.keySet()) {
            RevMap.put(from.get(key), key);
        }

        for (String key : from.keySet()) {
            if (!RevMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> Ticket = new HashMap<>();
        Ticket.put("B", "C");
        Ticket.put("C", "D");
        Ticket.put("A", "B");
        Ticket.put("E", "F");
        Ticket.put("D", "E");

        String start = getStar(Ticket);

        while (Ticket.containsKey(start)) {
            System.out.print(start + "-->");
            start = Ticket.get(start);
        }
        System.out.println(start);
    }
}
