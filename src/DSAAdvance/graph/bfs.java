package DSAAdvance.graph;

import java.util.*;

import jdk.nashorn.internal.objects.annotations.Where;

class Graph{
    ArrayList<ArrayList<Integer>> adj;

    Graph(int size){
        adj = new ArrayList<>(size);
        for (int i = 0; i<size; i++){
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int i, int j){
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    void removeEdge(int u, int v){
        
        int index = 0;
        for (int i = 0; i<adj.get(u).size(); i++){
            if (adj.get(u).get(i)==v){
                index = i;
                break;
            }
        }
        adj.get(u).remove(index);

        for (int i = 0; i<adj.get(v).size(); i++){
            if (adj.get(v).get(i)==u){
                index = i;
                break;
            }
        }
        adj.get(v).remove(index);
        
    }
}

public class bfs {
    static ArrayList<Integer> printBFS(Graph g, int ele){
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(ele);
        int cur = ele;
        Queue<Integer> q = new LinkedList<>();
        q.add(ele);
        while(!q.isEmpty()){
            cur = q.poll();
            ArrayList<Integer> temp = g.adj.get(cur);
            for (int i = 0; i<temp.size(); i++){
                if (!hs.contains(temp.get(i))){
                    hs.add(temp.get(i));
                    q.add(temp.get(i));
                }
            }
        }
        hs.forEach(i -> res.add(i));
        return res;
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);

        System.out.println(printBFS(g, 2));

        g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 5);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println(printBFS(g, 0));
    }
}
