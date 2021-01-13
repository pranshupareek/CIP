package DSABasic.doublylinkedlist;

class Node {
    int data;
    Node prev;
    Node next;
    Node (int d){
        data = d;
    }
}

public class doublyLL {
    static Node insertBegin(Node head, int data){
        Node temp = new Node(data);
        if (head==null){
            return temp;
        }
        temp.next = head;
        head.prev = temp;
        return temp;
    }
    static void printLL(Node head){
        if (head == null){
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    static Node insertAtEnd(Node head, int data){
        Node temp = new Node(data);
        if (head==null){
            return temp;
        }
        Node curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }
    static Node reverse(Node head){
        if (head==null || head.next == null){
            return null;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null){
                prev = temp.prev;
                temp.prev = temp.next;
                temp.next = prev;
                temp = temp.prev;
        }
        return prev.prev;
    }
    static Node delHead(Node head){
        if (head == null || head.next == null){
            return null;
        }
        head.next.prev = null;
        return head.next;
    }
    static Node delTail(Node head){
        if (head == null || head.next == null){
            return null;
        }
        Node curr = head.next;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }

    public static void main(String arg[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        printLL(head);
        System.out.println();
        head = insertBegin(head,5);
        printLL(head);
        System.out.println();
        head = insertAtEnd(head, 50);
        printLL(head);
        System.out.println();
        head = reverse(head);
        printLL(head);
        System.out.println();
        head = delHead(head);
        printLL(head);
        System.out.println();
        head = delTail(head);
        printLL(head);
    }
}