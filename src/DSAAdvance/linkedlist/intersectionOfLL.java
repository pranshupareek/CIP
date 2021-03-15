package DSAAdvance.linkedlist;

public class intersectionOfLL {
    static void intersectionPoint(Node h1, Node h2){
        Node cur1 = h1;
        Node cur2 = h2;
        int n1 = 0;
        int n2 = 0;
        while (cur1!=null){
            n1++;
            cur1=cur1.next;
        }
        while (cur2!=null){
            n2++;
            cur2=cur2.next;
        }
        cur1 = h1;
        cur2 = h2;
        if (n2>n1){
            int n = n2-n1;
            while (n>0){
                n--;
                cur2 = cur2.next;
            }
        }
        else if (n1>n2){
            int n = n1-n2;
            while (n>0){
                n--;
                cur1 = cur1.next;
            }
        }
        while (cur1!=cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        System.out.println(cur1.val);
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

        Node head2 = new Node(15);
        head2.next = new Node(25);
        head2.next.next = head.next;
        intersectionPoint(head, head2);
    }
}
