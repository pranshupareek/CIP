package DSAAdvance.graph;

import java.util.ArrayList;

public class detectCycleInDG {
    static boolean detectCycle(directedGraph g, int n){
        ArrayList<Boolean> visited = new ArrayList<>(n), recSt = new ArrayList<>(n);
        for (int i = 0; i<n; i++){
            visited.add(false);
            recSt.add(false);
        }

        for (int i = 0; i<n; i++){
            if (!visited.get(i)){
                if (detectCycle(g, i, visited, recSt)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean detectCycle(directedGraph g, int s, ArrayList<Boolean> visited, ArrayList<Boolean> recSt){
        visited.set(s, true);
        recSt.set(s, true);

        for (int u : g.adj.get(s)){
            if (!visited.get(u)&&detectCycle(g, u, visited, recSt)){
                return true;
            }
            else if (recSt.get(u)){
                return true;
            }
        }
        recSt.set(s, false);
        return false;
    }

    public static void main(String args[]){
        int n = 7;
        directedGraph g = new directedGraph(n);
        g.addEdge(1, 2);
        g.addEdge(1,0);
        g.addEdge(2, 3);
        g.addEdge(0, 4);
        g.addEdge(4, 5);
        g.addEdge(5, 6);
        g.addEdge(6, 4);

        boolean res = detectCycle(g, n);

        System.out.println(res);
    }
}
