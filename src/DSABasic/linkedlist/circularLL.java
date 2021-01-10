package DSABasic.linkedlist;

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

    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        printLL(head);
    }
}
