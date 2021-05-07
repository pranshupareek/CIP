package DSAAdvance.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class activitySelection {
    static int getCount(int[][] act){
        int n = act.length;
        Arrays.sort(act,new Comparator<int[]>(){
            public int compare(int[] a, int [] b ){
                return a[1]-b[1];
            }
        });

        int count = 1;
        int pvs = act[0][1];
        for (int i = 1; i<n; i++){
            if (pvs<=act[i][0]){
                count++;
                pvs = act[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int act[][] = {
            {3,8},
            {2,4},
            {1,3},
            {10,11}
        };
        System.out.println(getCount(act));
    }
}
