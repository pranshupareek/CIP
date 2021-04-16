package DSAAdvance.tree;

public class countNodesInCompleteBT{
    public static int countNode(Node root){
        int lh=0,rh=0;
        Node curr=root;
        while(curr!=null){
            lh++;
            curr=curr.left;
        }
        curr=root;
        while(curr!=null){
            rh++;
            curr=curr.right;
        }
        if(lh==rh){
            return (int)Math.pow(2,lh)-1;
        }else{
            return 1+countNode(root.left)+countNode(root.right);
        }
    } 
}
