package DSAAdvance.dp;

public class coinChangeCountCombinations {
    static void count(int arr[], int i, int curSum, int reqSum, int res[]){
        int n = arr.length;
        
        if (reqSum<curSum){
            return;
        }
        
        if (reqSum == curSum){
            res[0]++;
            return;
        }

        for (;i<n; i++){
            count(arr, i, curSum+arr[i], reqSum, res);
        }
    }

    public static void main(String[] args) {
        int coins[] = {1,2,3};
        int res[] = new int[1];
        count(coins, 0, 0, 4, res);
        System.out.println(res[0]);
        int coins2[] = {2,5,3,6};
        res[0] = 0;
        count(coins2, 0, 0, 10, res);
        System.out.println(res[0]);
    }
}
