package DSAAdvance.queueanddequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class firstCircularTour {
    static int getIndex(int petrol[], int dist[]){
        int n = petrol.length;

        Deque<Integer> dq = new ArrayDeque<>();
        int curPet = 0;
        int startingPoint = 0;
        for (int i = 0; i<n; i++){
            if (curPet<0){
                startingPoint = i;
                curPet = 0;
            }
            curPet += petrol[i] - dist[i];
            dq.add(petrol[i]-dist[i]);
        }
        for (int i = 0; i<startingPoint&&curPet<0; i++){
            curPet+=dq.remove();
        }
        if (curPet>=0){
            return startingPoint+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int petrol[] = {4,8,7,4};
        int dist[] = {6,5,3,5};
        System.out.println(getIndex(petrol, dist));

        int p2[] = {8,9,4};
        int d2[] = {5,10,12};
        System.out.println(getIndex(p2, d2));

        int p3[] = {4,8};
        int d3[] = {5,6};
        System.out.println(getIndex(p3, d3));
    }
}
