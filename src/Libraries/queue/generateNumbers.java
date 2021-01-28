package Libraries.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class generateNumbers {
    static void generateWith56(int n){
        Queue<Integer> q = new ArrayDeque<>();
        int s = 0;
        while (n-->0){
            q.add(s*10+5);
            q.add(s*10+6);
            s = q.poll();
            System.out.print(s+" ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        generateWith56(10);
    }
}
