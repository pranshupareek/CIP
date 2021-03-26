package CodeJam.qualification21.q2;

import java.util.*;

public class Solution {

    static void printFine(int x, int y, String painting){
        int n = painting.length();
        int res = 0;
        int i = 1;
        char prvs = painting.charAt(0);
        while (prvs=='?'&&i<n){
            prvs = painting.charAt(i++);
        }
        for (; i<n; i++){
            if (painting.charAt(i)!=prvs&&painting.charAt(i)!='?'){
                if (prvs=='C'){
                    res += x;
                }
                else {
                    res += y;
                }
                prvs = painting.charAt(i);
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            int x = s.nextInt();
            int y = s.nextInt();
            String painting = s.next();
            System.out.print("Case #"+testCase+": ");
            printFine(x,y,painting);
        }
    }
}
