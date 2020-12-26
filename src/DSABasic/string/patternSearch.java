package DSABasic.string;

import java.util.Scanner;

public class patternSearch {
    public static void pSA(String mstr, String ptrn){
        int n1 = mstr.length();
        int n2 = ptrn.length();
        for ( int i = 0; i < n1-n2+1; i++){
            int si = i;
            int pi = 0;
            int matchCount = 0;
            while (pi<n2 && mstr.charAt(si) == ptrn.charAt(pi)){
                si++;
                pi++;
                matchCount++;
            }
            if (matchCount == n2){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        String pat = s.next();
        pSA(txt, pat);
    }

}
