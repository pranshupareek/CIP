package DSAAdvance.dp;

public class shortestCommonSuperSequence {
    static String getSCSS(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        int dp[][] = new int[n1+1][n2+1];
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i<=n1; i++){
            for (int j = 1; j<=n2; j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                if (s1.charAt(i-1)==s2.charAt(j-1)&&dp[i][j]<dp[i-1][j-1]+1){
                    sb.append(s1.charAt(i-1));
                    dp[i][j] = dp[i-1][j-1]+1;
                }
            }
        }
        System.out.println(sb);
        System.out.println(dp[n1][n2]);
        return "";
    }

    public static void main(String[] args) {
        String s1 = "pranshu";
        String s2 = "pareek";
        System.out.println(getSCSS(s1, s2));
    }
}
