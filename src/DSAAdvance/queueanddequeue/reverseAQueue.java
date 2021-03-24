package DSAAdvance.queueanddequeue;

import java.util.*;

public class reverseAQueue {
    static Queue<Integer> reverse(Queue<Integer> q){
        if (q.size()==1){
            return q;
        }
        int ele = q.poll();
        reverse(q);
        q.add(ele);
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q = reverse(q);
        for (Integer integer : q) {
            System.out.print(integer+" ");
        }
        System.out.println();
    }
}
