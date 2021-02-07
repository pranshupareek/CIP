package DSAAdvance.arrays;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class windowSlidingTechnique {
    static int maxSumOfKElements(int arr[], int k){
        int n = arr.length;
        int curSum = 0;
        for (int i = 0; i<k; i++){
            curSum+=arr[i];
        }
        int max = curSum;
        for (int i = k; i<n; i++){
            curSum+=arr[i]-arr[i-k];
            max = Math.max(max,curSum);
        }
        return max;
    }

    static boolean haveGivenSum(int arr[], int sum){
        int n = arr.length;
        int curSum = 0;
        int r = 0;
        while (sum>curSum){
            curSum+=arr[r];
            r++;
        }
        int l = 0;
        while (true){
            if (curSum==sum){
                return true;
            }
            else if (sum<curSum&&l<n){
                curSum-=arr[l];
                l++;
            }
            else if (sum>curSum&&r<n){
                curSum+=arr[r];
                r++;
            }
            else {
                break;
            }
        }

        return false;
    }

    static void printNBonacci(int n, int m){
        Queue<Integer> q = new ArrayDeque<>(n);
        for (int i = 1; i<n ; i++){
            q.add(0);
        }
        q.add(1);
        int curSum = 1;
        for (int i = 0; i<m; i++){
            int remove = q.poll();
            System.out.print(remove+" ");
            int temp = curSum;
            q.add(temp);
            curSum-=remove;
            curSum+=temp;
        }
        System.out.println();
    }

    static void printCountOfDistinctElement(int arr[], int k){
        int n = arr.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i<k; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        for (int i = 0; i<n-k; i++){
            int distinct = hm.size();
            System.out.print(distinct+" ");
            if (hm.get(arr[i])==1){
                hm.remove(arr[i]);
            }
            else {
                hm.put(arr[i],hm.get(arr[i])-1);
            }
            hm.put(arr[i+k], hm.getOrDefault(arr[i+k],0)+1);
        }
        System.out.println(hm.size());
    }

    public static void main(String arg[]){
        int arr[] = {1,8,30,-5,20,7};
        int k = 3;
        System.out.println(maxSumOfKElements(arr,k));

        int arr2[] = {1,4,20,3,10,5};
        int sum = 18;
        System.out.println(haveGivenSum(arr2,sum));

        printNBonacci(4,10);

        int arr3[] = {1,2,1,3,4,3,3};
        printCountOfDistinctElement(arr3,4);
    }
}
