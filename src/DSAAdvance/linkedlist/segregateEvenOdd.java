package DSAAdvance.linkedlist;

class segregateEvenOdd{
    static Node segregate(Node head){
        Node evenH = null;
        Node oddH = null;
        Node evenCur = null;
        Node oddCur = null;
        Node cur = head;
        while (cur!=null){
            if ((cur.val&1)==0){
                if (evenH==null){
                    evenH = cur;
                    evenCur = evenH;
                }
                else {
                    evenCur.next = cur;
                    evenCur = evenCur.next;
                }
            }
            else {
                if (oddH==null){
                    oddH = cur;
                    oddCur = oddH;
                }
                else {
                    oddCur.next = cur;
                    oddCur = oddCur.next;
                }
            }
            cur = cur.next;
        }
        if (oddCur!=null&&evenCur!=null){
            head = evenH;
            evenCur.next = oddH;
            oddCur.next = null;
        }
        return head;
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
        Node head = new Node(1);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(80);
        head.next.next.next.next.next.next.next.next = new Node(90);

        head = segregate(head);
        printLL(head);
    }
}