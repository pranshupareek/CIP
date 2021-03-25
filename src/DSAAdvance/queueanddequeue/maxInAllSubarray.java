package DSAAdvance.queueanddequeue;

import java.util.*;

public class maxInAllSubarray {
    static void printMax(int arr[], int k){
        int n = arr.length;
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i<k; i++){
            while (!dq.isEmpty()&&arr[dq.peekLast()]<arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        
        int res[] = new int[n-k+1];

        res[0] = arr[dq.getFirst()];

        if (0>=dq.getFirst()){
            dq.removeFirst();
        }   
        for (int i = k; i<n; i++){
            while (!dq.isEmpty()&&arr[dq.peekLast()]<arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);

            res[i-k+1] = arr[dq.getFirst()];

            if (i-k+1>=dq.getFirst()){
                dq.removeFirst();
            }
            
        }

        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int arr[] = {10,8,5,12,15,7,6};
        printMax(arr, 3);
        int arr2[] = {20,5,3,8,6,15};
        printMax(arr2, 4);
    }
}
