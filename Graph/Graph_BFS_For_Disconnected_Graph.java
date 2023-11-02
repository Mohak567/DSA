package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph_BFS_For_Disconnected_Graph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // for an undirected graph, connect u and v and then v and u
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, int source, boolean[] visited) {
        visited[source] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);
        while (queue.size() != 0) {
            // pop and retrieve first element of queue
            source = queue.poll();
            System.out.print(source + ",");
            // get number of adjacent vertices of current source
            int size = adj.get(source).size();
            for (int i = 0; i < size; i++) {
                // get adjacent node
                int adjNode = adj.get(source).get(i);
                if (visited[adjNode] == false) {
                    visited[adjNode] = true;
                    queue.add(adjNode);
                }
            }
        }
    }

    public static void Disconnected(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        int count = 0;
        for (int i = 0; i < v; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                bfs(adj, i, visited);
                count++;
            }
        }
        System.out.println("Number of connected components: " + count);
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 1, 3);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);
        Disconnected(adj, V);
    }
}