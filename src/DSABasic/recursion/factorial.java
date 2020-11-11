package DSABasic.recursion;
import java.util.Scanner;

public class factorial {

    public static int factorialOf(int n){
        if (n == 0)
            return 1;
        int i = 1;
        return factorialOf(n-1,n*i);
    }
    public static int factorialOf(int n, int i){
        if (n == 0)
            return i;
        return factorialOf(n-1, n*i);
    }


    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(factorialOf(n));
    }
}
