package DSAAdvance.dp;


public class maximumLengthOfBitonicSS {
    static int getMaxLengthOfBSS(int arr[]){
        int n = arr.length;
        int lis[] = new int[n];
        int lds[] = new int[n];
        lis[0] = 1;
        lds[n-1] = 1;
        for(int i = 1; i<n; i++){
            lis[i] = 1;
            lds[n-i-1] = 1;
            for (int j = 0; j<i; j++){
                if (arr[i]>arr[j]){
                    lis[i] = Math.max(lis[i],lis[j]+1);
                }
                if (arr[n-i-1]>arr[n-j-1]){
                    lds[n-i-1] = Math.max(lds[n-i-1], lds[n-j-1]+1);
                }
            }
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            res = Math.max(res, lis[i]+lds[i]-1);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,11,2,10,4,5,2,1};
        int arr2[] = {12,11,40,5,3,1};
        int arr3[] = {30,20,10};
        System.out.println(getMaxLengthOfBSS(arr));
        System.out.println(getMaxLengthOfBSS(arr2));
        System.out.println(getMaxLengthOfBSS(arr3));
    }
}
