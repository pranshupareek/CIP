package Libraries.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class prevGreater {
    static void printPrevGreater(int arr[]){
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = 0; i< arr.length; i++){
            if (s.isEmpty()){
                System.out.print("-1 ");
                s.push(i);
            }
            else if (arr[i]>=arr[s.peek()]){
                while (s.isEmpty()==false && arr[i]>=arr[s.peek()]){
                    s.pop();
                }
                if (s.isEmpty()){
                    System.out.print("-1 ");
                }
                else {
                    System.out.print(arr[s.peek()]+" ");
                }
                s.push(i);
            }
            else {
                System.out.print(arr[s.peek()]+" ");
                s.push(i);
            }
        }
    }
    public static void main(String arg[]){
        int arr[] = {15, 10, 18, 12, 4, 6, 2, 8};
        printPrevGreater(arr);
    }
}
