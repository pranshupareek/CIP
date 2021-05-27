package DSAAdvance.dp;

public class longestRepeatingSS {
    static String getLongestRSS(String s1){
        int n = s1.length();
        String s2 = new String(s1);
        int dp[][] = new int[n+1][n+1];
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n; j++){
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        int i = n,j = n;
        while(i>0&&j>0){
            if (i!=j&&s1.charAt(i-1)==s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
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
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "AABB";
        System.out.println(getLongestRSS(str));
    }
}
