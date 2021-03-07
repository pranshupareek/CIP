package DSAAdvance.hashing;

import java.util.HashMap;
import java.util.Map;

public class moreThanNByKOccurrences {
    static void printElement(int arr[],int k){
        int n = arr.length;
        int reqO = n/k;
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i<n; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
            if (hm.get(arr[i])==reqO+1){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {30,10,20,20,10,20,30,30};
        printElement(arr,4);
        printElement(new int[]{30,10,20,30,30,40,30,40,30},2);

    }
}
