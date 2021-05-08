package DSAAdvance.greedy;

import java.util.*;

class Node{
    char c;
    int freq;
    Node left;
    Node right;
    Node(char c, int freq, Node left, Node right){
        this.c = c;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}

public class huffman {
    static void printHCode(char[] arr, int[] freq){
        PriorityQueue<Node> h = new PriorityQueue<>(
            (n1,n2) -> n1.freq - n2.freq
        );

        for (int i = 0; i<arr.length; i++){
            h.add(new Node(arr[i], freq[i], null, null));
        }

        while(h.size()>1){
            Node l = h.poll();
            Node r = h.poll();
            h.add(new Node('$', l.freq+r.freq, l, r));
        }

        printRec(h.peek(), "");
    }

    static void printRec(Node root, String s){
        if (root.c!='$'){
            System.out.println(root.c+" "+s);
            return;
        }
        printRec(root.left, s+"0");
        printRec(root.right, s+"1");
    }

    public static void main(String[] args) {
        char arr[] = { 'a', 'd', 'e', 'f'};
        int freq[] = { 30, 40, 80, 60};

        printHCode(arr, freq);
    }
}
