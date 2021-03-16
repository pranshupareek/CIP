package CodeJamPY.qualificationround;

import java.util.*;

public class nestingDepth {
    static void nestingDep(String str,int t){
        String sol = "";
        int n = str.length();
        int i = 0;
        int num;
        int pvs = 0;
        while (i<n){
            num = Integer.parseInt(""+str.charAt(i));

            for (int j = pvs; j<num; j++){
                sol = sol+'(';
            }
            for (int j = pvs; j>num; j--){
                sol += ')';
            }
            sol += num;
            
            pvs = num;
            i++;
        }
        for (int j = pvs; j>0; j--){
            sol += ')';
        }
        System.out.println("Case #"+t+": "+sol);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        for (int t = 1; t<=test; t++){
            String str = s.next();
            nestingDep(str, t);
        }
    }
}
