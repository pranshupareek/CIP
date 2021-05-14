package DSAAdvance.dp;

public class longestIncreasingSubsequence {
    static int getLIS(int arr[], int n, int ch){
        if (n==0){
            return 0;
        }
        int res = 0;
        if (ch>arr[n-1]){
            res = getLIS(arr, n-1, arr[n-1])+1;
        }
        return Math.max(res, getLIS(arr, n-1, ch));

    }
    static int getLongestIncreasingSubsequence(int arr[]){
        int n = arr.length;
        int dp[] = new int[n];
        dp[0] = 1;
        for (int i = 1; i<n; i++){
            dp[i] = 1;
            for (int j = 0; j<i; j++){
                if (arr[j]<arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int res = dp[0];
        for (int i = 1; i<n; i++){
            res = Math.max(res, dp[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,2,8,10};
        System.out.println(getLIS(arr, 5, Integer.MAX_VALUE));

        int arr2[] = {4,10,6,5,8,11,2,20};
        System.out.println(getLIS(arr2,8,Integer.MAX_VALUE));

        int arr3[] = {1,2,3};
        System.out.println(getLIS(arr3, 3, Integer.MAX_VALUE));

        int arr4[] = {3,2,1};
        System.out.println(getLIS(arr4, 3, Integer.MAX_VALUE));

        System.out.println(getLongestIncreasingSubsequence(arr));
        System.out.println(getLongestIncreasingSubsequence(arr2));
        System.out.println(getLongestIncreasingSubsequence(arr3));
        System.out.println(getLongestIncreasingSubsequence(arr4));
    }


}
