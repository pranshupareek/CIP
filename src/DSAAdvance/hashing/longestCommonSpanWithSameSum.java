package DSAAdvance.hashing;

import java.util.HashMap;
import java.util.Map;

public class longestCommonSpanWithSameSum {
    static int checkLongestSA(int arr[],int arr1[]){
        int n = arr.length;
        for (int i = 0; i<n;i++){
            arr[i]-=arr1[i];
        }
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int ps = 0;
        int ans = 0;
        for (int i = 0; i<n; i++){
            ps += arr[i];
            if (hm.containsKey(ps)){
                ans = Math.max(ans,i-hm.get(ps));
            }
            else {
                hm.put(ps,i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = {0,1,0,0,0,0};
        int arr2[] = {1,0,1,0,0,1};
        System.out.println(checkLongestSA(arr1,arr2));
    }
}
