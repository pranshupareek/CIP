package DSAAdvance.graph;

import java.util.*;

Pair{
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

public class weightedUndirectedGraph {
    ArrayList<ArrayList<Pair>> adj;
    
    weightedUndirectedGraph(int size){
        adj = new ArrayList<>(size);
        for (int i = 0; i<size; i++){
            adj.add(new ArrayList<>());
        }
    }

    ArrayList<Pair> getList(int u){
        return adj.get(u);
    }

    void addEdge(int i, int j, int distance){
        adj.get(i).add(new Pair(j,distance));
        adj.get(j).add(new Pair(i,distance));
    }

    void removeEdge(int u, Pair v){
        for (int i = 0; i<adj.get(u).size(); i++){
            if (adj.get(u).get(i)==v){
                adj.get(u).remove(i);
                break;
            }
        }
        
        int count = 0;
        for (Pair i : getList(v.node)){
            if (u==i.node){
                getList(v.node).remove(count);
                break;
            }
            count++;
        }
    }
}
