package DSAAdvance.searching;

public class searchInSortedRotatedArray {
    static int search(int arr[], int ele){
        int l = 0;
        int r = arr.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if (arr[mid] == ele){
                return mid;
            }
            if (arr[l]<arr[mid]){
                if (arr[mid]>ele&&arr[l]<=ele)
                    r = mid-1;
                else {
                    l = mid+1;
                }
            }
            else {
                if (arr[mid]<ele&&arr[r]>=ele){
                    l = mid+1;
                }
                else {
                    r = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int arr[] = {15,16,17,20,1,5,7};
        System.out.println(search(arr,18));
    }
}
