import java.util.Arrays;
import java.util.HashMap;

public class anagramSearch {
    static boolean checkAnagramPresent(String txt, String pat){
        int n = txt.length();
        int m = pat.length();
        int[] pa = new int[256];
        int[] ta = new int[256];
        for (int i = 0; i<m; i++){
            pa[pat.charAt(i)]++;
            ta[txt.charAt(i)]++;
        }
        for (int i = m; i<n; i++){
            if (Arrays.equals(pa, ta)){
                return true;
            }
            ta[txt.charAt(i-m)]--;
            ta[txt.charAt(i)]++;
        }
        return false;
    }
    public static void main(String[] args) {
        String txt = "Pranshu Pareek";
        String pat = "nashu";
        System.out.println(checkAnagramPresent(txt, pat));
    }
}
