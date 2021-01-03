package DSABasic.hashing;

import java.util.HashMap;
import java.util.Map;

public class frequency {
    static void printFrequencies(Integer arr[]){
        HashMap<Integer, Integer> h= new HashMap<Integer, Integer>();
        for (int i = 0; i<arr.length; i++){
            if (h.containsKey(arr[i])){
                int temp = h.get(arr[i]);
                h.put(arr[i], temp+1);
            }
            else {
                h.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> tp : h.entrySet())
            System.out.println(tp.getKey()+" "+ tp.getValue());
    }

    public static void main(String arg[]){
        Integer arr[] = {10, 12, 10, 15, 10, 20, 12, 12};
        printFrequencies(arr);
    }
}
