package DSAAdvance.searching;

public class repeatingElement {
    static int getRepeating(int arr[]){
        int n = arr.length;
        int max = arr[0];
        int curSum = arr[0];
        for (int i = 1; i<n; i++){
            curSum += arr[i];
            max = Math.max(max,arr[i]);
        }
        int expectedSum = max*(max+1)/2;
        return (curSum-expectedSum)/(n-max-1);

    }
    public static void main(String arg[]){
        int arr[] = {0,2,1,3,5,4,6,2};
        System.out.println(getRepeating(arr));
    }
}
