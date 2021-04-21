package DSAAdvance.bst;

class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        data = val;
        left = right = null;
    }
}

public class checkForBST {
    static boolean checkBST(Node root, int max, int min){
        if (root==null){
            return true;
        }
        return root.data<max&&root.data>min&&checkBST(root.left, root.data, min)&&checkBST(root.right, max, root.data);
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(21);
        root.right.right = new Node(35);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(checkBST(root, max, min));
    }
}
