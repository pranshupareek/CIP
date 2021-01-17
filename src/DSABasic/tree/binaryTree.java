package DSABasic.tree;

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
    }
}
