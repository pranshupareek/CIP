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
    static Node deleteHead(Node head){
        if (head==null || head.next == head){
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
    static Node deleteKthNode(Node head, int k){
        if (k==1){
            return deleteHead(head);
        }
        Node temp = head;
        while (k>2){
            temp=temp.next;
            k--;
        }
        temp.next = temp.next.next;
        return head;
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
        System.out.println();
        head = deleteHead(head);
        printLL(head);
        System.out.println();
        head = deleteKthNode(head, 2);
        printLL(head);
    }
}
