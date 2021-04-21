package KickStart.B2021.q1;

import java.util.*;

public class Solution {

    static void getResult(String str, int n){
        System.out.print("1 ");
        int pvs = 1;
        for (int i = 1; i<n; i++){
            if (str.charAt(i)>str.charAt(i-1)){
                pvs++;
                System.out.print(pvs+" ");
            }
            else {
                pvs = 1;
                System.out.print(pvs+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            int n = s.nextInt();
            String str = s.next();      

            System.out.print("Case #"+testCase+": ");
            getResult(str,n);
        }
    }
}
