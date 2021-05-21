package DSAAdvance.dp;

public class optimalStrategyForAGame {
    static int getSol(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n][n];
        int row = 0;
        for (int j = 1; j<n; j++){
            dp[row][j] = Math.max(arr[row],arr[j]);
            row++;
        }


        for (int i = 3; i<n; i+=2){
            row = 0;
            for (int j = i; j<n; j++){
                dp[row][j] = Math.max(arr[row]+Math.min(dp[row+2][j],dp[row+1][j-1]),arr[j]+Math.min(dp[row+1][j], dp[row][j-2]));
                row++;
            }
        }

        return dp[0][n-1];
    }

    public static void main(String[] args) {
        int arr[] = {20,5,4,6};
        System.out.println(getSol(arr));
        int arr2[] = {2,3,15,7};
        System.out.println(getSol(arr2));
    }
}
