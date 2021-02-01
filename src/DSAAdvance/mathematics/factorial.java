package DSAAdvance.mathematics;

public class factorial {
    static int factorialR(int x){
        if (x == 0){
            return 1;
        }
        return x*factorialR(x-1);
    }

    static int factorialI(int x){
        int res = 1;
        for (int i = 2; i<=x; i++){
            res*=i;
        }
        return res;
    }

    public static void main(String arg[]){
        int x = 4;
        System.out.println(factorialR(x));
        System.out.println(factorialI(x));
    }
}
