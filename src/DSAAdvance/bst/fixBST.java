package DSAAdvance.bst;

public class fixBST {
    static Node pvs, first, second;
    static void fixTheBST(Node root){
        if (root==null){
            return;
        }

        fixTheBST(root.left);
        if (pvs!=null) {
            if (root.data<pvs.data&&first==null){
                first = pvs;
                second = root;
            }
            else if (root.data<pvs.data){
                second = root;
                return;
            }
        }
        pvs = root;
        fixTheBST(root.right);
    }

    static void printInorder(Node node)
    {
        if (node == null)
            return;
 
        printInorder(node.left);
 
        System.out.print(node.data + " ");
 
        printInorder(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(18);  
        root.left = new Node(60);  
        root.right = new Node(70);  
        root.left.left = new Node(4);  
        root.right.left = new Node(8);
        root.right.right = new Node(80);  
        printInorder(root);
        System.out.println();

        fixTheBST(root);
        int temp = second.data;
        second.data = first.data;
        first.data = temp;

        printInorder(root);

        System.out.println();
    }
}
