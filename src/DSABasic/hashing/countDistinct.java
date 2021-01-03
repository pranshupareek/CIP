package DSABasic.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class countDistinct {
    static int count(Integer arr[]){
        HashSet<Integer> h = new HashSet<>(Arrays.asList(arr));
        return h.size();
    }

    public static void main(String args[]){
//        int[] arr = {15, 12, 13, 12, 13, 13, 18};
//        int[] arr = {10, 10, 10};
        Integer[] arr = {10, 11, 12};
        System.out.println(count(arr));
    }
}
