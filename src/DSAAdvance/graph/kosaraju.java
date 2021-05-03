package DSAAdvance.graph;

import java.util.*;

public class kosaraju {

    static directedGraph getTranspose(directedGraph g,int V){
        directedGraph gr = new directedGraph(V);
        for (int v = 0; v<V; v++){
            Iterator<Integer> i = g.adj.get(v).listIterator();
            while(i.hasNext()){
                gr.addEdge(i.next(), v);
            }
        }
        return gr;
    }

    static void DFS(directedGraph g, int v, boolean[] visited){
        visited[v] = true;
        System.out.print(v+" ");
        int n;

        Iterator<Integer> i = g.adj.get(v).iterator();

        while(i.hasNext()){
            n = i.next();
            if (!visited[n]){
                DFS(g, n, visited);
            }
        }
    }

    static void fillOrder(directedGraph g, int v, boolean visited[], Stack<Integer> stack){
        visited[v] = true;

        Iterator<Integer> i = g.adj.get(v).iterator();

        while(i.hasNext()){
            int n = i.next();
            if (!visited[n]){
                fillOrder(g, n, visited, stack);
            }
        }
        stack.push(v);
    }

    static void printSSC(directedGraph g, int V){
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[V];

        for (int i = 0; i<V; i++){
            if (!visited[i]){
                fillOrder(g,i,visited, stack);
            }
        }

        directedGraph gr = getTranspose(g,V);

        visited = new boolean[V];

        while (!stack.isEmpty()){
            int v = (int)stack.pop();
            if (!visited[v]){
                DFS(gr,v,visited);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        directedGraph g = new directedGraph(5);
        g.addEdge(1, 0); 
		g.addEdge(0, 2); 
		g.addEdge(2, 1); 
		g.addEdge(0, 3); 
		g.addEdge(3, 4); 
        printSSC(g, 5);
    }
}
