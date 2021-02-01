package DSAAdvance.mathematics;

public class iterativePower {
    static int power(int x, int n){
        int res = 1;
        while (n>0){
            if (n % 2 != 0) {
                res*=x;
            }
            x*=x;
            n/=2;
        }
        return res;
    }
    public static void main(String arg[]){
        System.out.println(power(15,7));
    }
}
