package DSABasic.searching;

public class binary {
    static int binarySearch(int[] arr, int ele){
        int l = 0;
        int r = arr.length-1;

        if (l>r){
            return -1;
        }
        int mid = (l+r)/2;
        if (ele==arr[mid]){
            return mid;
        }
        else if (ele<arr[mid]){
            return binarySearch(arr, ele, l, mid-1);
        }
        else {
            return binarySearch(arr, ele, mid+1, r);
        }
    }
    static int binarySearch(int[] arr, int ele, int l, int r){

        if (l>r){
            return -1;
        }
        int mid = (l+r)/2;
        if (ele==arr[mid]){
            return mid;
        }
        else if (ele<arr[mid]){
            return binarySearch(arr, ele, l, mid-1);
        }
        else {
            return binarySearch(arr, ele, mid+1, r);
        }
    }

    public static void main(String arg[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(binarySearch(arr,5));
    }
}
