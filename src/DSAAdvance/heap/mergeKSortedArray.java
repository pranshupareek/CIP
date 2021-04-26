package DSAAdvance.heap;

import java.util.*;

public class mergeKSortedArray {
    static ArrayList<Integer> getSorted(ArrayList<ArrayList<Integer>> al){
        int k = al.size();
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                return p1.getKey()-p2.getKey();
            }
        });
        for (int i = 0; i<k; i++){
            pq.offer(new Pair(al.get(i).get(0),i));
        }
        ArrayList<Integer> res = new ArrayList<>();
        int indexTrack[] = new int[k];
        int size[] = new int[k];
        for (int i = 0; i<k; i++){
            size[i] = al.get(i).size();
        }
        while (!pq.isEmpty()){
            Pair poll = pq.poll();
            int index = poll.getValue();
            res.add(poll.getKey());
            indexTrack[index]++;
            if (indexTrack[index]<size[index]){
                pq.offer(new Pair(al.get(index).get(indexTrack[index]),index));
            }
        }

        return res;

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > arr=new ArrayList<ArrayList<Integer>>();
	
        ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(10); 
        a1.add(20);
        a1.add(30);
        arr.add(a1); 

        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(5);
        a2.add(15);
        arr.add(a2); 

        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(1); 
        a3.add(9); 
        a3.add(11);
        a3.add(18);
        arr.add(a3);

        System.out.println(getSorted(arr));
    }
}
