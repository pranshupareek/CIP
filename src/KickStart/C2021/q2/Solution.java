package KickStart.C2021.q2;
import java.util.*;

public class Solution {

    static void getResult(int req[], int n){
           
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            int n = s.nextInt();
            int req[] = new int[n];
            for (int i = 0; i<n; i++){
                req[i] = s.nextInt();
            }
            System.out.print("Case #"+testCase+": ");
            getResult(req,n);
        }
        s.close();
    }
}
