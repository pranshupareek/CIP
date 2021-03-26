package KickStart.A2020;

import java.util.*;

public class workout {

    static void minDiffculty(int minute[], int n, int k, int testCase){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i<n; i++){
            pq.add(minute[i]-minute[i-1]);
        }
        for (int i = 0; i<k; i++){
            int max = pq.poll();
            int j = 0;

            while (i+1<k&&max/(2+j)>pq.peek()){
                j++;
                i++;
            }
            int ta = max/(2+j);
            if (ta<1){
                ta = 1;
            }
            for (int x = 1; x<2+j;x++){
                pq.add(ta);
                max-=ta;
            }
            pq.add(max);
        }
        int ans = pq.peek();
        System.out.println("Case #"+testCase+": "+ans);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int testCase = 1; testCase<=t; testCase++){
            int n = s.nextInt();
            int k = s.nextInt();
            int minute[] = new int[n];
            for (int i = 0; i<n; i++){
                minute[i] = s.nextInt();
            }
            minDiffculty(minute, n, k, testCase);

        }
    }
}
