package DSAAdvance.graph;

import java.util.ArrayList;

class Pair{
    int node;
    int distance;
    Pair(int node, int distance){
        this.node = node;
        this.distance = distance;
    }

    public int getNode(){
        return node;
    }
    public int getDistance(){
        return distance;
    }
}

public class weightedDirectedGraph {
    ArrayList<ArrayList<Pair>> adj;

    weightedDirectedGraph(int size){
        adj = new ArrayList<>(size);
        for (int i = 0; i<size; i++){
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int i, int j, int distance){
        Pair p = new Pair(j,distance);
        adj.get(i).add(p);
    }

    void removeEdge(int u, Pair v){
        
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
