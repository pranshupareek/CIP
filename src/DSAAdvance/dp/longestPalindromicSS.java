package DSAAdvance.dp;

public class longestPalindromicSS {
    static String getLongestPSS(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        int n = str.length();
        int dp[][] = new int[n+1][n+1];
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n; j++){
                if (str.charAt(i-1)==sb.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        // for (int[] i: dp){
        //     System.out.println(Arrays.toString(i));
        // }
        StringBuffer res = new StringBuffer();
        int i = n, j = n;
        while (i>0&&j>0){
            // System.out.println(i+" "+j);
            if (str.charAt(i-1)==sb.charAt(j-1)){
                res.append(str.charAt(i-1));
                i--;
                j--;
            }
            else if (dp[i][j-1]>dp[i-1][j]){
                j--;
            }
            else {
                i--;
            }
        }

        return res.toString();

    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(getLongestPSS(str));
    }
}
