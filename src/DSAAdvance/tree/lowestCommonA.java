package DSAAdvance.tree;

public class lowestCommonA {
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	int n1=20,n2=50;
	
	    Node ans=lca(root,n1,n2);
    	System.out.println("LCA: "+ans.data);
    } 
    
    public static Node lca(Node root, int n1, int n2){
        if(root==null)return null;
        if(root.data==n1||root.data==n2)
            return root;
        
        Node lca1=lca(root.left,n1,n2);
        Node lca2=lca(root.right,n1,n2);
        
        if(lca1!=null && lca2!=null)
            return root;
        if(lca1!=null)
            return lca1;
        else
            return lca2;
    }
}
