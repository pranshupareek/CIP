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
    static int searchLL(Node head,int ele){
        int ans = -1;
        Node temp = head;
        int count = 0;
        while (temp!=null){
            if (temp.data == ele){
                ans=++count;
                break;
            }
            else {
                temp = temp.next;
                count++;
            }
        }
        return ans;
    }
    static Node insertAtBeg(Node head, int ele){
        Node temp = new Node(ele);
        temp.next = head;
        return temp;
    }
    static Node insertAtEnd(Node head, int ele){
        Node temp = head;
        Node n = new Node(ele);
        if (head==null){
            return n;
        }

        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next = n;
        return head;
    }
    static Node delHead(Node head){
        if (head==null){
            return null;
        }
        return head.next;
    }
    static Node delTail(Node head){
        if (head==null){
            return null;
        }

        Node curr = head;
        if (curr.next==null){
            return null;
        }
        else {
            while (curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
        }
        return head;
    }
    static Node insertPos(Node head, int pos, int ele){
        Node curr = head;
        while (curr.next!=null&&pos>2){
            curr = curr.next;
            pos--;
        }
        if (pos==2){
            Node temp = new Node(ele);
            temp.next = curr.next;
            curr.next = temp;
        }
        else if (pos==1){
            Node temp = new Node(ele);
            temp.next = head;
            head = temp;
        }
        return head;
    }
    static Node insertSorted(Node head, int ele){
        Node curr = head;
        if (curr==null){
            return new Node(ele);
        }
        if (curr.data>ele){
            Node temp = new Node(ele);
            temp.next = head;
            return temp;
        }
        while (curr.next!=null&&curr.next.data<ele){
            curr = curr.next;
        }
        Node temp = new Node(ele);
        temp.next = curr.next;
        curr.next=temp;
        return head;
    }

    public static void printMiddle(Node head){
        if (head==null){
            return;
        }
        Node curr = head;
        Node ep = head;
        while (ep!=null && ep.next!=null){
            curr = curr.next;
            ep = ep.next.next;
        }
        System.out.println(curr.data);
    }
    public static void printFromEnd(Node head, int pos){
        Node temp = head;
        int len = 0;
        while (temp!=null){
            temp = temp.next;
            len++;
        }
        temp = head;
        int toPrint = len-pos+1;
        if (toPrint>0){
            while (toPrint>1){
                temp = temp.next;
                toPrint--;
            }
            System.out.println(temp.data);
        }

    }

    static void printFromEndFast(Node head, int pos){
        Node slow = head;
        Node fast = head;
        while (pos>1){
            if (fast.next==null){
                return;
            }
            fast=fast.next;
            pos--;
        }
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String args[]){
        Node head = new Node(10);
        Node t1 = new Node(20);
        Node t2 = new Node(30);
        head.next = t1;
        t1.next = t2;
        printLL(head);
        printLLRec(head);
        System.out.println(searchLL(head, 21));
        head = insertAtBeg(head, 5);
        printLL(head);
        System.out.println();
        head = insertAtEnd(head, 7);
        printLL(head);
        System.out.println();
        head = delHead(head);
        printLL(head);
        System.out.println();
        head = delTail(head);
        printLL(head);
        System.out.println();
        head = insertPos(head, 5,69);
        printLL(head);
        System.out.println();
        head = insertSorted(head, 25);
        printLL(head);
        System.out.println();
        printMiddle(head);
        System.out.println();
        printFromEnd(head, 5);
        printFromEndFast(head,5);
    }
}
