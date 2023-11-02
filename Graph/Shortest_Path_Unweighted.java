package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Shortest_Path_Unweighted {
    static void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int u, int v) {
        // For an undirected graph, connect u and v and then v and u
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    static void shortest_Path(ArrayList<ArrayList<Integer>> adjecentList, int source, int numberofvertices,
            int[] distance) {
        boolean[] visited = new boolean[numberofvertices];
        LinkedList<Integer> q = new LinkedList<>();
        visited[source] = true;
        q.add(source);
        while (!q.isEmpty()) {
            int neighbor = q.poll();
            for (int i : adjecentList.get(neighbor)) {
                if (!visited[i]) {
                    distance[i] = distance[neighbor] + 1;
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int numberOfVertices = 4;
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i <= numberOfVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        addEdge(adjacencyList, 0, 1);
        addEdge(adjacencyList, 0, 2);
        addEdge(adjacencyList, 1, 2);
        addEdge(adjacencyList, 1, 3);
        addEdge(adjacencyList, 2, 3);
        int[] distance = new int[numberOfVertices];
        shortest_Path(adjacencyList, 0, numberOfVertices, distance);
        for (int i : distance) {
            System.out.print(i + " , ");
        }
    }
}
