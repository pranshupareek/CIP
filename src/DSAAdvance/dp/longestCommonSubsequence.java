package DSAAdvance.dp;

public class longestCommonSubsequence {
    static int getLongestSS(String str1, String str2, int i, int j){
        if (i==str1.length()||j==str2.length()){
            return 0;
        }
        
        if (str1.charAt(i)!=str2.charAt(j)){
            int c1 = getLongestSS(str1, str2, i+1, j);
            int c2 = getLongestSS(str1, str2, i, j+1);
            return Math.max(c1, c2);
        }
        else {
            return getLongestSS(str1, str2, i+1, j+1)+1;
        }
    }

    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";

        System.out.println(getLongestSS(str1, str2, 0, 0));

        str1 = "AGGTAB";
        str2 = "GXTXAYB";

        System.out.println(getLongestSS(str1, str2, 0, 0));

        str1 = "ABC";
        str2 = "XY";

        System.out.println(getLongestSS(str1, str2, 0, 0));

    }
}
