package DSABasic.sorting;

import java.util.Scanner;

public class bubbleSort {

    public static void bubble(int arr[]){
        for (int i = 0; i< arr.length - 1; i++){
            boolean swapped = false;
            for (int j = 0; j< arr.length - i - 1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        bubble(arr);

        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}