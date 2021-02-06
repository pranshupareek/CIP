package DSAAdvance.arrays;

public class maxCircularSubarray {
    static int normalMaxSum(int arr[]){
        int n = arr.length, res = arr[0], maxEnding = arr[0];
        for (int i = 1; i<n; i++){
            maxEnding = Math.max(arr[i], maxEnding+ arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
    static int maxCircularSubarray(int arr[]){
        int max_normal = normalMaxSum(arr);
        int n = arr.length;
        if (max_normal<0){
            return max_normal;
        }
        int arr_sum = 0;
        for (int i = 0; i<n; i++){
            arr_sum+=arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + normalMaxSum(arr);
        return Math.max(max_normal, max_circular);
    }
    public static void main(String arg[]){
        int arr[] = {1,2,3,4};
        System.out.println(maxCircularSubarray(arr));
    }
}
