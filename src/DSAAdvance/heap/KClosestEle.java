package DSAAdvance.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair{
    Integer key;
    Integer value;

    Pair(int a, int b){
        key = a;
        value = b;
    }
    public Integer getKey() 
    { 
        return key; 
    } 
    public void setKey(Integer key) 
    { 
        this.key = key; 
    } 
    public Integer getValue() 
    { 
        return value; 
    } 
    public void setValue(Integer value) 
    { 
        this.value = value; 
    } 


}

public class KClosestEle {
    static ArrayList<Integer> printKClosest(int arr[], int n, int k, int x){
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                return p2.getValue().compareTo(p1.getValue());
            }
        });

        for (int i = 0; i<k; i++){
            pq.offer(new Pair(arr[i], Math.abs(arr[i] - x)));
        }

        for (int i = k; i<n; i++){
            int diff = Math.abs(arr[i] - x);
            if (pq.peek().getValue()>diff){
                pq.poll();
                pq.offer(new Pair(arr[i], diff));
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        while (!pq.isEmpty()){
            al.add(pq.poll().getKey());
        }
        return al;
    }

    public static void main(String[] args) {
        int arr[] = {10, 30, 5, 40, 38, 80, 70};

        int size = arr.length;
        int x = 35;
        int k = 3;
        System.out.println(printKClosest(arr, size, k, x));
    }
}
