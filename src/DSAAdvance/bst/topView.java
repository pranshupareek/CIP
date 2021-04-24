package DSAAdvance.bst;

import java.util.*;

public class topView {
    static ArrayList<Integer> topViewOfBT(Node node){
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(node,0));
        while (!q.isEmpty()){
            Pair temp = q.poll();
            if (!tm.containsKey(temp.hd)){
                tm.put(temp.hd, temp.node.data);
            }
            if (temp.node.left!=null){
                q.add(new Pair(temp.node.left,temp.hd-1));
            }
            if (temp.node.right!=null){
                q.add(new Pair(temp.node.right,temp.hd+1));
            }
        }
        for (Map.Entry<Integer, Integer> e : tm.entrySet()){
            al.add(e.getValue());
        }
        return al;
    } 

    public static void main(String[] args) {
        Node root = new Node(10);  
        root.left = new Node(20);  
        root.right = new Node(30);  
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println(topViewOfBT(root));
    }
}
