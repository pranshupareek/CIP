package DSAAdvance.dp;

public class maximumSumIncreasingSS {
    static int getMaxSumISS(int arr[]){
        int n = arr.length;
        int dp[] = new int[n];
        int res = arr[0];
        for (int i = 0; i<n; i++){
            dp[i] = arr[i];
            for (int j = 0; j<i; j++){
                if (arr[j]<arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+arr[i]);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {3,20,4,6,7,30};
        int arr2[] = {5,10,20};
        int arr3[] = {20,10,5};
        System.out.println(getMaxSumISS(arr));
        System.out.println(getMaxSumISS(arr2));
        System.out.println(getMaxSumISS(arr3));
    }
}
