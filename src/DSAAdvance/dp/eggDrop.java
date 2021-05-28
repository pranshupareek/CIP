package DSAAdvance.dp;

import java.util.Arrays;

public class eggDrop {
    static int eggDropp(int n, int k){
        if (k==1||k==0){
            return k;
        }

        if (n==1){
            return k;
        }

        int min = Integer.MAX_VALUE;
        int x,res;

        for (x = 1; x<=k; x++){
            res = Math.max(eggDropp(n-1,x-1), eggDropp(n, k-x));
            if (res<min){
                min = res;
            }
        }
        return min+1;
    }

    static int eggDropDP(int egg, int floor){
        int dp[][] = new int[egg+1][floor+1];
        for (int i = 1; i<=egg;i++){
            dp[i][1] = 1;
        }
        for(int i = 2; i<=floor; i++){
            dp[1][i] = i;
        }
        
        for (int i = 2; i<=floor; i++){
            for (int j = 2; j<=egg; j++){
                dp[j][i] = Integer.MAX_VALUE;
                for (int k = 1; k<=i; k++){
                    dp[j][i] = Math.min(dp[j][i],1+Math.max(dp[j-1][k-1],dp[j][i-k]));
                }
            }
        }
        return dp[egg][floor];
    }

    public static void main(String[] args) {
        int n = 2, k = 10;
        System.out.println(eggDropp(n, k));
        System.out.println(eggDropDP(n, k));
    }
}
