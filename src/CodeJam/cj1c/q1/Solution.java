package CodeJam.cj1c.q1;

import java.util.*;

public class Solution {
    static void getPQ(PriorityQueue<Integer> pq, int arr[], int n, int k){
        pq.add(arr[0]-1);
        pq.add(k-arr[n-1]);
        for (int i = 1; i<n; i++){
            if ((arr[i]-arr[i-1])/2>pq.peek()){
                pq.poll();
                pq.add((arr[i]-arr[i-1])/2);
            }
        }
        int sum = pq.poll();
        sum += pq.poll();
        pq.add(sum);
        for (int i = 1; i<n; i++){
            if ((arr[i]-arr[i-1]>2&&pq.peek()<arr[i]-arr[i-1]){
                pq.poll();
                pq.add(arr[i]-arr[i-1]);
            }
        }
    }
    static void printProbab(int arr[], int n, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(arr);
        getPQ(pq, arr, n, k);
        Double prob = 1.0*pq.poll()/k;
        System.out.println(prob);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new  int[n];
            for (int i = 0; i<n; i++){
                arr[i] = s.nextInt();
            }
            System.out.print("Case #"+testCase+": ");
            printProbab(arr,n,k);
        }
    }
}
