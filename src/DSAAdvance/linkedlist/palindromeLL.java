package DSAAdvance.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class palindromeLL {
    static int checkSize(Node head){
        Node cur = head;
        int size = 0;
        while (cur!=null&&cur.next!=null){
            cur = cur.next.next;
            size+=2;
        }
        if (cur!=null){
            size++;
        }
        return size;
    }
    static boolean checkPalindrome(Node head){
        int n = checkSize(head);
        Node cur = head;
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = 0; i<n/2; i++){
            s.push(cur.data);
            cur = cur.next;
        }
        int i;
        if (n%2==0){
            i = n/2;
        }
        else {
            i = n/2+1;
            cur = cur.next;
        }
        for (;i<n;i++){
            if (s.pop()!=cur.data){
                return false;
            }
            cur = cur.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(1);
        System.out.println(checkPalindrome(head));

    }
}
