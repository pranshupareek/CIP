package DSAAdvance.hashing;

import java.util.HashSet;
import java.util.Set;

public class subarrayWithGivenSum {
    static boolean checkSubarray(int arr[], int s){
        int n = arr.length;
        Set<Integer> hs = new HashSet<>();
        hs.add(s);
        if (hs.contains(arr[0])){
            return true;
        }
        hs.add(arr[0]);
        int ps = arr[0]+s;
        for (int i = 1; i<n; i++){
            ps+=arr[i];
            if (hs.contains(ps-s)){
                return true;
            }
            hs.add(ps);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {5,8,6,13,3,-1};
        System.out.println(checkSubarray(arr,5));
    }
}
