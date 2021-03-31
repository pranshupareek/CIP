package DSAAdvance.tree;

import java.util.*;

public class widthOfBT {
    static int getWidth(Node root){
        if (root == null)
            return 0;
        Node dummy = new Node(-1);
        Node cur = root;
        Deque<Node> dq = new ArrayDeque<>();
        dq.add(cur);
        dq.add(dummy);
        int maxWid = 1;
        while (dq.size()>1){
            cur = dq.poll();
            if (cur==dummy){
                maxWid = Math.max(maxWid, dq.size());
                dq.add(dummy);
                continue;
            }

            if (cur.left!=null)
                dq.add(cur.left);
            if (cur.right!=null)
                dq.add(cur.right);
        }

        return maxWid;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new  Node(20);
    	root.right=new Node(30);
        root.left.left=new Node(34);
    	root.right.left=new Node(15);
    	root.right.right=new Node(20);
        root.left.left.left=new Node(40);

        System.out.println(getWidth(root));
    }
}
