package CodeJam.cj1c.q3;

import java.util.*;

public class Solution {

    static long getBinaryInt(String str){
        int n = str.length();
        char pvs = '0';
        long num = 0;
        int cur = 0;
        for (int i = 0; i<n; i++){
            if (pvs!=str.charAt(i)){
                pvs=str.charAt(i);
                num*=10;
                num+=cur;
                cur = 0;
            }
            cur++;
        }
        num*=10;
        num+=cur;
        return num;
    }
    static void getRes(String txt, String pat){
        long text = getBinaryInt(txt);
        long patt = getBinaryInt(pat);
        System.out.println(text+" "+patt);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            String n = s.next();
            String c = s.next();
            System.out.print("Case #"+testCase+": ");
            getRes(n, c);
        }
    }
}
