package DSAAdvance.hashing;


import java.util.HashMap;

public class longestSubarrayWithGivenSum {
    static int checkSubarray(int arr[], int k){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum == k)
                maxLen = i + 1;

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if (map.containsKey(sum - k)) {

                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int a1[] = {5,8,-4,-4,9,-2,2};
        System.out.println(checkSubarray(a1,0));
        int a2[] = {3,1,0,1,8,2,3,6};
        System.out.println(checkSubarray(a2,50));
    }
}
