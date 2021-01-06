package DSABasic.linkedlist;

class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class simpleLL {
    static void printLL(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static void printLLRec(Node head){
        if (head!=null){
            System.out.print(head.data+ " ");
            printLLRec(head.next);
        }
    }
    public static void main(String args[]){
        Node head = new Node(10);
        Node t1 = new Node(20);
        Node t2 = new Node(30);
        head.next = t1;
//        operation
        t1.next = t2;
        printLL(head);
        printLLRec(head);
    }
}
