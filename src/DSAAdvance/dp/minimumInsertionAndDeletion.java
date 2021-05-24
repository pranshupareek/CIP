package DSAAdvance.dp;

public class minimumInsertionAndDeletion {
    static int getMinimumInsertionAndDeletion(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        int dp[][] = new int[n1+1][n2+1];
        for (int i = 1; i<=n1; i++){
            for (int j = 1; j<=n2; j++){
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                dp[i][j] = Math.max(dp[i][j], Math.max(dp[i-1][j], dp[i][j-1]));   
            }
        }
        return n1+n2-(2*dp[n1][n2]);
    }
    public static void main(String[] args) {
        String str1 = "pranshu";
        String str2 = "pareek";
        System.out.println(getMinimumInsertionAndDeletion(str1, str2));
        String s1 = "geek", s2 = "gfek";
        System.out.println(getMinimumInsertionAndDeletion(s1, s2));
    }
}
