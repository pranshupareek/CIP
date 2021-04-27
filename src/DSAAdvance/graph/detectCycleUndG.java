package DSAAdvance.graph;

import java.util.*;

public class detectCycleUndG {
    static boolean detectLoop(Graph g, int cur, ArrayList<Boolean> visited, int parent){

        visited.set(cur,true);
        ArrayList<Integer> connected = g.adj.get(cur);
        for (int i : connected){
            if (!visited.get(i)){
                if (detectLoop(g, i, visited, cur)){
                    return true;
                };
            }
            else if (parent!=i){
                return true;
            }
        }
        return false;
    }
    static boolean detectLoop(Graph g, int n){
        ArrayList<Boolean> visited = new ArrayList<>(n);
        for (int i = 0; i<n; i++){
            visited.add(false);
        }
        boolean res = false;
        for (int i = 0; i<n; i++){
            if (!visited.get(i)){
                res = res || detectLoop(g, i, visited, -1);
            }
        }
        return res;
        
    }

    public static void main(String args[]){
        int n = 7;
        Graph g = new Graph(n);
        g.addEdge(1, 2);
        g.addEdge(1,0);
        g.addEdge(2, 3);
        g.addEdge(0, 4);
        g.addEdge(4, 5);
        g.addEdge(5, 6);
        g.addEdge(4, 6);
        boolean res = detectLoop(g, n);

        System.out.println(res);
        int n2 = 6;
        Graph g2 = new Graph(n2);

        g2.addEdge(0,1);
        g2.addEdge(0,2);
        g2.addEdge(1,3);
        g2.addEdge(4,5);

        boolean res2 = detectLoop(g2, n2);

        System.out.println(res2);

    }
}
