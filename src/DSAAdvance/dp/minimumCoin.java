package DSAAdvance.dp;

import java.util.*;

public class minimumCoin {
    static int getMinDP(int[] coins, int val, int n){
        int dp[] = new int[val+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i<=val; i++){
            for (int j = 0; j<n; j++){
                if (coins[j]<=i&&dp[i-coins[j]]!=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        return dp[val];
    }

    static int getMin(int[] coins, int val, int n){
        if (val==0){
            return 0;
        }
        if (val<0||n==0){
            return -1;
        }

        int include, notInclude;

        include = getMin(coins, val-coins[n-1], n);
        notInclude = getMin(coins, val, n-1);

        if (include==-1&&notInclude==-1){
            return -1;
        }
        else if (include==-1){
            return notInclude;
        }
        else if (notInclude==-1){
            return include+1;
        }
        return Math.min(include+1, notInclude);
    }

    public static void main(String[] args) {
        int coins[] = {25,10,5};
        int val = 30;
        int n = coins.length;
        System.out.println(getMin(coins, val, n));
        System.out.println(getMinDP(coins, val, n));
    }
}
