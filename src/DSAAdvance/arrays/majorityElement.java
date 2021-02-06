package DSAAdvance.arrays;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    static int majority(int arr[]){
        int n = arr.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i<n; i++){
            int val = hm.getOrDefault(arr[i], 0)+1;
            if (val>n/2){
                return i;
            }
            hm.put(arr[i], val);
        }
        return -1;
    }
    public static void main(String arg[]){
        int arr[] = {20,30,40,50,50,50,50};
        System.out.println(majority(arr));
    }
}
