package DSAAdvance.hashing;

import java.util.HashMap;
import java.util.Map;

public class longestSubarrayWithEqual01 {
    static int checkLongestSA(int arr[]){
        int n = arr.length;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int ps = 0;
        int ans = 0;
        for (int i = 0; i<n; i++){
            if (arr[i]==0){
                arr[i] = ps-1;
            }
            else {
                arr[i] += ps;
            }
            ps = arr[i];
            if (hm.containsKey(ps)){
                ans = Math.max(ans,i-hm.get(ps));
            }
            else {
                hm.put(ps,i);
            }
        }
        return ans;
    }
    public static void main(String arg[]){
        int arr[] = {1,0,1,1,1,0,0};
        System.out.println(checkLongestSA(arr));
        int arr1[] = {1,1,1,1};
        System.out.println(checkLongestSA(arr1));
        int arr2[] = {0,0,1,1,1,1,1,0};
        System.out.println(checkLongestSA(arr2));
    }
}
