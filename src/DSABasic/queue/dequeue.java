package DSABasic.queue;

public class dequeue {
    int arr[];
    int front, cap, size;
    dequeue(int c){
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

    void deleteFront(){
        if (isEmpty()){
            return;
        }
        front = (front + 1)%cap;
        size--;
        printQueue();

    }

    void insertRear(int x){
        if (isFull()) return;
        int new_rear = (front+size)%cap;
        arr[new_rear] = x;
        size++;
        printQueue();
    }

    int getFront(){
        if (isEmpty()) return -1;
        else return front;
    }
    void insertFront(int x){
        if (isFull()) return;
        front = (front+cap-1)%cap;
        arr[front] = x;
        size++;
        printQueue();
    }
    void deleteRear(){
        if (isEmpty()) return;
        size--;
        printQueue();
    }
    int getRear(){
        if (isEmpty()) return -1;
        else return (front+size-1)%cap;
    }
    void printQueue(){
        int i = 0;
        while (i<size){
            System.out.print(arr[(front+i)%cap] + " ");
            i++;
        }
    }
}
class user{
    public static void main(String arg[]){
        dequeue q = new dequeue(5);
        q.insertFront(10);
        System.out.println();
        q.insertRear(20);
        System.out.println();
        q.insertRear(30);
        System.out.println();
        q.deleteFront();
        System.out.println();
        q.deleteRear();
    }
}
