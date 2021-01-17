package DSABasic.tree;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {
    int key;
    binaryTree left;
    binaryTree right;
    binaryTree(int k){
        key = k;
    }
}

class main{
    static void inorder(binaryTree bt){
        if (bt == null){
            return;
        }
        inorder(bt.left);
        System.out.print(bt.key+" ");
        inorder(bt.right);
    }
    static void preorder(binaryTree bt){
        if (bt == null){
            return;
        }
        System.out.print(bt.key+" ");
        preorder(bt.left);
        preorder(bt.right);
    }
    static void postorder(binaryTree bt){
        if (bt == null){
            return;
        }
        postorder(bt.left);
        postorder(bt.right);
        System.out.print(bt.key+" ");
    }
    static int height(binaryTree bt){
        if (bt == null){
            return 0;
        }
        return Math.max(height(bt.left), height(bt.right))+1;
    }
    static void printNodeAtK(binaryTree bt, int k){
        if (bt==null){
            return;
        }
        if (k==0){
            System.out.print(bt.key+" ");
            return;
        }
        printNodeAtK(bt.left, k-1);
        printNodeAtK(bt.right, k-1);
    }
    static void printLevel(binaryTree bt){
        if (bt == null){
            return;
        }
        Queue<binaryTree> q = new LinkedList<binaryTree>();
        q.add(bt);
        while (q.isEmpty() == false){
            binaryTree curr = q.poll();
            System.out.print(curr.key+ " ");
            if (curr.left!=null){
                q.add(curr.left);
            }
            if (curr.right!=null){
                q.add(curr.right);
            }
        }
    }


    public static void main(String arg[]){
        binaryTree b = new binaryTree(10);
        b.left = new binaryTree(20);
        b.right = new binaryTree(30);
        b.right.left = new binaryTree(40);
        b.right.right = new binaryTree(50);
        inorder(b);
        System.out.println();
        preorder(b);
        System.out.println();
        postorder(b);
        System.out.println("\n"+height(b));
        printNodeAtK(b,2);
        System.out.println();
        printLevel(b);
    }
}
