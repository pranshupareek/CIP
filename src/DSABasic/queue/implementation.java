package DSABasic.queue;

import java.util.ArrayList;

class Queue{
    ArrayList<Integer> arr;
    int rear;
    int max;
    Queue(int size){
        rear = -1;
        max = size;
        arr = new ArrayList<>();
    }
    void enqueue(int ele){
        if (isFull()){
            System.out.println("Queue is Full.");
            return;
        }
        arr.add(ele);
        printQueue();
        rear++;
    }
    int dequeue(){
        if (isEmpty()){
            return -1;
        }
        int res = arr.get(0);
        arr.remove(0);
        printQueue();
        rear--;
        return res;
    }
    int size(){
        return arr.size();
    }
    int getFront(){
        return arr.get(0);
    }
    int getRear(){
        return arr.get(rear);
    }
    boolean isFull(){
        return max==rear+1;
    }
    boolean isEmpty(){
        return rear==-1;
    }
    void printQueue(){
        System.out.println(arr);
    }
}

public class implementation {
    public static void main(String arg[]){
        Queue q = new Queue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.dequeue());
        System.out.println(q.size());
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
    }
}
