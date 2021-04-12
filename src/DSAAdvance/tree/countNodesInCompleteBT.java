package DSAAdvance.tree;

public class countNodesInCompleteBT{
    class Sum{
        int val;
        Sum(int ele){
            val=ele;
        }
    }
    static int sumOfGP(int n, Sum sum){   
        int a = 1, r = 2;

        return ((a * (1 – (int)(Math.pow(r, n)))) /( 1 – r));
    }
    static int countNodes(Node root){
        if (root==null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        if (left<0){

        }
        else if (right<0){

        }
        else if (left==right){
            return left+1;
        }

        return 

    }
}
