package KickStart.A2020;

import java.util.*;

public class plates {

    static int removeMinPeek(ArrayList<ArrayDeque<Integer>> als, int n){
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i<n; i++){
            if (!als.get(i).isEmpty()){
                int val = als.get(i).peek();
                if (min>val){
                    min = val;
                    minIndex = i;
                }
            }
        }
        return als.get(minIndex).pop();
    }
    static void beauty(ArrayList<ArrayDeque<Integer>> als,int n, int k, int sum, int reqPlates, int testCase){
        int curPlate = k*n;
        while (curPlate>reqPlates){
            sum -= removeMinPeek(als, n);
            curPlate--;
        }
        System.out.println("Case #"+testCase+": "+sum);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int testCase = 1; testCase<=t; testCase++){
            int n = s.nextInt();
            int k = s.nextInt();
            int p = s.nextInt();
            ArrayList<ArrayDeque<Integer>> als = new ArrayList<ArrayDeque<Integer>>(n+1);
            int sum = 0;
            for (int i = 0; i<n; i++){
                als.add(new ArrayDeque<>());
                for (int j = 0; j<k; j++){
                    int temp = s.nextInt();
                    sum += temp;
                    als.get(i).push(temp);
                }
            }
            beauty(als, n, k, sum, p, testCase);
        }
    }
}
