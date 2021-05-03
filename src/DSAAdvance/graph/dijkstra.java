package DSAAdvance.graph;

import java.util.*;

public class dijkstra {
    static int[] getDijkstra(weightedUndirectedGraph g,int V, int source){
        int dist[] = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        boolean fixed[] = new boolean[V];
        PriorityQueue<myPair> rest = new PriorityQueue<>(new Comparator<myPair>(){
            public int compare(myPair p1, myPair p2){
                return p1.distance-p2.distance;
            }
        });
        rest.offer(new myPair(source,0));
        while(!rest.isEmpty()){
            myPair cur = rest.poll();
            if (!fixed[cur.node]){
                ArrayList<myPair> al = g.getList(cur.node);
                for (myPair i: al){
                    if (!fixed[i.node]){
                        rest.add(new myPair(i.node, cur.distance+i.distance));
                    }
                }
                dist[cur.node] = cur.distance;
                fixed[cur.node] = true;
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int V = 4;
        weightedUndirectedGraph g1 = new weightedUndirectedGraph(V);
        g1.addEdge(0,1,5);
        g1.addEdge(0,2,10);
        g1.addEdge(1,2,3);
        g1.addEdge(1,3,20);
        g1.addEdge(2,3,2);

        int source = 1;
        System.out.println(Arrays.toString(getDijkstra(g1, V, source)));

        V = 3;
        weightedUndirectedGraph g2 = new weightedUndirectedGraph(V);
        g2.addEdge(0, 1, 5);
        g2.addEdge(0, 2, 3);
        g2.addEdge(1, 2, 1);
        System.out.println(Arrays.toString(getDijkstra(g2, V, source)));

    }
}
