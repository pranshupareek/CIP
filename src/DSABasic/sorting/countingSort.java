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
        int j = 0;
        for (int i=0; i<k; i++){
            while (counter[i]>0){
                arr[j] = i;
                j++;
                counter[i]--;
            }
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
