package DSAAdvance.dp;

public class palindromePartitioning {
    static boolean checkPalindrome(String str, int i, int j){
        while(i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static int makePalindrome(String str, int left, int right){
        if (checkPalindrome(str,left,right)){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int i = left; i<right; i++){
            res = Math.min(res, makePalindrome(str, left, i)+makePalindrome(str, i+1, right));
        }
        return res+1;
    }
    static int makePalindromeDP(String str){
        int n = str.length();
        int dp[][] = new int[n][n];
        for (int gap = 1; gap<n; gap++){
            for (int i = 0; i+gap<n; i++){
                int j = i+gap;
                if (checkPalindrome(str, i, j)){
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k<j; k++){
                    dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k+1][j]+1);
                }                                
                
            }
        }
        return dp[0][n-1];
    }
    public static void main(String[] args) {
        System.out.println(makePalindrome("geek", 0, 3));
        System.out.println(makePalindrome("abbac", 0, 4));
        System.out.println(makePalindrome("abcde", 0, 4));
        System.out.println(makePalindrome("aaaa", 0, 3));
        System.out.println(makePalindrome("abbabbc", 0, 6));
        System.out.println(makePalindromeDP("geek"));
        System.out.println(makePalindromeDP("abbac"));
        System.out.println(makePalindromeDP("abcde"));
        System.out.println(makePalindromeDP("aaaa"));
        System.out.println(makePalindromeDP("abbabbc"));
    }
}
