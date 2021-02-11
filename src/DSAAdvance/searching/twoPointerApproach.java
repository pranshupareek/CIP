package DSAAdvance.searching;

public class twoPointerApproach {
    static boolean checkPairSum(int arr[], int sum){
        int l = 0;
        int r = arr.length-1;
        while (l<r){
            if (arr[l]+arr[r] == sum){
                return true;
            }
            else if (arr[l]+arr[r] < sum){
                l++;
            }
            else {
                r--;
            }
        }
        return false;
    }
    public static void main(String arg[]){
        int arr[] = {2,5,8,12,30};
        System.out.println(checkPairSum(arr,8));
    }
}
