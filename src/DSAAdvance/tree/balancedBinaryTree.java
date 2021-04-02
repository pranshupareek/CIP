package DSAAdvance.tree;

public class balancedBinaryTree {

    static int getHeight(Node head){
        if (head==null)
            return 0;
        int leftHeight = 0, rightHeight = 0;
        if (head.left!=null){
            leftHeight = 1+getHeight(head.left);
        }
        if (head.right!=null){
            rightHeight = 1+getHeight(head.right);
        }
        if (Math.abs(leftHeight-rightHeight)>1){
            return Integer.MIN_VALUE;
        }
        else if (leftHeight<0||rightHeight<0){
            return Integer.MIN_VALUE;
        }
        else  {
            return Math.max(leftHeight, rightHeight);
        }
    }

    static boolean checkBalancedTree(Node head){
        if (getHeight(head)>=0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node root=new Node(20);
    	root.left=new Node(8);
    	root.right=new Node(12);
    	root.right.left=new Node(3);
    	root.right.right=new Node(9);
        root.left.left = new  Node(8);
        root.left.left.right = new Node(8);
        System.out.println(checkBalancedTree(root));
    }
}
