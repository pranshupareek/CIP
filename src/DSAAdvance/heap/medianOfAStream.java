package DSAAdvance.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class medianOfAStream {
    static ArrayList<Double> getMedianOfStream(int arr[]){
        int n = arr.length;
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        ArrayList<Double> al = new ArrayList<>();
        for (int i = 0; i<n; i++){
            if ((i&1)==0){
                if (minPQ.peek()!=null&&arr[i]>minPQ.peek()){
                    int temp = minPQ.poll();
                    minPQ.add(arr[i]);
                    maxPQ.add(temp);
                }
                else {
                    maxPQ.add(arr[i]);
                }
                al.add(maxPQ.peek()+0.0);
            }
            else {
                if (maxPQ.peek()!=null&&arr[i]<maxPQ.peek()){
                    int temp = maxPQ.poll();
                    maxPQ.add(arr[i]);
                    minPQ.add(temp);
                }
                else {
                    minPQ.add(arr[i]);
                }
                al.add((maxPQ.peek()+minPQ.peek())/2.0);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int arr[] = {25,7,10,15,20};
        System.out.println(getMedianOfStream(arr));
    }
}
