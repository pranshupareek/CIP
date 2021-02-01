package DSAAdvance.mathematics;

public class countTrailingZeroInFactorial {
    static int countZeros(int x){
        if (x % 5 != 0 || x == 0){
            return 0;
        }

        return x/5 + countZeros(x/5);
    }

    public static void main(String arg[]){
        int n = 100;
        System.out.println(countZeros(n));
    }
}
