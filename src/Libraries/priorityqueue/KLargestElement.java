package Libraries.priorityqueue;

import java.util.*;

public class KLargestElement {
    static void printKLargestUsingMaxHeap(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int x: arr){
            pq.add(x);
        }
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i<k; i++){
            dq.push(pq.poll());
        }
        while (!dq.isEmpty()){
            System.out.print(dq.pop()+" ");
        }
        System.out.println();
    }

    static void printKLargest(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i =0; i<k; i++){
            pq.add(arr[i]);
        }
        for (int i = k; i< arr.length; i++){
            if (pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        while (!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int arr[] = {5, 15, 10, 20, 8};
        printKLargest(arr, 4);
    }
}
