package DSAAdvance.hashing;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSubsequence {
    static int getLongestSubsequence(int arr[]){
        int n = arr.length;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i<n; i++){
            hs.add(arr[i]);
        }
        int res = 0;
        int curr;
        for (int i = 0; i<n; i++){
            if (!hs.contains(arr[i]-1)){
                curr = 1;
                while (hs.contains(arr[i]+curr)){
                    curr++;
                }
                res = Math.max(res,curr);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3,8,4,5,7};
        System.out.println(getLongestSubsequence(arr));
    }
}
