package DSAAdvance.arrays;

public class maxLengthEvenOddSubarray {
    static int maxEOS(int arr[]){
        int n = arr.length;
        int res = 1, cur = 1;

        for (int i = 1; i<n; i++){
            if ((arr[i]&1)!=(arr[i-1]&1)){
                cur++;
            }
            else {
                res = Math.max(cur,res);
                cur = 1;
            }
        }
        return Math.max(cur,res);
    }
    public static void main(String arg[]){
        int arr[] = {10,12,10,14};
        System.out.println(maxEOS(arr));
    }
}
