package DSAAdvance.linkedlist;
import java.util.*;

class Node {
    int data;
    Node next;
    Node rand;
    Node(int ele){
        data = ele;
        next = null;
        rand = null;
    }
}

class cloneLLWithRandPointer{
    static void printLL(Node head){
        Node cur = head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
        cur = head;
        while (cur!=null){
            System.out.print(cur.rand.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    static Node cloneLL(Node head){
        Node cur = head;
        Node nHead = new Node(cur.data);
        HashMap<Node, Integer> hm = new HashMap<>();
        hm.put(head,0);
        cur = cur.next;
        Node cur2 = nHead;
        HashMap<Integer, Node> hm2 = new HashMap<>();
        hm2.put(0,cur2);
        for  (int i = 1; cur!=null; i++){
            hm.put(cur,i);
            cur2.next = new Node(cur.data);
            cur = cur.next;
            cur2 = cur2.next;
            hm2.put(i,cur2);
        }
        cur = head;
        cur2 = nHead;
        while (cur!=null){
            cur2.rand = hm2.get(hm.get(cur.rand));
            cur = cur.next;
            cur2 = cur2.next;
        }

        return nHead;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.rand = head.next.next;
        head.next.rand = head.next.next.next;
        head.next.next.rand = head;
        head.next.next.next.rand = head.next.next;
        head.next.next.next.next.rand = head.next.next.next;

        Node nHead = cloneLL(head);
        System.out.println();
        printLL(head);
        printLL(nHead);
    }
}