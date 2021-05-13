package DSAAdvance.dp;

public class coinChangeCountCombinations {
    static void count(int arr[], int i, int curSum, int reqSum, int res[]){
        int n = arr.length;
        
        if (reqSum<curSum){
            return;
        }
        
        if (reqSum == curSum){
            res[0]++;
            return;
        }

        for (;i<n; i++){
            count(arr, i, curSum+arr[i], reqSum, res);
        }
    }

    static int countDP(int coins[], int n, int sum){
        int dp[][] = new int[sum+1][n+1];

        for (int i = 0; i<=n; i++){
            dp[0][i]=1;
        }

        for (int i = 1; i<=sum; i++){
            for (int j = 1; j<=n; j++){
                dp[i][j] = dp[i][j-1];

                if (coins[j-1]<=i){
                    dp[i][j]+=dp[i-coins[j-1]][j];
                }
            }
        }
        return dp[sum][n];
    }

    public static void main(String[] args) {
        int coins[] = {1,2,3};
        int res[] = new int[1];
        count(coins, 0, 0, 4, res);
        System.out.println(res[0]);
        int coins2[] = {2,5,3,6};
        res[0] = 0;
        count(coins2, 0, 0, 10, res);
        System.out.println(res[0]);

        System.out.println(countDP(coins, coins.length, 4));
    }
}
