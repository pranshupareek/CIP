package DSAAdvance.searching;

import java.util.Arrays;

public class countOfOccurrence {
    static int countOcc(int arr[], int ele){
        int n = arr.length;
        int bs = Arrays.binarySearch(arr,0,n,ele);
        n = bs;
        while (bs>=0){
            n = bs;
            bs = Arrays.binarySearch(arr,0,n,ele);
        }
        int fo;
        if (n>=0){
            fo = n;
        }
        else {
            return 0;
        }

        bs = Arrays.binarySearch(arr, fo+1, arr.length, ele);
        n = bs;
        while (bs>=0){
            n = bs;
            bs = Arrays.binarySearch(arr,n+1, arr.length, ele);
        }
        if (n<0){
            return 1;
        }

        return n-fo+1;
    }

    public static void main(String arg[]){
        int arr[] = {0,0,0,0,1,1,1,1,1,1,2,2,2,2,3,5,5,5};
        System.out.println(countOcc(arr,5));
    }
}
