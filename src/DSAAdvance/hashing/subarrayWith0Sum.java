package DSAAdvance.hashing;

import java.util.HashSet;

public class subarrayWith0Sum {
    static boolean checkSubarray(int arr[]){
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        hs.add(0);
        if (hs.contains(arr[0])){
            return true;
        }
        for (int i = 1; i<n; i++){
            arr[i] += arr[i-1];
            if (hs.contains(arr[i]))
                return true;
            hs.add(arr[i]);
        }
        return false;
    }
    public static void main(String arg[]){
        int arr[] = {1, 4, 13, -3, -10, 5};
        int arr2[] = {3,1,-2,5,1};
        System.out.println(checkSubarray(arr));
    }
}
