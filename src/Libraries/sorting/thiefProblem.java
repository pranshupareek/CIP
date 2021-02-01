package Libraries.sorting;

import java.util.Arrays;

public class thiefProblem {
    static int maxValue(int arr[], int k){
        Arrays.sort(arr);
        int res = 0;
        for (int i = arr.length-1; i>=arr.length-k; i--){
            res += arr[i];
        }
        return res;
    }

    public static void main(String arg[]){
        int arr[] = {3,7,2,5,12,30};
        int k = 3;
        System.out.println(maxValue(arr, k));
    }
}
