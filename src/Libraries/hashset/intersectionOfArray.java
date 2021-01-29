package Libraries.hashset;

import java.util.HashSet;

public class intersectionOfArray {
    static void intersectionOfArray(int s1[], int s2[]){
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for (int x: s1){
            h1.add(x);
        }
        for (int x: s2){
            h2.add(x);
        }
        h1.retainAll(h2);
        for (int x: h1){
            System.out.print(x+" ");
        }
    }
    public static void main(String arg[]){
        int arr1[] = {7, 2, 9, 15, 10};
        int arr2[] = {5, 10, 7, 3, 2, 20, 9};
        intersectionOfArray(arr1,arr2);
    }
}
