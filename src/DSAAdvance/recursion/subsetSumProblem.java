package DSAAdvance.recursion;

public class subsetSumProblem {
    static int subsetSum(int arr[], int reqSum){
        int n = arr.length;
        return subsetSum(arr,n, reqSum, 0);
    }

    static int subsetSum(int arr[],int n, int reqSum, int curSum){
        if (reqSum==curSum){
            return 1;
        }
        if (n==0){
            return 0;
        }
        int res = subsetSum(arr,n-1, reqSum, curSum) + subsetSum(arr,n-1, reqSum, curSum+arr[n-1]);
        return res;
    }
    public static void main(String arg[]){
        int arr[] = {1,2,3,4,5,6};
        System.out.println(subsetSum(arr,1));
    }
}
