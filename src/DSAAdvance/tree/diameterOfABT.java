package DSAAdvance.tree;

import java.util.*;


public class diameterOfABT {
    static int diameter;
    static int getHeight(Node root){
        if (root==null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        diameter = Math.max(diameter, leftHeight+rightHeight+1);
        return Math.max(leftHeight, rightHeight)+1;
    }
    static int getDiameter(Node root) {
        diameter = 0;
        getHeight(root);
        return diameter;
    }

    public static void main(String[] args) {
        Node root = new Node(10);

        System.out.println(getDiameter(root));
        
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new  Node(50);
        root.right.left.left = new Node(60);

        System.out.println(getDiameter(root));

        root.right = new Node(60);
        root.left.left = new Node(30);
        root.left.right = new Node(80);
        root.left.right.right = new Node(90);
        root.left.right.right.right = new Node(18);
        root.left.left.left = new Node(40);
        root.left.left.left.left = new Node(60);
        root.left.left.right = new Node(50);

        System.out.println(getDiameter(root));
    }
}
