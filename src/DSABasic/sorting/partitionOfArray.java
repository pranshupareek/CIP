package DSABasic.sorting;

public class partitionOfArray {

    public static void partition(int[] arr, int pos){
        int l = 0;
        int r = arr.length-1;
        int pivot = pos;
        while (l<r){
            if (r != pivot){
                if ( arr[pivot] <= arr[r] ){
                    r--;
                } else {
                    int temp = arr[pivot];
                    arr[pivot] = arr[r];
                    arr[r] = temp;
                    pivot = r;
                }
            } else {
                if ( arr[pivot] >= arr[l]){
                    l++;
                } else {
                    int temp = arr[pivot];
                    arr[pivot] = arr[l];
                    arr[l] = temp;
                    pivot = l;
                }
            }
        }

    }

    public static void main(String arg[]){

        int arr[] = {3,8,6,12,10,7};
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        partition(arr, 2);
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
