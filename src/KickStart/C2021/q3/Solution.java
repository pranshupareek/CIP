package KickStart.C2021.q3;

import java.util.*;

public class Solution {
    static void getRes(String str){
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            String str = s.next();
            System.out.print("Case #"+testCase+": ");
            getRes(str);
        }
        s.close();
    }
}
