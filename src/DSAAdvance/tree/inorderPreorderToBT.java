package DSAAdvance.tree;

public class inorderPreorderToBT {
    static Node getBT(int inorder[], int i1, int j1, int preorder[], int i2, int j2){
        if (i1>j1){
            return null;
        }
        if (i1==j1){
            return new Node(inorder[i1]);
        }
        Node head = new Node(preorder[i2]);
        int index = i1;
        while (preorder[i2]!=inorder[index]){
            index++;
        }
        int index2 = i2+index-i1;

        head.left = getBT(inorder, i1, index-1, preorder, i2+1, index2);

        head.right = getBT(inorder, index+1, j1, preorder, index2+1, j2);

        return head;

    }

    public static void main(String[] args) {
        int preorder[] = {10, 20, 40, 50, 30, 70, 80, 90};
        int inorder[] = {40, 20, 50, 10, 30, 80, 70, 90};
        Node root = getBT(inorder, 0, preorder.length-1, preorder, 0, preorder.length-1);
        System.out.println(root.right.data);
        levelOrderTraversal.printLOT(root);
    }
}
