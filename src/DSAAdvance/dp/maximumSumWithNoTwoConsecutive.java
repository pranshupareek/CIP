package DSAAdvance.dp;

public class maximumSumWithNoTwoConsecutive {
    static int getMaxSum(int arr[]){
        int n = arr.length;
        int dp[] = new int[n];
        if (n==1){
            return arr[0];
        }
        if (n==2){
            return Math.max(arr[0], arr[1]);
        }
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i<n; i++){
            dp[i] = Math.max(Math.max(arr[i], 0)+dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int arr[] = {1,10,2};
        int arr2[] = {8,7,6,10};
        int arr3[] = {10,5,15,20,2,30};
        System.out.println(getMaxSum(arr));
        System.out.println(getMaxSum(arr2));
        System.out.println(getMaxSum(arr3));
    }
}
