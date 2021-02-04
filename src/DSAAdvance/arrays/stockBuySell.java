package DSAAdvance.arrays;

public class stockBuySell {
    static void profit(int arr[]){
        int profit = 0;
        int n = arr.length;
        for (int i = 1; i<n; i++){
            if (arr[i]>arr[i-1]){
                profit+=(arr[i]-arr[i-1]);
            }
        }
        System.out.println(profit);
    }

    public static void main(String arg[]){
        int arr[] = {5,50,2,3,8,1,4};
        profit(arr);
    }
}
