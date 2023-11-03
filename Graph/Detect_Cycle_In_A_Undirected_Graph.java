package Graph;

import java.util.ArrayList;

public class Detect_Cycle_In_A_Undirected_Graph {
    static void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int u, int v) {
        // For an undirected graph, connect u and v and then v and u
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public static boolean depthFirstSearch(ArrayList<ArrayList<Integer>> adjacencyList, int numberOfVertices) {
        boolean[] visited = new boolean[numberOfVertices + 1];
        for (int i = 0; i < numberOfVertices; i++) {
            if (!visited[i]) {
                if (depthFirstSearch(adjacencyList, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean depthFirstSearch(ArrayList<ArrayList<Integer>> adjacencyList, int vertex, boolean[] visited,
            int parent) {
        visited[vertex] = true;
        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                if (depthFirstSearch(adjacencyList, neighbor, visited, vertex)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numberOfVertices = 7;
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i <= numberOfVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        addEdge(adjacencyList, 1, 2);
        addEdge(adjacencyList, 1, 3);
        addEdge(adjacencyList, 2, 4);
        addEdge(adjacencyList, 2, 5);
        // addEdge(adjacencyList, 3, 5);
        // addEdge(adjacencyList, 5, 6);
        addEdge(adjacencyList, 4, 6);
        System.out.print(depthFirstSearch(adjacencyList, numberOfVertices));
    }
}
