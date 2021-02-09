package DSAAdvance.searching;

import java.util.Arrays;

public class count1sInSortedBinaryArray {
    static int indexOfFO(int arr[], int ele){
        int n = arr.length;
        int bs = Arrays.binarySearch(arr,0,n,ele);
        n = bs;
        while (bs>=0){
            n = bs;
            bs = Arrays.binarySearch(arr,0,n,ele);
        }
        if (n>=0){
            return n;
        }
        return -1;
    }
    static int count1(int arr[]){
        int n = indexOfFO(arr,1);
        if (n<0){
            return n;
        }
        return arr.length-n;
    }

    public static void main(String arg[]){
        int arr[] = {0,0,0,1,1,1,1};
        System.out.println(count1(arr));
    }
}
