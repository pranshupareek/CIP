package Libraries.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class freqInArray {
    static void printFreq(int arr[]){
        Map<Integer, Integer> hm = new LinkedHashMap<>();
        for (int x: arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for (Map.Entry<Integer, Integer> x : hm.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
    public static void main(String arg[]){
        int arr[] = {10,15,20,10,20,15};
        printFreq(arr);
    }
}
