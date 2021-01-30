package Libraries.treemap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class countGreaterElement {
    public static void printGreater(int arr[]){
        int n = arr.length;
        TreeMap <Integer, Integer> tm = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i<n; i++){
            tm.put(arr[i], tm.getOrDefault(arr[i], 0) + 1);
        }

        int cumFreq = 0;
        for (Map.Entry<Integer, Integer> e : tm.entrySet()) {
            Integer temp = e.getValue();
            tm.put(e.getKey(), cumFreq);
            cumFreq += temp;
        }

        for (int i = 0; i < n; i++){
            System.out.print(tm.get(arr[i])+ " ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = { 2, 8, 10, 5, 8 };
        printGreater(arr);
    }
}
