package DSAAdvance.searching;

public class findAPeak {
    static int getPeak(int arr[]){
        int l = 0;
        int r = arr.length-1;
        if (r==0){
            return arr[r];
        }
        if (arr[l]>arr[l+1]){
            return arr[l];
        }
        if (arr[r]>arr[r-1]){
            return arr[r];
        }
        while (l<=r){
            int mid = (l+r)/2;
            if (arr[mid]>=arr[mid+1]&&arr[mid]>= arr[mid-1]){
                return arr[mid];
            }
            else if (arr[mid]>=arr[mid+1]){
                r = mid-1;
            }
            else {
                l = mid+1;
            }
        }
        return -1;
    }

    public static void main(String arg[]){
        int arr[] = {1,2,5,42,6,2};
        System.out.println(getPeak(arr));
    }
}
