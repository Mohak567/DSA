package CodeVita;

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;
import java.util.*;

public class WebPage {

    public static int find(List<List<Integer>> links, int s, int e) {
        int count = 0;
        if (s == e) {
            return count;
        }
        if (links.size() == 0) {
            return -1;
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[links.size()];
        visited[s - 1] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int wp = q.poll();
            if (wp == e) {
                return count;
            }
            for (int i : links.get(wp - 1)) {
                if (!visited[i - 1]) {
                    q.add(i);
                    visited[i - 1] = true;
                }
            }
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_Of_Pages = 3;
        int start = 2, end = 3;

        List<List<Integer>> links = new ArrayList<>();

        for (int i = 1; i <= number_Of_Pages; i++) {
            System.out.println("Enter the number of linked pages for page " + i + ":");
            int n = sc.nextInt();
            List<Integer> linkedPages = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                linkedPages.add(sc.nextInt());
            }
            links.add(linkedPages);
        }
        int ans = find(links, start, end);
        System.out.println(ans != -1 ? "Minimum counts" + ans : "No linking");

    }
}
