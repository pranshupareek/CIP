package DSAAdvance.linkedlist;

import DSABasic.linkedlist.Node;

public class mergeSortedLL {
    static Node merge(Node head1, Node head2){
        Node curA = head1;
        Node curB = head2;
        Node nHead = null;
        if (curA.data>curB.data){
            nHead = curB;
            curB = curB.next;
        }
        else {
            nHead = curA;
            curA = curA.next;
        }
        Node cur = nHead;
        while (curA!=null&&curB!=null){
            if (curA.data>curB.data){
                cur.next = curB;
                curB = curB.next;
            }
            else {
                cur.next = curA;
                curA = curA.next;
            }    
            cur = cur.next;
        }
        if (curA==null){
            cur.next = curB;
        }
        else {
            cur.next = curA;
        }
        return nHead;
    }

    static void printLL(Node head){
        Node cur = head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node head2 = new Node(2);
        head2.next = new Node(5);
        head2.next = new Node(35);

        head = merge(head, head2);

        printLL(head);

    }
}
