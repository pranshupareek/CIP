package DSAAdvance.graph;

public class adjGraph {
    private boolean adjMatrix[][];
    private int numVertices;

    public adjGraph(int numVertices){
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }
    public void addEdge(int i, int j){
        adjMatrix[i][j] = adjMatrix[j][i] = true;
    }
    public void removeEdge(int i, int j){
        adjMatrix[i][j] = adjMatrix[j][i] = false;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
          s.append(i + ": ");
          for (boolean j : adjMatrix[i]) {
            s.append((j ? 1 : 0) + " ");
          }
          s.append("\n");
        }
        return s.toString();
    }

    public static void main(String args[]) {
        adjGraph g = new adjGraph(4);
    
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
    
        System.out.print(g.toString());
      }
    
}
