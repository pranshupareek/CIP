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

class circularQueue{
    int arr[];
    int front,cap,size;
    circularQueue(int c){
        arr = new int[c];
        cap = c;
        front = 0;
        size = 0;
    }
    boolean isFull(){
        return cap==size;
    }
    boolean isEmpty(){
        return size==0;
    }
    int getFront(){
        if (isEmpty()){
            return -1;
        }
        return arr[front];
    }
    int getRear(){
        if (isEmpty()){
            return -1;
        }
        return arr[(front+size-1)%cap];
    }
    void enqueue(int x){
        if (isFull()){
            return;
        }
        int rear = (front+size-1)%cap;
        rear = (rear+1)%cap;
        arr[rear] = x;
        size++;
    }
    int dequeue(){
        if (isEmpty()){
            return -1;
        }
        int res = getFront();
        front = (front+1)%cap;
        size--;
        return res;
    }
    int size(){
        return size;
    }
}

public class implementation {
    public static void main(String arg[]){
        circularQueue q = new circularQueue(3);
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
