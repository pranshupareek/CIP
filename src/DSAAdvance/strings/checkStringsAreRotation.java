public class checkStringsAreRotation {
    static boolean checkString(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        if (n!=m){
            return false;
        }
        str1 += str1;
        return checkSubStr(str1, str2, str2.length());
    }
    static void fillLPS(String str, int lps[]){
        int n = str.length(), len = 0;
        lps[0] = 0;
        int i = 1;
        while (i<n){
            if (str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else {
                if (len==0) {
                    lps[i] = 0;
                    i++;
                }
                else {
                    len = lps[len-1];
                }
            }
        }
    }

    static boolean checkSubStr(String txt, String pat, int n){
        int[] lps = new int[n];
        fillLPS(pat, lps);
        int i = 0, j = 0;
        while (i<2*n){
            if (pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if (j == n){
                return true;
            }
            else if (i < 2*n && pat.charAt(j) != txt.charAt(i)) {
                if (j==0){
                    i++;
                }
                else
                    j = lps[j - 1];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CADB";
        System.out.println(checkString(str1, str2));
    }
}
