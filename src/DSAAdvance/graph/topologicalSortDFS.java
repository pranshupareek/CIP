package DSAAdvance.graph;

import java.util.*;

public class topologicalSortDFS {
    static ArrayList<Integer> getTopologicalSort(directedGraph g, int n){
        boolean visited[] = new boolean[n];
        Arrays.fill(visited,false);
        Stack<Integer> s = new Stack<Integer>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i<n; i++){
            if (!visited[i]){
                getTopologicalSort(g, i, s, visited);
            }
        }

        while (!s.isEmpty()){
            res.add(s.pop());
        }
        return res;
    }

    static void getTopologicalSort(directedGraph g, int u, Stack<Integer> s, boolean visited[]){
        visited[u] = true;

        for(int v: g.adj.get(u)){
            if (!visited[v]){
                getTopologicalSort(g, v, s, visited);
            }
        }
        s.push(u);
    }

    public static void main(String[] args) {
        int n = 5;
        directedGraph g = new directedGraph(n);
        g.addEdge(0, 1); 
        g.addEdge(1, 3); 
        g.addEdge(2, 3); 
        g.addEdge(3, 4); 
        g.addEdge(2, 4); 

        System.out.println(getTopologicalSort(g, n));
    }
}
