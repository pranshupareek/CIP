package DSAAdvance.dp;

public class subsetSumProblem {
    static int getCount(int arr[], int n, int sum){
        if (n==0){
            return (sum==0)?1:0;
        }
        return getCount(arr, n-1, sum-arr[n-1])+getCount(arr, n-1, sum);
    }

    static int getCountDP(int arr[], int sum){
        int n = arr.length;
        int dp[][] = new int[n+1][sum+1];
        for(int i = 0; i<=n; i++){
            dp[i][0] = 1;
        }
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=sum; j++){
                if (arr[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {10,5,2,3,6};
        int arr2[] = {1,2,3};
        int arr3[] = {10,20,15};
        int arr4[] = {10,20,15};
        int arr5[] = {2,5,3};
        int sum = 5;
        System.out.println(getCount(arr, 5, 8));
        System.out.println(getCount(arr2, 3, 4));
        System.out.println(getCount(arr3, 3, 37));
        System.out.println(getCount(arr4, 3, 0));
        System.out.println(getCountDP(arr, 8));
        System.out.println(getCountDP(arr2, 4));
        System.out.println(getCountDP(arr3, 37));
        System.out.println(getCountDP(arr4, 0));
        System.out.println(getCount(arr5, 3, sum));
        System.out.println(getCountDP(arr5, sum));
    }
}
