package DSAAdvance.dp;

import java.util.Arrays;

public class minimumJumpsToReachEnd {
    static int getMinDP(int arr[]){
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i<n; i++){
            for (int j = 0; j<i; j++){
                if (arr[j]+j>=i){
                    if (dp[j]!=Integer.MAX_VALUE)
                        dp[i] = Math.min(dp[i], dp[j]+1);
                }
            }   
        }
        return dp[n-1];
    }

    static int getMin(int arr[], int n){
        if (n==1){
            return 0;
        }
        if (n<1){
            return Integer.MAX_VALUE;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i<n-1; i++){
            if (arr[i]>=n-i-1){
                res = Math.min(res, getMin(arr, i+1));
            }
        }

        return res+1;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,2,1,2,1};
        System.out.println(getMin(arr, arr.length));

        int arr2[] = {4,1,5,3,1,3,2,1,8};
        System.out.println(getMin(arr2, arr2.length));

        System.out.println(getMinDP(arr));
        System.out.println(getMinDP(arr2));
    }
}
