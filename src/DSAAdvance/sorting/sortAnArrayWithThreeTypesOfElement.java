package DSAAdvance.sorting;

import java.util.Arrays;

public class sortAnArrayWithThreeTypesOfElement {
    static void sortArray(int arr[]){
        int n = arr.length;
        int l = 0,mid = 0,h = n-1;
        while (mid<=h){
            if (arr[mid] == 1){
                mid++;
            }
            else if (arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[l];
                arr[l] = temp;
                mid++;
                l++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
    }
    public static void main(String arg[]){
        int arr[] = {0,1,2,0,2,1,2,1,1,1,0,0,0};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
