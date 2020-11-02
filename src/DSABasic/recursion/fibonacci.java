package DSABasic.recursion;
import java.util.Scanner;

public class fibonacci {

    public static int fibonacci(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(fibonacci(n));

    }

}
