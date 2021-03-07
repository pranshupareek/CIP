package DSAAdvance.hashing;

import java.util.HashMap;
import java.util.Map;

public class countDistinctForEveryWindow {
    static void count(int arr[], int k){
        int res = 0;
        int n = arr.length;
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i<k; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.print(hm.size()+" ");
        for (int i = 1; i<=n-k; i++){
            if (hm.get(arr[i - 1]) == 1) {
                hm.remove(arr[i - 1]);
            }
            else {
                hm.put(arr[i - 1], hm.get(arr[i - 1])-1);
            }
            hm.put(arr[i+k-1], hm.getOrDefault(arr[i+k-1],0)+1);
            System.out.print(hm.size()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10,20,20,10,30,40,10};
        count(arr,4);
        count(new int[]{10,20,30,40},3);
    }
}
