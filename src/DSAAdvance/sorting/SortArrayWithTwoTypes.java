package DSAAdvance.sorting;

import java.util.Arrays;

public class SortArrayWithTwoTypes {
    static void sortArrayByPositiveNegative(int arr[]){
        int n = arr.length;
        int neg = 0;
        for (int i = 0; i<n; i++){
            if (arr[i]<0){
                int temp = arr[neg];
                arr[neg] = arr[i];
                arr[i] = temp;
                neg++;
            }
        }
    }
    public static void main(String arg[]){
        int arr[] = {15,-3,-2,18};
        sortArrayByPositiveNegative(arr);
        System.out.println(Arrays.toString(arr));
    }
}
