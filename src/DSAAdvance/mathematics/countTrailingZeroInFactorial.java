package DSAAdvance.mathematics;

public class countTrailingZeroInFactorial {
    static int countZeros(int x){
        int res = 0;
        for (int i = 5; i<=x; i*=5){
            res+=x/i;
        }
        return res;
    }

    public static void main(String arg[]){
        int n = 100;
        System.out.println(countZeros(n));
    }
}
