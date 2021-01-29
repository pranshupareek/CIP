package Libraries.hashset;

import java.util.HashSet;

public class repeatingElement {
    static void printRepeating(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i< arr.length; i++){
            if (hs.contains(arr[i])){
                System.out.print(arr[i]+" ");
            }
            else {
                hs.add(arr[i]);
            }
        }
    }

    public static void main(String arg[]){
        int arr[] = {10,20, 30, 20, 10};
        printRepeating(arr);
    }
}
