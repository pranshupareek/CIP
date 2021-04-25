package DSAAdvance.heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KSortedArray {
    static ArrayList<Integer> getArraySorted(int arr[], int n, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i<=k; i++){
            pq.offer(arr[i]);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = k+1; i<n; i++){
            al.add(pq.poll());
            pq.offer(arr[i]);
        }
        while (!pq.isEmpty()){
            al.add(pq.poll());
        }
        return al;
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,18, 19, 17};
        int n = arr.length;
        int k = 2;
        System.out.println(getArraySorted(arr, n, k));
    }
}
