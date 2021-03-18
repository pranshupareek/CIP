package CodeJamPY.qualificationround;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

class pair implements Comparable<pair>{
    int time;
    int index;
    pair(int a, int b){
        time = a;
        index = b;
    }
    public int compareTo(pair p){
        return this.time - p.time;
    }
}

public class parentingPartneringReturns {
    static void doPPR(pair startTime[],pair endTime[], int testCase){
        Arrays.sort(startTime);
        Arrays.sort(endTime);
        int n = startTime.length;
        int i=0,j=0;
        String res = "";
        int currentLoad = 0;
        HashMap<Integer, Character> hm = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();
        stack.push('J');
        stack.push('C');
        while (i<n&&j<n){
            if (startTime[i].time<endTime[j].time){
                currentLoad++;
                if (currentLoad>2){
                    res = "IMPOSSIBLE";
                    break;
                }
                hm.put(startTime[i].index, stack.pop());
                i++;
            }
            else {
                currentLoad--;
                stack.push(hm.get(endTime[j].index));
                j++;
            }

        }

        if (res!="IMPOSSIBLE"){
            for (i = 0; i<n; i++){
                res+=hm.get(i);
            }
        }
        System.out.println("Case #"+testCase+": "+res);        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 1; test<=t; test++){
            int n = s.nextInt();
            pair startTime[] = new pair[n];
            pair endTime[] = new pair[n];
            for (int i = 0; i<n; i++){
                startTime[i] = new pair(s.nextInt(), i);
                endTime[i] = new pair(s.nextInt(), i);
            }
            doPPR(startTime, endTime, test);
        }
    }
}
