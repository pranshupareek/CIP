package DSAAdvance.linkedlist;

import java.util.*;

class Node{
    public int val;
    public Node next;
    Node(int ele){
        val = ele;
        next = null;
    }
}

public class detectLoopInLL {
    static boolean detectLoopHashing(Node head){
        Set<Node> hm = new HashSet<>();
        Node cur = head;
        while (cur.next!=null){
            if (hm.contains(cur.next)){
                return true;
            }
            hm.add(cur);
            cur = cur.next;
        }
        return false;
    }

    static boolean detectLoopFloyd(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
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
        head.next.next.next.next.next.next.next.next.next = head.next.next.next.next.next.next.next.next;

        System.out.println(detectLoopHashing(head));
        System.out.println(detectLoopFloyd(head));

    }
}
