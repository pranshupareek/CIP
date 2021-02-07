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

    static boolean haveGivenSum(int arr[], int sum){
        int n = arr.length;
        int curSum = 0;
        int r = 0;
        while (sum>curSum){
            curSum+=arr[r];
            r++;
        }
        int l = 0;
        while (true){
            if (curSum==sum){
                return true;
            }
            else if (sum<curSum&&l<n){
                curSum-=arr[l];
                l++;
            }
            else if (sum>curSum&&r<n){
                curSum+=arr[r];
                r++;
            }
            else {
                break;
            }
        }

        return false;
    }

    public static void main(String arg[]){
        int arr[] = {1,8,30,-5,20,7};
        int k = 3;
        System.out.println(maxSumOfKElements(arr,k));

        int arr2[] = {1,4,20,3,10,5};
        int sum = 18;
        System.out.println(haveGivenSum(arr2,sum));

    }
}
