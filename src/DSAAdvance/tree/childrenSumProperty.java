package DSAAdvance.tree;

public class childrenSumProperty {
    static boolean checkChildrenSum(Node head){
        if (head==null){
            return true;
        }
        if (head.left==null&&head.right==null){
            return true;
        }
        if (head.left==null){
            return head.data==head.right.data&&checkChildrenSum(head.right);
        }
        if (head.right==null){
            return head.data==head.left.data&&checkChildrenSum(head.left);
        }

        return (head.data==head.left.data+head.right.data)&&checkChildrenSum(head.left)&&checkChildrenSum(head.right);
    }

    public static void main(String[] args) {
        Node root=new Node(20);
    	root.left=new Node(8);
    	root.right=new Node(12);
    	root.right.left=new Node(3);
    	root.right.right=new Node(9);
        root.left.left = new  Node(8);
        root.left.left.right = new Node(8);

        System.out.println(checkChildrenSum(root));
    }
}
