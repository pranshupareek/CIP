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
    static void inorder(binaryTree bt){
        if (bt == null){
            return;
        }
        inorder(bt.left);
        System.out.print(bt.key+" ");
        inorder(bt.right);
    }
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
    static binaryTree insert(binaryTree bt, int ele){
        if (bt==null){
            return new binaryTree(ele);
        }
        binaryTree curr = bt;
        while (curr!=null){
            if (curr.key==ele){
                return bt;
            }
            else if (curr.key>ele){
                if (curr.left==null){
                    curr.left=new binaryTree(ele);
                    return bt;
                }
                curr = curr.left;
            }
            else {
                if (curr.right==null){
                    curr.right = new binaryTree(ele);
                    return bt;
                }
                curr = curr.right;
            }
        }
        return bt;
    }
    static binaryTree delNode(binaryTree bt, int ele){
        if (bt==null){
            return null;
        }
        if (bt.key>ele){
            bt.left = delNode(bt.left, ele);
        }
        else if (bt.key<ele){
            bt.right = delNode(bt.right, ele);
        }
        else {
            if (bt.left==null) return bt.right;
            else if (bt.right==null) return bt.left;
            else {
                binaryTree succ = getSucc(bt);
                bt.key = succ.key;
                bt.right = delNode(bt.right, succ.key);
            }
        }
        return bt;
    }

    static binaryTree getSucc(binaryTree bt){
        binaryTree curr = bt.right;
        while (curr!=null&&curr.left!=null){
            curr = curr.left;
        }
        return curr;
    }
    
    static int floor(binaryTree bt, int ele){
        binaryTree prev = null;
        while (bt!=null){
            if (bt.key==ele){
                return ele;
            }
            else if (bt.key>ele){
                bt = bt.left;
            }
            else {
                prev = bt;
                bt = bt.right;
            }
        }
        if (prev!=null)
        return prev.key;
        else return -1;
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

        bt = insert(bt, 21);
        inorder(bt);
        System.out.println();
        bt = delNode(bt, 15);
        inorder(bt);
        System.out.println();
        System.out.println(floor(bt, 1));
    }
}
