import java.util.*;

public class Solution {

    static void getResult(int r, int c, int k){
        if (k==r*c-1){
            System.out.println("IMPOSSIBLE");
            return;
        }
        StringBuffer res[] = new StringBuffer[r];
        for (int i = 0; i<r; i++) {
            res[i] = new StringBuffer();
        }
        System.out.println("POSSIBLE");
        if (r>c){
            
            int i = 0;
            int j = 0;
            int count = 0;
            for (i = 0; i<c&&count<k; i++){
                for (j = 0; j<r&&count<k; j++){
                    res[j].append('N');
                    count++;
                }
            }
            int index = i;
            if (i==r-1){
                res[j].append('E');
                j++;
            }
            for (;i<c; i++){
                res[r-1].append('N');
            }
            for (;j<r-1; j++){
                res[j].append('S');
            }
            for (i = index+1; i<c; i++){
                for (j = 0; j<r-1; j++){
                    res[j].append('S');
                }
            }

        }
        else {
            int i = 0;
            int j = 0;
            int count = 0;
            for (i = 0; i<r&&count<k; i++){
                for (j = 0; j<c&&count<k; j++){
                    res[i].append('W');
                    count++;
                }
                if (count==k){
                    break;
                }
            }
            if (j==c-1){
                res[i].append('S');
                i++;
            }
            int index = i;
            for (;j<c-1; j++){
                res[i].append('E');
            }
            for (i = index; i<r; i++){
                for (j = 0; j<c-1; j++){
                    res[j].append('E');
                }
            }
            for (i = index;i<r; i++){
                res[i].append('W');
            }
        }
        for (int i = 0; i<r; i++){
            System.out.println(res[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            int r = s.nextInt();
            int c = s.nextInt();
            int k = s.nextInt();            

            System.out.print("Case #"+testCase+": ");
            getResult(r,c,k);
        }
    }
}
