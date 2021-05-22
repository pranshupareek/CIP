package DSAAdvance.dp;

public class eggDrop {
    static int eggDropp(int n, int k){
        if (k==1||k==0){
            return k;
        }

        if (n==1){
            return k;
        }

        int min = Integer.MAX_VALUE;
        int x,res;

        for (x = 1; x<=k; x++){
            res = Math.max(eggDropp(n-1,x-1), eggDropp(n, k-x));
            if (res<min){
                min = res;
            }
        }
        return min+1;
    }

    public static void main(String[] args) {
        int n = 2, k = 10;
        System.out.println(eggDropp(n, k));
    }
}
