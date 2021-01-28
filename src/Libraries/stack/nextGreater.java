package Libraries.stack;

import java.util.*;

public class nextGreater {
    static void printNextGreater(int arr[]){
        Collections.reverse(Arrays.asList(arr));
        List l = Arrays.asList(arr);
        int res[] = new int[arr.length];
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = arr.length-1; i>=0; i--){
            if (s.isEmpty()){
                res[i] = -1;
                s.push(i);
            }
            else if (arr[i]>=arr[s.peek()]){
                while (s.isEmpty()==false && arr[i]>=arr[s.peek()]){
                    s.pop();
                }
                if (s.isEmpty()){
                    res[i] = -1;
                }
                else {
                    res[i] = arr[s.peek()];
                }
                s.push(i);
            }
            else {
                res[i] = arr[s.peek()];
                s.push(i);
            }
        }
        for (int x: res){
            System.out.print(x+" ");
        }
    }
    public static void main(String arg[]){
        int arr[] = {15, 10, 18, 12, 4, 6, 2, 8};
        printNextGreater(arr);
    }
}
