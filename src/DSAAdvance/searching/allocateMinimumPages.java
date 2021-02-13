package DSAAdvance.searching;

public class allocateMinimumPages {
    static int getMinPage(int arr[], int k){
        int n = arr.length;
        int sumArr = 0;
        int maxPage = 0;
        for (int i = 0; i<n; i++){
            sumArr+=arr[i];
            maxPage = Math.max(maxPage,arr[i]);
        }
        int l = maxPage;
        int r = sumArr;
        int res = 0;
        while (l<=r){
            if (l==r){
                return l;
            }
            int mid = (l+r)/2;
            int tempSum = 0;
            int kTemp = 1;
            for (int i = 0; i<n; i++){
                tempSum+=arr[i];
                if (tempSum>mid){
                    kTemp++;
                    tempSum = arr[i];
                }
                if (kTemp>k){
                    break;
                }
            }
            if (kTemp>k){
                l = mid+1;
            }
            else {
                r = mid-1;
                res = mid;
            }
        }
        return res;
    }
    public static void main(String arg[]){
        int arr[] = {10,20,10,30};
        System.out.println(getMinPage(arr,2));
    }
}
