package DSAAdvance.graph;

import java.util.*;

public class directedGraph {
    ArrayList<ArrayList<Integer>> adj;

    directedGraph(int size){
        adj = new ArrayList<>(size);
        for (int i = 0; i<size; i++){
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int i, int j){
        adj.get(i).add(j);
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
        
    }
}
