package DSAAdvance.tree;

import java.util.*;

public class treeTraversalInSpiralForm {
    static void spiralTraversal(Node root){
        if (root==null){
            return;
        }
        Deque<Node> dq = new ArrayDeque<>();
        dq.add(root);
        int row = 0;
        while (!dq.isEmpty()){
            int size = dq.size();
            for (int i = 0; i<size; i++){
                if ((row&1)==0){
                    Node pop = dq.pollFirst();
                    if (pop.left!=null){
                        dq.addLast(pop.left);
                    }
                    if (pop.right!=null){
                        dq.addLast(pop.right);
                    }
                    System.out.print(pop.data+" ");
                }
                else {
                    Node pop = dq.pollLast();
                    if (pop.right!=null){
                        dq.addFirst(pop.right);
                    }
                    if (pop.left!=null){
                        dq.addFirst(pop.left);
                    }
                    System.out.print(pop.data+" ");
                }
            }
            row++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.right.right.left = new Node(70);
        root.right.right.right = new Node(80);
        spiralTraversal(root);
    }
}
