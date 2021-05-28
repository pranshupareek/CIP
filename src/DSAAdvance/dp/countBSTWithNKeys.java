package DSAAdvance.dp;

public class countBSTWithNKeys {
    static int getCount(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i<=n; i++){
            for (int j = 1;j<=i; j++){
                dp[i]+= dp[j-1]*dp[i-j];
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(getCount(2));
        System.out.println(getCount(3));
        System.out.println(getCount(4));
        System.out.println(getCount(5));
    }
}
