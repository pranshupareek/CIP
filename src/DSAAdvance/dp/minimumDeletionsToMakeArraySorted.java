package DSAAdvance.dp;

import java.util.*;

public class minimumDeletionsToMakeArraySorted {
    static int getMinDel(int arr[]){
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[0]);
        for (int i = 1; i<n; i++){
            if (res.get(res.size()-1)<arr[i]){
                res.add(arr[i]);
            }
            else {
                int index = Collections.binarySearch(res, arr[i]);
                if (index<0){
                    index = -index-1;
                    res.set(index, arr[i]);
                }
            }
        }
        return n-res.size(); 
    }

    public static void main(String[] args) {
        int arr[] = {5,10,3,6,7,8};
        System.out.println(getMinDel(arr));
        int arr2[] = {10,20,30};
        System.out.println(getMinDel(arr2));
        int arr3[] = {30,20,10};
        System.out.println(getMinDel(arr3));
    }
}
