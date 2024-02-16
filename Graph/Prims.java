package Graph;

import java.util.Arrays;

public class Prims {
    public static int prims(int[][] graph,int v){
        int[] key = new int[v];
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0] = 0;//source
        boolean[] set = new boolean[v];
        int result = 0;
        for(int i=0;i<v;i++){
            int source = -1;
            for(int j=0;j<v;j++){
                if(!set[j] && (source == -1 || key[j]<key[source])){
                    source = j;
                }
            }
            set[source] = true;
            result += key[source];
            for(int vertex = 0;vertex<v;vertex++){
                if(graph[source][vertex] != 0 && !set[vertex]){
                    key[vertex] = Math.min(graph[source][vertex],key[vertex]);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] graph = {{0,1,5,0},
                        {1,0,3,2},
                        {5,3,0,4},
                        {0,2,4,0}};
        int vertex = 4;
        System.out.println(prims(graph,vertex));
    }
}
