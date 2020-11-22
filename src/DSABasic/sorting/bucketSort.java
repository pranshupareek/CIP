package DSABasic.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {
    public static void bucketS(int[] arr, int k){
        int n = arr.length;
        int mx = arr[0];
        for (int i=1; i<n; i++){
            if (mx<arr[i])
                mx = arr[i];
        }
        mx++;
        ArrayList<ArrayList<Integer>> bkt = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i<k; i++)
            bkt.add(new ArrayList<Integer>());
        for (int i = 0; i<n; i++){
            int bi = (k * arr[i]/mx);
            bkt.get(bi).add(arr[i]);
        }
        for (int i=0; i<k; i++){
            Collections.sort(bkt.get(i));
        }
        int index = 0;
        for (int i=0; i<k; i++){
            for (int j=0; j<bkt.get(i).size(); j++){
                arr[index++] = bkt.get(i).get(j);
            }
        }
    }

    public static void main(String arg[]){
        int[] arr = {30,40,10,80,5,12,70};
        int k = 4;
        bucketS(arr,k);
        countingSort.printArray(arr,arr.length);
    }
}