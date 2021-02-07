package DSAAdvance.arrays;

public class windowSlidingTechnique {
    static int maxSumOfKElements(int arr[], int k){
        int n = arr.length;
        int curSum = 0;
        for (int i = 0; i<k; i++){
            curSum+=arr[i];
        }
        int max = curSum;
        for (int i = k; i<n; i++){
            curSum+=arr[i]-arr[i-k];
            max = Math.max(max,curSum);
        }
        return max;
    }
    public static void main(String arg[]){
        int arr[] = {1,8,30,-5,20,7};
        int k = 3;
        System.out.println(maxSumOfKElements(arr,k));
    }
}
