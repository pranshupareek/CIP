package Libraries.sorting;

import java.util.Arrays;

public class chocolateDistribution {
    static int minDifference(int arr[], int m){
        if (m> arr.length){
            return Integer.MAX_VALUE;
        }
        int res = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i+m-1< arr.length; i++){
            int temp =  arr[i+m-1] - arr[i];
            if (temp<res){
                res = temp;
            }
        }
        return res;
    }
    public static void main(String arg[]){
        int arr[] = {3,4,1,9,56,7,9,12};
        int m = 5;
        System.out.println(minDifference(arr,m));
    }
}
