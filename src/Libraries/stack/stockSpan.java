package Libraries.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class stockSpan {
    static void printStockSpan(int arr[]){
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = 0; i< arr.length; i++){
            if (s.isEmpty()){
                System.out.print(i+1+" ");
                s.push(i);
            }
            else if (arr[i]>=arr[s.peek()]){
                while (s.isEmpty()==false && arr[i]>=arr[s.peek()]){
                    s.pop();
                }
                if (s.isEmpty()){
                    System.out.print(i+1+" ");
                }
                else {
                    System.out.print(i-s.peek()+" ");
                }
                s.push(i);
            }
            else {
                System.out.print(1+" ");
                s.push(i);
            }
        }
    }
    public static void main(String arg[]){
        int arr[] = {30, 20, 25, 28, 27, 29};
        printStockSpan(arr);
    }
}
