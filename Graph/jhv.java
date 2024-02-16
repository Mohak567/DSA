package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class jhv {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int a,int b){
        adj.get(a).add(b);
        adj.get(b).add(a);
    }
    public static void print(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            System.out.print(i+" = ");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+",");
            }
            System.out.println();
        }
    }
    //bfs
        public static void bfs(ArrayList<ArrayList<Integer>> adj,int source,boolean[] arr){
            // boolean[] arr = new boolean[vertex+1];
            // for(int i=0;i<arr.length;i++){
            //     arr[i] = false;
            // }
            // int source = 1;
            arr[source] = true;
            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(source);
            while(!queue.isEmpty()){
                //pop
                source = queue.pop();
                System.out.print(source+" , ");
                int size =adj.get(source).size();
                for(int i=0;i<size;i++){
                    int adjNode = adj.get(source).get(i);
                    if(arr[adjNode] == false){
                        arr[adjNode] = true;
                        queue.offer(adjNode);
                    }
                }
            }
        }
        public static void disbfs(ArrayList<ArrayList<Integer>>adj,int vertex){
            boolean[] arr = new boolean[vertex+1];
            // for(int i=0;i<arr.length;i++){
            //     arr[i] = false;
            // 
            for(int i=0;i<arr.length;i++){
                if(!arr[i]){
                    bfs(adj, i, arr);
                }
            }
        }
        //dfs
        public static void dfs(ArrayList<ArrayList<Integer>> adj,int vertex){
            boolean[] arr = new boolean[vertex+1];
            dfsrec(adj,0,arr);
            for(int i=0;i<arr.length;i++){
                if(!arr[i]){
                    dfsrec(adj, i, arr);
                }
            }
        }
        public static void dfsrec(ArrayList<ArrayList<Integer>> adj,int source,boolean[] arr){
            arr[source]=true;
            System.out.print(source+", ");
            for(int i : adj.get(source)){
                if(!arr[i]){
                    dfsrec(adj, i, arr);
                }
            }
        }
        public static void Shortest_Path_Unweighted(ArrayList<ArrayList<Integer>>adj,int source,int vertex,int[] distance){
            distance[source]=0;
            boolean[] arr = new boolean[vertex+1];
            arr[source] = true;
            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(source);
            while(!queue.isEmpty()){
                int u = queue.poll();
                for(int i : adj.get(u)){
                    if(!arr[i]){
                        distance[i] = distance[u]+1;
                        arr[i] =true;
                        queue.add(i);
                    }
                }
            }
        }

        public static boolean dfs(ArrayList<ArrayList<Integer>> adj,int vertex, int source){
            boolean[] arr = new boolean[vertex+1];
            //dfsrec(adj,source,arr,-1);
            for(int i=0;i<arr.length;i++){
                if(!arr[i]){
                    if(dfsrec(adj, i, arr,source)){
                        return true;
                    }
                }
            }
            return false;
        }
        public static boolean dfsrec(ArrayList<ArrayList<Integer>> adj,int source,boolean[] arr,int parent){
            arr[source]=true;
            // System.out.print(source+", ");
            for(int i : adj.get(source)){
                if(!arr[i]){
                    if (dfsrec(adj, i, arr,source)){
                        return true;
                    }
                }
                else if(i != parent){
                    return true;
                }
            }
            return false;
        }
    public static void main(String[] args) {
        int vertex = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<vertex+1;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,2,3);
        addEdge(adj, 3,4);
        addEdge(adj, 4,5);
        addEdge(adj,5,6);
        addEdge(adj, 4,6);
        //print(adj);
        // disbfs(adj, vertex);
       //dfs(adj, vertex);
    //    int[] distance = new int[vertex+1];
    //    for(int i=0;i<distance.length;i++){
    //         distance[i]=Integer.MAX_VALUE;
    //     }
        // Shortest_Path_Unweighted(adj,0,vertex,distance);
        // for(int i=0;i<distance.length;i++){
        //     System.out.print(distance[i]+",");
        // }
        System.out.println(dfs(adj, vertex,0));
    }
}
