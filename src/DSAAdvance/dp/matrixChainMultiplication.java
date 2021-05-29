package DSAAdvance.dp;

import java.util.Arrays;

public class matrixChainMultiplication {
    static int mChain(int[] arr, int i, int j){
        if (i+1==j){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int k = i+1; k<j; k++){
            res = Math.min(res,mChain(arr, i, k)+mChain(arr, k, j)+arr[i]*arr[k]*arr[j]);
        }
        return res;
    }

    static int mChainDP(int[] arr){
        int n = arr.length;
        int dp[][] = new int[n][n];
        for (int gap = 2; gap<n; gap++)
            for (int i = 0; i+gap<n; i++){
                int j = i+gap;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i+1; k<j; k++)
                    dp[i][j] = Math.min(dp[i][j],dp[i][k]+dp[k][j]+arr[i]*arr[j]*arr[k]);
            }
        for (int i = 0; i<n; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[0][n-1];
    }
    public static void main(String[] args) {
        int arr[] = {4,2,3,1,3};
        int i = 0;
        int j = arr.length-1;
        System.out.println(mChain(arr, i, j));
        int arr2[] = {10,30,5,60};
        j = arr2.length-1;
        System.out.println(mChain(arr2, i, j));
        System.out.println(mChainDP(arr));
        System.out.println(mChainDP(arr2));
    }
}
