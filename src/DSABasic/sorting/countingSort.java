package DSABasic.sorting;

import java.util.Scanner;

public class countingSort {

    public static void cSort(int arr[], int k){
        int counter[]= new int[k];
        for (int i=0; i<k; i++){
            counter[i] = 0;
        }
        for (int i=0; i< arr.length; i++){
            counter[arr[i]]++;
        }
        for (int i = 1; i<k; i++){
            counter[i]= counter[i-1] + counter[i];
        }
        int[] output = new int[arr.length];
        for (int i = arr.length-1; i>=0; i--){
            output[counter[arr[i]] - 1] = arr[i];
            counter[arr[i]]--;
        }
        for (int i=0; i< arr.length; i++){
            arr[i] = output[i];
        }
    }

    static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }

    public static void main(String arg[]){
        int[] arr = {1, 4, 4, 1, 0, 1};
        int k = 5;
        cSort(arr,k);
        printArray(arr, arr.length);
    }

}
