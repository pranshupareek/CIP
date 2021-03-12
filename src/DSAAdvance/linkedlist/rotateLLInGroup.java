package DSAAdvance.linkedlist;

class Node{
    public int val;
    public Node next;
    Node(int ele){
        val = ele;
        next = null;
    }
}

class rotateLLInGroup {
    static Node rotateLLIG(Node head, int k){
        Node curr=head,prevFirst=null;
        boolean isFirstPass=true;
        while(curr!=null){
            Node first=curr,prev=null;
            int count=0;
            while(curr!=null&&count<k){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
            }
            if(isFirstPass){head=prev;isFirstPass=false;}
            else{prevFirst.next=prev;}
            prevFirst=first;
        }
        return head;
    }
    static void printLL(Node head){
        Node cur = head;
        while (cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
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
        head = rotateLLIG(head, 3);
        printLL(head);
    }
}