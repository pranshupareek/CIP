package CodeJam.qualification21.q1;

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
    static void printCost(int arr[], int n){
        int res = 0;
        for (int i = 0; i<n-1; i++){
            int cur = i;
            while (arr[cur]!=i+1){
                cur++;
            }
            if (i==cur){
                res++;
            }
            else {
                reverse(arr, i, cur);
                res+= cur-i+1;
            }
        }
        System.out.println(res);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            int n = s.nextInt();
            int[] arr = new  int[n];
            for (int i = 0; i<n; i++){
                arr[i] = s.nextInt();
            }
            System.out.print("Case #"+testCase+": ");
            printCost(arr,n);
        }
    }
}
