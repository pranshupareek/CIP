package DSAAdvance.dp;

import java.util.Arrays;
import java.util.Comparator;

public class buildingBridge {
    static int getPossibleBridgeCount(int arr[][]){
        int n = arr.length;
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int[] arr1, int[] arr2){
                if (arr1[0]!=arr2[0]){
                    return arr1[0]-arr2[0];
                }
                return arr1[1]-arr2[1];
            }
        });
        int dp[] = new int[n];
        dp[0] = 1;
        int res = dp[0];
        for (int i = 1; i<n; i++){
            for(int j = 0; j<i; j++){
                if (arr[i][1]>arr[j][1])
                    dp[i] = Math.max(dp[i], dp[j]+1);
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {6,2},
            {4,3},
            {2,6},
            {1,5}
        };
        System.out.println(getPossibleBridgeCount(arr));
    }
    
}
