package DSABasic.bst;

class binaryTree {
    int key;
    binaryTree left;
    binaryTree right;
    binaryTree(int k){
        key = k;
    }
}

public class bst {
    static boolean search(binaryTree bt, int ele){
        while (bt!=null){
            if (bt.key==ele){
                return true;
            }
            else if (bt.key>ele){
                bt = bt.left;
            }
            else {
                bt = bt.right;
            }
        }
        return false;
    }

    public static void main(String arg[]){
        binaryTree bt = new binaryTree(15);
        bt.left = new binaryTree(5);
        bt.right = new binaryTree(20);
        bt.left.left = new binaryTree(3);
        bt.right.left = new binaryTree(18);
        bt.right.left.left = new binaryTree(16);
        bt.right.right = new binaryTree(80);
        System.out.println(search(bt,19));
    }
}
