package DSAAdvance.sorting;

import java.util.Arrays;

public class minDifference {
    static int minDiff(int arr[]){
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i< arr.length; i++){
            int cur = Math.abs(arr[i]-arr[i-1]);
            res = Math.min(cur,res);
        }
        return res;
    }
    public static void main(String arg[]){
        int arr[] = {1,8,12,5,18};
        System.out.println(minDiff(arr));
    }
}
