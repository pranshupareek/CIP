package DSABasic.sorting;

import java.util.Scanner;

public class selectionSort {

    public static void selectionS(int arr[]){
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            int min = i;
            for (int j = i+1; j<n; j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        selectionS(arr);

        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
