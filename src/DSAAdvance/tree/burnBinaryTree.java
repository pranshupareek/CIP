package DSAAdvance.tree;

public class burnBinaryTree {
    static int time = 0;
    static int burnTree(Node root, int ele){
        if (root==null){
            return 0;
        }
        if (root.data==ele){
            return -1;
        }
        int left = burnTree(root.left, ele);
        int right = burnTree(root.right, ele);
        if (left<0){
            time = Math.max(time, right-left);
            return left-1;
        }
        else if (right<0){
            time = Math.max(time, left-right);
            return right-1;
        }

        return Math.max(left, right)+1;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
        root.left.left = new  Node(60);
        root.left.left.right = new Node(70);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
        burnTree(root, 40);
        System.out.println(time);
    }
}
