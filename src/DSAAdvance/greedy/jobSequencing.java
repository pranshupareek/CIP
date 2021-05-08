package DSAAdvance.greedy;

import java.util.Arrays;
import java.util.Comparator;

class Job{
    int deadline;
    int profit;
    Job(int x, int y){
        deadline = x;
        profit = y;
    }
}

public class jobSequencing {
    static int getProfit(Job j[]){
        int n = j.length;
        Arrays.sort(j,new Comparator<Job>(){
            public int compare(Job j1, Job j2){
                if (j1.deadline==j2.deadline){
                    return j2.profit-j1.profit;
                }
                return  j1.deadline-j2.deadline;
            }
        });

        int res=0;
        int curTime = 0;
        for (int i = 0; i<n; i++){
            if (j[i].deadline>curTime){
                res+=j[i].profit;
                curTime++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Job j[] = {
            new Job(4, 70),
            new Job(1, 80),
            new Job(1, 30),
            new Job(1,100)
        };
        System.out.println(getProfit(j));

        Job j2[] = {
            new Job(2, 50),
            new Job(2, 60),
            new Job(3, 20),
            new Job(3, 30)
        };

        System.out.println(getProfit(j2));

        Job j3[] = {
            new Job(2, 100),
            new Job(1, 50),
            new Job(2, 10),
            new Job(1, 20),
            new Job(3, 30)
        };

        System.out.println(getProfit(j3));
    }
}
