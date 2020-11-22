package DSABasic.sorting;

public class radixSort {

    public static void cSort(int arr[], int l, int u, int exp){
        int k = u-l+1;
        int counter[]= new int[k];
        for (int i=0; i<k; i++){
            counter[i] = 0;
        }
        for (int i=0; i< arr.length; i++){
            counter[(arr[i]-l)/exp%10]++;
        }
        for (int i = 1; i<k; i++){
            counter[i]= counter[i-1] + counter[i];
        }
        int[] output = new int[arr.length];
        for (int i = arr.length-1; i>=0; i--){
            output[counter[(arr[i]-l)/exp%10] - 1] = arr[i];
            counter[(arr[i]-l)/exp%10]--;
        }
        for (int i=0; i< arr.length; i++){
            arr[i] = output[i];
        }
    }


    public static void radixS(int[] arr){
        int n = arr.length;
        int mx = arr[0];
        for (int i = 1; i<n; i++){
            if (mx<arr[i]){
                mx = arr[i];
            }
        }
        for (int exp=1; mx/exp>0; exp*=10){
            cSort(arr,0,9,exp);
        }
    }

    public static void main(String arg[]){
        int[] arr = {319,212,6,8,100,50};
        radixS(arr);
        countingSort.printArray(arr, arr.length);
    }
}
