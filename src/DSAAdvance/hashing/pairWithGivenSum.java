package DSAAdvance.hashing;

import java.util.HashSet;
import java.util.Set;

public class pairWithGivenSum {
    static boolean checkPairWithSum(int arr[], int s){
        int n = arr.length;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i<n; i++){
            if (hs.contains(s-arr[i])){
                return true;
            }
            hs.add(arr[i]);
        }
        return false;
    }
    public static void main(String arg[]){
        int arr[] = {3,2,8,15,-8};
        System.out.println(checkPairWithSum(arr,17));
    }
}
