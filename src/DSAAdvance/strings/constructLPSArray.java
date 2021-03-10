package DSAAdvance.strings;

import java.util.Arrays;

public class constructLPSArray {
    static int[] KMP(String str){
        int n = str.length();

        int[] lps = new int[n];
        int len = 0;
        int i=1;
        while(i<n){
            if(str.charAt(i)==str.charAt(len))
            {len++;lps[i]=len;i++;}
            else
            {if(len==0){lps[i]=0;i++;}
            else{len=lps[len-1];}
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String str1 = "abacabad";
        System.out.println(Arrays.toString(KMP(str1)));
        String str2 = "aaaa";
        System.out.println(Arrays.toString(KMP(str2)));
        String str3 = "abcd";
        System.out.println(Arrays.toString(KMP(str3)));
        String str4 = "ababab";
        System.out.println(Arrays.toString(KMP(str4)));
    }
}
