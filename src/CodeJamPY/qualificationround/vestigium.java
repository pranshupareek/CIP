package CodeJamPY.qualificationround;

import java.util.*;

class vestigium {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int casee = 0;
        while (casee<t){
            casee++;
            int n = s.nextInt();
            int mat[][] = new int[n][n];
            for (int i = 0; i<n; i++){
                for (int j = 0; j<n; j++){
                    mat[i][j] = s.nextInt();
                }
            }
            int k = 0;
            int r = 0;
            int c = 0;
            for (int i = 0; i<n; i++){
                k+=mat[i][i];
            }
            for (int i = 0; i<n; i++){
                Set<Integer> hs = new HashSet<>();
                for (int j = 0; j<n; j++){
                    if (hs.contains(mat[i][j])){
                        r++;
                        break;
                    }
                    else {
                        hs.add(mat[i][j]);
                    }
                }
            }
            for (int i = 0; i<n; i++){
                Set<Integer> hs = new HashSet<>();
                for (int j = 0; j<n; j++){
                    if (hs.contains(mat[j][i])){
                        c++;
                        break;
                    }
                    else {
                        hs.add(mat[j][i]);
                    }
                }
            }
            System.out.println("Case #"+casee+": "+k+" "+r+" "+c);            
        }
        if(s != null) {
            s.close();
        }
    }
}
