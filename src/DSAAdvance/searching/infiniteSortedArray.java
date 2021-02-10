package DSAAdvance.searching;

public class infiniteSortedArray {
    static int searchInf(int arr[], int ele){
        int l=0, r = ele;
        while (arr[r]<ele){
            l = r;
            r = r*r;
        }
        while (l<=r){
            int mid = (l+r)/2;
            if (arr[mid] == ele){
                return mid;
            }
            if (arr[mid]>ele){
                r = mid-1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String arg[]){
        int arr[] = new int[10000];
        for (int i = 0; i<10000; i++){
            arr[i] = i*5;
        }
        System.out.println(searchInf(arr,5006));
    }
}
