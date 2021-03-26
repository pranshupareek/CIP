package CodeJam.qualification21.q3;

import java.util.*;

public class Solution {

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int arr[], int from, int to){
        while (from<to){
            swap(arr,from,to);
            from++;
            to--;
        }
    }
    static Deque<Integer> getDeque(int n,int c){
        Deque<Integer> dq = new ArrayDeque<>();
        int reqNext = n-2;
        for (int i = 2; i<=n; i++){
            int rem = Math.min(i,c-reqNext);
            reqNext--;
            dq.add(rem);
            c-=rem;
        }
        return dq;
    }
    static void printArt(int n, int c){
        int maxPossible = ((n*(n+1))/2) - 1;
        if (c>maxPossible||c<n-1){
            System.out.println("IMPOSSIBLE");
            return;
        }
        int arr[] = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = i+1;
        }
        Deque<Integer> dq = getDeque(n, c);
        for (int i = n-2; i>=0; i--){
            int pop = dq.pollFirst();
            reverse(arr, i, i+pop-1);
        }
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            int n = s.nextInt();
            int c = s.nextInt();
            System.out.print("Case #"+testCase+": ");
            printArt(n, c);
        }
    }
}
