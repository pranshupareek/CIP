package Libraries.priorityqueue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class MyCmp implements Comparator<Map.Entry<Integer, Integer>>{
    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2){
        if (m1.getValue() == m2.getValue()){
            return m1.getKey() - m2.getKey();
        }
        else {
            return m2.getValue() - m1.getValue();
        }
    }
}

public class KMostFrequentElement {
    static void KTopFreq(int[] arr, int k){
        Map<Integer, Integer> m = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new MyCmp());

        for (Map.Entry<Integer, Integer> x: m.entrySet()){
            pq.add(x);
        }

        for (int i = 0; i<k; i++){
            System.out.println(pq.poll().getKey());
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 20, 30};
        int k = 2;

        KTopFreq(arr,k);
    }
}
