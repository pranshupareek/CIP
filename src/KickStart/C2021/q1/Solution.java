package KickStart.C2021.q1;

import java.util.*;

public class Solution {

    static void getResult(String str, int n, int ma){
        int res = 0;
        int mod = (int)10e9+7;
        int stop = (n%2==0)?(n/2)-1:n/2;
        for (int i = 0; i<=stop; i++){
            long cur = str.charAt(i)-'a';
            cur= (cur*((long)Math.pow(ma, stop - i))%mod)%mod;
            res=(res+(int)cur)%mod;
        }
        int j = (n%2==0)?1:2;
        for (int i = stop+1; i<n; i++){
            if(str.charAt(i)<str.charAt(i-j)){
                break;
            }
            else if (str.charAt(i)>str.charAt(i-j)){
                res= (res+1)%mod;
                break;
            }
            j++;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            int n = s.nextInt();
            int ma = s.nextInt();
            String str = s.next();      

            System.out.print("Case #"+testCase+": ");
            getResult(str,n,ma);
        }
        s.close();
    }
}
