package DSAAdvance.searching;

import java.util.Arrays;

public class indexOfLastOccurrence {
    static int indexOfLO(int arr[], int ele){
        int bs = Arrays.binarySearch(arr, 0, arr.length, ele);
        int n = bs;
        while (bs>=0){
            n = bs;
            bs = Arrays.binarySearch(arr,n+1, arr.length, ele);
        }
        if (n<0){
            return -1;
        }
        return n;
    }
    public static void main(String arg[]){
        int arr[] = {0,0,0,1,1,1,1,1,2,2};
        System.out.println(indexOfLO(arr,1));
    }
}
