package Libraries.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class reverseFirstK {
    static void reverseK(Queue<Integer> q,int k){
        Deque<Integer> s = new ArrayDeque<>();

        for (int i = 0; i < k; i++){
            s.push(q.poll());
        }
        for (int i = 0; i < k; i++){
            q.offer(s.pop());
        }
        for (int i =0; i < q.size()-k; i++){
            q.offer(q.poll());
        }
    }
    public static void main (String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        int k=3;

        reverseK(q,k);

        System.out.println(q);
    }
}
