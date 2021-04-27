package DSAAdvance.graph;

import java.util.ArrayList;

public class dfs {
    static void getDFS(Graph g, int n, int cur, ArrayList<Integer> res, ArrayList<Boolean> visited){
        if (visited.get(cur)){
            return;
        }
        res.add(cur);
        visited.set(cur,true);
        ArrayList<Integer> connected = g.adj.get(cur);
        for (int i : connected){
            if (!visited.get(i)){
                getDFS(g, n, i, res, visited);
            }
        }
    }
    static int getDFS(Graph g, int n, ArrayList<Integer> res){
        ArrayList<Boolean> visited = new ArrayList<>(n);
        for (int i = 0; i<n; i++){
            visited.add(false);
        }
        int count = 0;
        for (int i = 0; i<n; i++){
            if (!visited.get(i)){
                count++;
                getDFS(g, n, i, res, visited);
            }
        }
        return count;
        
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
        ArrayList<Integer> res = new ArrayList<>(n);
        int count = getDFS(g, n, res);

        System.out.println(res);
        System.out.println("Connected Components: "+count);

        int n2 = 6;
        Graph g2 = new Graph(n2);

        g2.addEdge(0,1);
        g2.addEdge(0,2);
        g2.addEdge(1,3);
        g2.addEdge(4,5);
        g2.addEdge(2,3);

        ArrayList<Integer> res2 = new ArrayList<>(n2);

        int count2 = getDFS(g2, n2, res2);

        System.out.println(res2);

        System.out.println("Connected Components: "+count2);
    }
}
