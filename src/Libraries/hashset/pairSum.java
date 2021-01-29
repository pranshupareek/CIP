package Libraries.hashset;

import java.util.HashSet;

public class pairSum {
    static void checkPairSum(int arr[], int sum){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i< arr.length; i++){
            if (hs.contains(sum-arr[i])){
                System.out.println("True");
                return;
            }
            else {
                hs.add(arr[i]);
            }
        }
        System.out.println("False");
    }
    public static void main(String arg[]){
        int arr[] = {1,2,3,4,5,6};
        checkPairSum(arr,11);
    }
}
