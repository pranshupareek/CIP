package DSAAdvance.dp;

import java.util.Arrays;

public class shortestCommonSuperSequence {
    static String getSCSS(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        int dp[][] = new int[n1+1][n2+1];
        // StringBuffer sb = new StringBuffer();
        for (int i = 0; i<=n1; i++){
            for (int j = 0; j<=n2; j++){
                if (i==0){
                    dp[i][j] = j;
                }
                else if (j==0){
                    dp[i][j] = i;
                }
                else if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j] = 1+Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int i = n1;
        int j = n2;
        StringBuilder sb = new StringBuilder();
        while(i>0&&j>0){
            if (s1.charAt(i-1)==s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if (dp[i][j-1]>=dp[i-1][j]){
                sb.append(s2.charAt(j-1));
                j--;
            }
            else {
                sb.append(s1.charAt(i-1));
                i--;
            }
        }
        while(i>0){
            sb.append(s1.charAt(i-1));
            i--;
        }
        while(j>0){
            sb.append(s2.charAt(j-1));
            j--;
        }
        for (i = 0; i<=n1; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        sb.reverse();
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
