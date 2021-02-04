package DSAAdvance.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class leader {
    static void printLeaders(int arr[]){
        Deque<Integer> s = new ArrayDeque<>();
        int n = arr.length;
        s.push(arr[n-1]);
        for (int i = n-2; i>=0; i--){
            if (s.peek()<arr[i]){
                s.push(arr[i]);
            }
        }
        while (s.isEmpty()!=true){
            System.out.print(s.pop()+" ");
        }
    }
    public static void main(String arg[]){
        int arr[] = {7,10,4,10,6,5,2};
        printLeaders(arr);
    }

}
