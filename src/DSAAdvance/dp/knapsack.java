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

    public static void main(String[] args) {
        int val[] = {10,40,30,50};
        int weight[] = {5,4,6,3};
        int max = 10;

        System.out.println(getMaxProfit(val, weight, max, val.length));

        int val2[] = {60,100,120};
        int weight2[] = {10,20,30};
        max = 50;
        System.out.println(getMaxProfit(val2, weight2, max, val2.length));
    }
}