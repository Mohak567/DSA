package Graph;

import java.util.ArrayList;

public class DFS_For_Disconnected_Graph {

    static void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int u, int v) {
        // For an undirected graph, connect u and v and then v and u
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    static void depthFirstSearch(ArrayList<ArrayList<Integer>> adjacencyList, int numberOfVertices) {
        boolean[] visited = new boolean[numberOfVertices + 1];
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                depthFirstSearch(adjacencyList, i, visited);
            }
        }
    }

    static void depthFirstSearch(ArrayList<ArrayList<Integer>> adjacencyList, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " , ");
        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                depthFirstSearch(adjacencyList, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        int numberOfVertices = 6;
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i <= numberOfVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        addEdge(adjacencyList, 1, 2);
        addEdge(adjacencyList, 1, 3);
        addEdge(adjacencyList, 4, 5);
        addEdge(adjacencyList, 5, 6);
        depthFirstSearch(adjacencyList, numberOfVertices);
    }
}
