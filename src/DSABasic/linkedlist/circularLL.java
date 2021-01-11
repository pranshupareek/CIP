package DSABasic.linkedlist;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class circularLL {

    static void printLL(Node head){
        if (head == null){
            return;
        }
        System.out.print(head.data+ " ");
        Node temp = head.next;
        while (head != temp){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    static Node insertAtBeg(Node head, int ele){
        Node temp = new Node(ele);
        if (head==null){
            temp.next = temp;
            return temp;
        }
        int tempData = head.data;
        head.data = temp.data;
        temp.data = tempData;
        temp.next = head.next;
        head.next = temp;
        return head;
    }
    static Node insertAtEnd(Node head, int ele){
        Node temp = new Node(ele);
        if (head == null){
            temp.next = temp;
            return temp;
        }
        int tempData = head.data;
        head.data = temp.data;
        temp.data = tempData;
        temp.next = head.next;
        head.next = temp;
        return temp;
    }

    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        printLL(head);

        head = insertAtBeg(head, 5);
        System.out.println();
        printLL(head);
        System.out.println();
        head = insertAtEnd(head,40);
        printLL(head);
    }
}
