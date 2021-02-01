package Libraries.sorting;

import java.util.*;
class MyCmp implements Comparator<Map.Entry<Integer,Integer>>{
    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
        if (m1.getValue() == m2.getValue()) {
            return m1.getKey() - m2.getKey();
        }
        else {
            return m2.getValue() - m1.getValue();
        }
    }
}



public class sortElementByFreq {
    static void printSortByFreq(int arr[]){
        Map<Integer, Integer> hm = new HashMap<>();
        for (int x: arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        Collections.sort(list, new MyCmp());
        int index = 0;
        for(Map.Entry<Integer,Integer> e: list)
        {
            for(int i=0; i<e.getValue(); i++)
            {
                arr[index++] = e.getKey();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main (String[] args) {

        int[] arr={10, 30, 30, 20};

        printSortByFreq(arr);
    }
}
