package Libraries.priorityqueue;

import java.util.PriorityQueue;

public class purchaseMax {
    static int purchaseMaxItem(int cost[],int sum){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x: cost){
            pq.add(x);
        }
        int nos = 0;
        while (sum>=0&&!pq.isEmpty()&&pq.peek()<=sum){
            sum-=pq.poll();
            nos++;
        }
        return nos;
    }
    public static void main(String arg[]){
        int cost[] = {1, 11, 5, 111, 200};
        int sum = 6;
        System.out.println(purchaseMaxItem(cost,sum));
    }
}
