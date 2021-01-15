package DSABasic.queue;

import DSABasic.linkedlist.Node;

import static DSABasic.linkedlist.simpleLL.printLL;

class queueLL{
    Node front;
    Node rear;
    int size;
    queueLL(){
        front = rear = null;
        size = 0;
    }
    boolean isEmpty(){
        if (front==null){
            return true;
        }
        return false;
    }
    void enqueue(int ele){
        Node temp = new Node(ele);
        size++;
        if (isEmpty()){
            front = temp;
            rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }
    int dequeue(){
        if (isEmpty()){
            return -1;
        }
        size--;
        int res = front.data;
        front = front.next;
        if (front == null){
            rear = null;
        }
        return res;
    }
    int size(){
        return size;
    }
    int getFront(){
        return front.data;
    }
    int getRear(){
        return rear.data;
    }
    void printQueue(){
        printLL(front);
    }
}

public class vialinkedlist {
    public static void main(String arg[]){
        queueLL q = new queueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.dequeue());
        System.out.println(q.size());
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.isEmpty());
        q.printQueue();
    }
}
