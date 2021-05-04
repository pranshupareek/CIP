package DSAAdvance.graph;

import java.util.*;

public class kruskal {
    class Edge implements Comparable<Edge> {
        int src, dest, weight;

        public int compareTo(Edge e){
            return this.weight - e.weight;
        }
    }

    class subset{
        int parent, rank;
    }

    int V,E,edgeIndex;
    Edge edge[];

    kruskal(int v, int e){
        V = v;
        E = e;
        edge = new Edge[E];
        for( int i = 0; i<e; i++){
            edge[i] = new Edge();
        }
        edgeIndex = 0;

    }

    void addEdge(int src, int dest, int weight){
        edge[edgeIndex].src = src;
        edge[edgeIndex].dest = dest;
        edge[edgeIndex].weight = weight;
        edgeIndex++;
    }

    int find(subset subsets[], int i){
        if (subsets[i].parent != i){
            subsets[i].parent = find(subsets, subsets[i].parent);
        }
        return subsets[i].parent;    
    }

    void Union(subset subsets[], int x, int y){
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        if(subsets[xroot].rank<subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank>subsets[yroot].rank)
            subsets[yroot].parent = xroot;
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    void KruskalMST(){
        Edge result[] = new Edge[V];
        int e = 0;
        int i = 0;
        for (i = 0; i<V; i++){
            result[i] = new Edge();
        }

        Arrays.sort(edge);
        subset subsets[] = new subset[V];
        for(i=0;i<V;i++){
            subsets[i] = new subset();
        }

        for (int v = 0; v<V; v++){
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }

        i=0;

        int res = 0;

        while (e<V-1){
            Edge  next_edge = new Edge();
            next_edge = edge[i++];
            int x = find(subsets, next_edge.src);
            int y = find(subsets, next_edge.dest);

            if (x!=y){
                result[e++] = next_edge;
                Union(subsets, x, y);
                res+=next_edge.weight;
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        int V = 5;
        int E = 7;
        kruskal graph = new kruskal(V, E);

        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 8);
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 3);
        graph.addEdge(2, 3, 4);
        graph.addEdge(2, 4, 12);
        graph.addEdge(3, 4, 15);
        graph.KruskalMST();
    }
}
