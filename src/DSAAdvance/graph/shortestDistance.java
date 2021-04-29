package DSAAdvance.graph;

import java.util.ArrayList;

public class shortestDistance {
    static ArrayList<Integer> getShortestDistance(weightedDirectedGraph g, int n, int source){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i<n; i++){
            res.add(Integer.MAX_VALUE);
        }
        getShortestDistance(g, source, 0, res);

        return res;
    }

    static void getShortestDistance(weightedDirectedGraph g, int source, int pd, ArrayList<Integer> res){
        res.set(source, Math.min(res.get(source), pd));

        for (Pair i: g.adj.get(source)){
            getShortestDistance(g, i.getNode(), pd+i.getDistance(), res);
        }
    }

    public static void main(String arg[]){

        int size = 6;
        weightedDirectedGraph g = new weightedDirectedGraph(size);
        g.addEdge(0,1,2);
        g.addEdge(1,2,3);
        g.addEdge(2,3,6);
        g.addEdge(0,4,1);
        g.addEdge(4,2,2);
        g.addEdge(4,5,4);
        g.addEdge(5,3,1);

        System.out.println(getShortestDistance(g, size, 0));


        size = 4;
        weightedDirectedGraph g2 = new weightedDirectedGraph(size);
        g2.addEdge(0,1,1);
        g2.addEdge(1,2,3);
        g2.addEdge(1,3,2);
        g2.addEdge(2,3,4);

        System.out.println(getShortestDistance(g2, size, 1));
                
    }
  
}
