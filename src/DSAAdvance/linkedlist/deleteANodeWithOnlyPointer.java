package DSAAdvance.linkedlist;

public class deleteANodeWithOnlyPointer {
    static void deleteNode(Node node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
    static void printLL(Node head){
        Node cur = head;
        while (cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);
        head.next.next.next.next.next.next.next.next = new Node(90);
        deleteNode(head.next.next.next.next.next.next.next.next);
        printLL(head);
    }
    
}
