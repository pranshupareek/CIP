package DSAAdvance.dp;

import java.util.Arrays;
import java.util.Comparator;

public class longestChainPairs {
    static int getLCP(int arr[][]){
        int n = arr.length;
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int[] a1, int[] a2){
                return a1[0]-a2[0];
            }
        });
        int dp[] = new int[n];
        dp[0] = 1;
        int res = dp[0];
        for (int i = 1; i<n; i++){
            for (int j = 0; j<i; j++){
                if (arr[i][0]>arr[j][1]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {5,4},
            {39,60},
            {15,28},
            {27,40},
            {50,90}
        };
        System.out.println(getLCP(arr));
        int arr2[][] = {
            {6,8},
            {3,4}
        };
        System.out.println(getLCP(arr2));
    }
}
