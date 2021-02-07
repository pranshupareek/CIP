package DSAAdvance.arrays;

public class prefixSumTechnique {
    int a[];
    int n;
    prefixSumTechnique(int arr[]){
        n = arr.length;
        a = new int[n];
        int prefixSum = 0;
        for (int i = 0; i<n; i++){
            prefixSum+=arr[i];
            a[i]=prefixSum;
        }
    }
    int sumOfRange(int lb, int ub){
        if (lb>ub||ub>n-1){
            return Integer.MIN_VALUE;
        }
        if (lb==0){
            return a[ub];
        }
        return a[ub]-a[lb-1];
    }
    boolean checkEquilibrium(){
        if ((a[0]==a[n-1])||(n>1 && a[n-2] == 0)){
            return true;
        }
        for (int i = 1; i<n-1; i++){
            if (a[i]+a[i-1] == a[n-1]){
                return true;
            }
        }
        return false;
    }
}

class main{
    public static void main(String arg[]){
//        int arr[] = {3,4,8,-9,8,6};
        int arr[] = {4,2,-2};
        prefixSumTechnique ps = new prefixSumTechnique(arr);
        System.out.println(ps.sumOfRange(2,5));
        System.out.println(ps.sumOfRange(3,2));
        System.out.println(ps.sumOfRange(5,6));
        System.out.println(ps.sumOfRange(4,8));
        System.out.println(ps.sumOfRange(1,3));
        System.out.println(ps.checkEquilibrium());
    }
}
