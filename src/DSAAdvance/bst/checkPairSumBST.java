package DSAAdvance.bst;

import java.util.HashSet;
import java.util.Set;

public class checkPairSumBST {
    static Set<Integer> hs = new HashSet<>();
    static boolean checkSum(Node root, int sum){
        if (root==null){
            return false;
        }
        if (hs.contains(sum-root.data)){
            return true;
        }
        hs.add(root.data);
        return checkSum(root.left, sum)||checkSum(root.right, sum);
    }

    public static void main(String[] args) {
        Node root = new Node(18);  
        root.left = new Node(60);  
        root.right = new Node(70);  
        root.left.left = new Node(4);  
        root.right.left = new Node(8);
        root.right.right = new Node(80);  
        System.out.println(checkSum(root, 130));
    }
}
