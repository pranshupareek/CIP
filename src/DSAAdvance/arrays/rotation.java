package DSAAdvance.arrays;

import java.util.Arrays;

public class rotation {
    static void rotateArray(int arr[], int d){
        int trans[] = new int[d];
        for (int i = 0; i<d; i++){
            trans[i] = arr[i];
        }
        for (int i = d; i< arr.length; i++){
            arr[i-d] = arr[i];
        }
        for (int i = 0; i<d; i++){
            arr[i+arr.length-d] = trans[i];
        }
    }

    public static void main(String arg[]){
        int arr[] = {1,2,3,4,5};
        rotateArray(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}
