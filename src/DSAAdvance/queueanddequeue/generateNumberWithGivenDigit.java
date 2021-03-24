package DSAAdvance.queueanddequeue;

import java.util.*;

public class generateNumberWithGivenDigit {
    static void genNum(int a, int b, int n){
        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        q.add(b);
        for (int i = 0; i<n; i++){
            int tp = q.remove();
            System.out.print(tp+" ");
            tp*=10;
            q.add(tp+a);
            q.add(tp+b);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        genNum(4, 5, 10);
    }
}
