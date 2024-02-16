package Graph;

import java.util.Arrays;

public class Dijkstra {
    public static void dijkstra(int[][] graph,int v,int source){
        int[] distance = new int[v];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[0] = 0;//source
        boolean[] set = new boolean[v];
        for(int i=0;i<v;i++){
            source = -1;
            for(int j=0;j<v;j++){
                if(!set[j] && (source == -1 || distance[j]<distance[source])){
                    source = j;
                }
            }
            set[source] = true;
            for(int vertex = 0;vertex<v;vertex++){
                if(graph[source][vertex] != 0 && !set[vertex]){
                    distance[vertex] = Math.min(graph[source][vertex]+distance[source],distance[vertex]);
                }
            }
        }
        for(int i : distance){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[][] graph = {{0,1,5,0},
                        {1,0,3,2},
                        {5,3,0,4},
                        {0,2,4,0}};
        int vertex = 4;
        dijkstra(graph,vertex,0);
    }
}
