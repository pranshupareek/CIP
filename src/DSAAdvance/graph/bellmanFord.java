package DSAAdvance.graph;

public class bellmanFord {
    class Edge implements Comparable<Edge> {
        int src, dest, weight;

        public int compareTo(Edge e){
            return this.weight - e.weight;
        }
    }

    int V,E,edgeIndex;
    Edge edge[];

    bellmanFord(int v, int e){
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

    void getBellmanFord(int src){
        int dist[] = new int[V];

        for(int i = 0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        for (int i = 1; i<V; i++){
            for (int j = 0; j<E; j++){
                int u = edge[j].src;
                int v = edge[j].dest;
                int weight = edge[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight<dist[v]){
                    dist[v] = dist[u] + weight;
                }
            }
        }

        for (int j = 0; j<E; j++){
            int u = edge[j].src;
            int v = edge[j].dest;
            int weight = edge[j].weight;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]){
                System.out.println("Graph contains negative cycle");
            }
        }
        printArr(dist);
    }
    
    void printArr(int dist[]){
        System.out.println("Vertex Distance from Source"); 
		for (int i = 0; i < V; ++i) 
			System.out.println(i + "\t\t" + dist[i]); 
    }

    public static void main(String[] args) {
        bellmanFord graph = new bellmanFord(4, 5);

        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, -3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 3);

        graph.getBellmanFord(0);
    }
}
