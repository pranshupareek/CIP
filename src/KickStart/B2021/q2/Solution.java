package KickStart.B2021.q2;
import java.util.*;

public class Solution {

    static void getDiff(int req[], int dif[], int n){
        for (int i = 1; i<n; i++){
            dif[i-1] = req[i-1]-req[i];
        }
    }
    static void getResult(int req[], int n){
        int dif[] = new int[n-1];
        getDiff(req, dif, n);
        n--;
        int res = 2;
        int cur = 2;
        int pvsIndex = -1;
        boolean haveChange = false;
        System.out.println(Arrays.toString(dif));
        int cd = dif[0];
        for (int i = 1; i<n; i++){

            if (dif[i]==dif[i-1]){
                cur++;
                cd = dif[i-1];
            }
            else if (haveChange){
                cur = i-pvsIndex+1;
                i++;
                if (i<n){
                    haveChange = true;
                    pvsIndex = i;
                    if (cd==dif[i-1]+dif[i]-cd){
                        cur++;
                        i++;
                        res = Math.max(res, cur);
                        if (i<n&&cd==dif[i]){
                            cur++;
                            res = Math.max(res, cur);
                            continue;
                        }
                        else if (i<n){
                            i--;
                            cur = 2;
                        }
                        else {
                            res = Math.max(res, cur);
                            break;
                        }
                        //need some op
                    }
                    else {
                        cur = 2;
                        i--;
                        
                        // need some op
                    }
                }
            }
            else {
                cur++;
                i++;
                if (i<n){
                    haveChange = true;
                    pvsIndex = i;
                    if (cd==dif[i-1]+dif[i]-cd){
                        cur++;
                        i++;
                        res = Math.max(res, cur);
                        if (i<n&&cd==dif[i]){
                            cur++;
                            res = Math.max(res, cur);
                            continue;
                        }
                        else if (i<n){
                            i--;
                            cur = 2;
                        }
                        else {
                            res = Math.max(res, cur);
                            break;
                        }
                        //need some op
                    }
                    else {
                        cur = 2;
                        i--;
                        
                        // need some op
                    }
                }

            }
            res = Math.max(res, cur);
        }  
        System.out.println(res);      

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
    }
}
