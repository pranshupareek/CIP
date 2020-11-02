package DSABasic.recursion;
import java.util.Scanner;

public class factorial {

    public static int factorialOf(int n){
        if (n == 0)
            return 1;
        return n * factorialOf(n-1);
    }

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(factorialOf(n));
    }
}
