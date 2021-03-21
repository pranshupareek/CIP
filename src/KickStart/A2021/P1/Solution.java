package KickStart.A2021.P1;

import java.util.Scanner;

public class Solution {

    static void reqOperation(String str, int n, int k, int testCase){
        int ops = 0;
        for (int i = 0; i<n/2; i++){
            if (str.charAt(i)!=str.charAt(n-i-1)){
                ops++;
            }
        }
        if (k>ops){
            k = k-ops;
        }
        else {
            k = ops-k;
        }
        System.out.println("Case #"+testCase+": "+k);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int testCase=1; testCase<=t; testCase++){
            int n = s.nextInt();
            int k = s.nextInt();
            String str = s.next();
            reqOperation(str, n, k, testCase);
        }
    }
}
