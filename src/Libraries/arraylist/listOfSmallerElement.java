package Libraries.arraylist;

import java.util.ArrayList;
import java.util.List;

public class listOfSmallerElement {
    static List<Integer> getSmaller(int arr[], int k){
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i<arr.length; i++){
            if (arr[i]<k){
                al.add(arr[i]);
            }
        }
        return al;
    }

    public static void main(String arg[]){
        int arr[] = new int[]{10, 40, 80, 30, 20, 15};
        List<Integer> al = getSmaller(arr, 30);
        for (Integer x : al){
            System.out.print(x+" ");
        }
    }
}