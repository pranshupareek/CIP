package DSAAdvance.dp;

import java.util.*;

public class knapsack{
    static int getMaxProfit(int val[], int weight[], int max, int n){
        if (n==0){
            return 0;
        }
        int res = 0;
        if (weight[n-1]<=max){
            res = getMaxProfit(val, weight, max-weight[n-1], n-1)+val[n-1];
        }
        return Math.max(res,getMaxProfit(val, weight, max, n-1));
    }

    static int getMaxProfitDP(int val[], int weight[], int max){
        int n = val.length;
        int dp[][] = new int[n+1][max+1];
        

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=max; j++){
                if (weight[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-weight[i-1]], dp[i-1][j]);
                }
            }
        }

        return dp[n][max];
    }

    public static void main(String[] args) {
        int val[] = {10,40,30,50};
        int weight[] = {5,4,6,3};
        int max = 10;

        System.out.println(getMaxProfit(val, weight, max, val.length));
        System.out.println(getMaxProfitDP(val, weight, max));
        int val2[] = {60,100,120};
        int weight2[] = {10,20,30};
        max = 50;
        System.out.println(getMaxProfit(val2, weight2, max, val2.length));
        System.out.println(getMaxProfitDP(val2, weight2, max));
    }
}