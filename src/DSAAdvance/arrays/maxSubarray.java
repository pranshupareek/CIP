package DSAAdvance.arrays;

public class maxSubarray {
    static int maxSumSubarray(int arr[]){
        int n = arr.length;
        int res = arr[0];
        int ps = arr[0];
        for (int i = 1; i<n; i++){
            if (ps<0){
                ps = arr[i];
            }
            else {
                ps += arr[i];
            }
            res = Math.max(res,ps);
        }
        return res;
    }
    public static void main(String arg[]){
        int arr[] = {-6,-1,-8};
        System.out.println(maxSumSubarray(arr));
    }
}
