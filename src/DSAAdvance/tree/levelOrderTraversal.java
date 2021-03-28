package DSAAdvance.tree;

import java.util.ArrayDeque;
import java.util.Deque;

class Node{
    int data;
    Node left;
    Node right;
    Node(int ele){
        data = ele;
        left = right = null;
    }
}

public class levelOrderTraversal {

    static void printLOT(Node root){
        Node cur = root;
        Node dummy = new Node(-1);
        Deque<Node> dq = new ArrayDeque<>();
        dq.add(cur);
        dq.add(dummy);
        while (dq.size()!=1){
            if (dq.peek()==dummy){
                dq.poll();
                dq.add(dummy);
                System.out.println();
                continue;
            }
            cur = dq.poll();
            System.out.print(cur.data+" ");
            if (cur.left!=null){
                dq.add(cur.left);
            }
            if (cur.right!=null){
                dq.add(cur.right);
            }
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
        printLOT(root);
    }
}
