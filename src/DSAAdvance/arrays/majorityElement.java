package DSAAdvance.arrays;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    static int majorityNoExtraSpace(int arr[]){
        int res = 0, count = 1, n = arr.length;
        for (int i = 1; i<n; i++){
            if (arr[res] == arr[i]){
                count++;
            }
            else {
                count--;
            }
            if (count==0){
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i<n; i++){
            if (arr[res] == arr[i]){
                count++;
            }
        }
        if (count>n/2){
            return res;
        }
        return -1;
    }
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
        System.out.println(majorityNoExtraSpace(arr));
    }
}
