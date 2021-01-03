package DSABasic.hashing;

import java.util.HashSet;

public class countDistinct {
    static int count(int[] arr){
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i<arr.length; i++){
            h.add(arr[i]);
        }
        return h.size();
    }

    public static void main(String args[]){
//        int[] arr = {15, 12, 13, 12, 13, 13, 18};
//        int[] arr = {10, 10, 10};
        int[] arr = {10, 11, 12};
        System.out.println(count(arr));
    }
}
