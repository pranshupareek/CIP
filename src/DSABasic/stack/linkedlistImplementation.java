package DSABasic.stack;

import DSABasic.linkedlist.Node;
import DSABasic.linkedlist.simpleLL;


class Mystack {
    Node head;
    int len;
    void push(int ele){
        len++;
        head = simpleLL.insertAtBeg(head, ele);
    }
    int pop(){
        if (isEmpty()){
            return -1;
        }
        len--;
        int res = peek();
        head = simpleLL.delHead(head);
        return res;
    }
    int peek(){
        if (isEmpty()){
            return -1;
        }

        return head.data;
    }
    int size(){
        return len;
    }
    boolean isEmpty(){
        return len==0;
    }
}

class linkedistImplementation {
    public static void main(String arg[]){
        Mystack s = new Mystack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(40);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
