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

    static int eggDropDP(int n, int k){
        int dp[][] = new int[n+1][k+1];
        Arrays.fill(dp[1], 1);
        for (int i = 2; i<=n; i++){
            dp[i][1] = i;
        }
        for (int i = 2; i<=n; i++){
            for (int j = 2; j<=k; j++){
                for(int x = 1; x<=j; x++){
                    dp[i][j] = Math.min(dp[i][j],Math.max(dp[i-1][x-1], b))
                }
            }
        }

    }

    public static void main(String[] args) {
        int n = 2, k = 10;
        System.out.println(eggDropp(n, k));
    }
}
