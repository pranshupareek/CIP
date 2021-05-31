package DSAAdvance.dp;

public class allocateMinimumPages {
    static int getSum(int arr[], int start, int end){
        int res = 0;
        for (int i = start; i<=end; i++){
            res+=arr[i];
        }
        return res;
    }
    static int getMinPage(int arr[], int n, int k){
        if (k==1){
            return getSum(arr, 0, n);
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i<=n; i++){
            res = Math.min(res, Math.max(getMinPage(arr, n-i, k-1),getSum(arr, n+1-i, n)));
        }
        return res;
    }
    static int getCountDP(int arr[], int start, int end){
        if (start==0){
            return arr[end];
        }
        return arr[end]-arr[start-1];
    }
    static int getMinPageDP(int arr[], int k){
        int n = arr.length;
        int dp[][] = new int[k][n];
        for (int i = 1; i<n; i++){
            arr[i] = arr[i]+arr[i-1];
            dp[0][i] = arr[i];
        }
        for (int i = 0; i<k; i++){
            dp[i][0] = arr[0];
        }
        for (int i = 1; i<k; i++){
            for (int j = 1;j<n; j++){
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 0; x<j; x++){
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[i-1][x],getCountDP(arr, x+1, j)));
                }
            }
        }
        return dp[k-1][n-1];

    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int n = arr.length-1;
        int k = 2;
        System.out.println(getMinPage(arr, n, k));
        System.out.println(getMinPageDP(arr, k));
        int arr2[] = {10,20,30};
        k = 1;
        n = arr2.length-1;
        System.out.println(getMinPage(arr2, n, k));
        System.out.println(getMinPageDP(arr2, k));
        int arr3[] = {10,5,30,1,2,5,10,10};
        n = arr3.length-1;
        k = 3;
        System.out.println(getMinPage(arr3, n, k));
        System.out.println(getMinPageDP(arr3, k));
    }
}
