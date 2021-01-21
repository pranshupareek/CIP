package DSABasic.heap;

public class minheap {
    int arr[];
    int size;
    int capacity;

    minheap(int c){
        size = 0;
        capacity = c;
        arr = new int[c];
    }

    int left(int i){
        return (2*i+1);
    }
    int right(int i){
        return (2*i+2);
    }
    int parent(int i){
        return (i-1)/2;
    }

    public void insert(int x){
        if (size == capacity){
            return;
        }
        size++;
        arr[size-1] = x;
        int ei = size-1;
        while (true&&ei!=0){
            int pi = parent(ei);
            if (arr[ei] < arr[pi]){
                int temp = arr[ei];
                arr[ei] = arr[pi];
                arr[pi] = temp;
                ei = pi;
            } else {
                return;
            }
        }
    }

    public void printHeap(){
        for (int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class main{
    public static void main(String arg[]){
        minheap h=new minheap(11);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);
        h.printHeap();
    }
}
