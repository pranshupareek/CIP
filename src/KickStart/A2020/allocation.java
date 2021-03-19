package KickStart.A2020;

import java.util.Arrays;
import java.util.Scanner;

public class allocation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        int testCase = 1;
        while (t-->0){
            int n = s.nextInt();
            int budget = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i<n; i++){
                arr[i] = s.nextInt();
            }
            int res = 0;
            Arrays.sort(arr);
            int i;
            for (i = 0; i<n; i++){
                budget-=arr[i];
                if (budget<0){
                    break;
                }
                res++;
            }
            System.out.println("Case #"+testCase+": "+res);
            testCase++;
        }
    }
}
