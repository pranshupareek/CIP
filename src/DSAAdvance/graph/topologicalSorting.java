package DSAAdvance.graph;

import java.util.*;

public class topologicalSorting {
    static void topoSort(directedGraph g, int ele, HashSet<Integer> hs){
        hs.add(ele);
        int cur = ele;
        Queue<Integer> q = new LinkedList<>();
        q.add(ele);
        while(!q.isEmpty()){
            cur = q.poll();
            ArrayList<Integer> temp = g.adj.get(cur);
            for (int i = 0; i<temp.size(); i++){
                if (!hs.contains(temp.get(i))){
                    q.add(temp.get(i));
                }
                if (hs.contains(temp.get(i))){
                    hs.remove(temp.get(i));
                }
                hs.add(temp.get(i));
            }
        }
        
    }

    static ArrayList<Integer> topoSort(directedGraph g, int n){
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> hs = new LinkedHashSet<>();
        for (int i = 0; i<n; i++){
            if (!hs.contains(i)){
                topoSort(g, i, hs);
            }
        }
        hs.forEach(i -> res.add(i));
        return res;
    }

    public static void main(String[] args) {
        directedGraph g1 = new directedGraph(3);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        ArrayList<Integer> res1 = topoSort(g1, 3);

        System.out.println(res1);

        directedGraph g2 = new directedGraph(5);
        g2.addEdge(0, 2);
        g2.addEdge(0, 3);
        g2.addEdge(1, 3);
        g2.addEdge(1, 4);

        ArrayList<Integer> res2 = topoSort(g2, 5);
        
        System.out.println(res2);

        directedGraph g3 = new directedGraph(6);
        g3.addEdge(0, 1);
        g3.addEdge(0, 2);
        g3.addEdge(1, 3);
        g3.addEdge(2, 3);
        g3.addEdge(3, 4);
        g3.addEdge(3, 5);

        ArrayList<Integer> res3 = topoSort(g3, 6);

        System.out.println(res3);

    }
}
