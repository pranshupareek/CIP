package DSAAdvance.mathematics;

import java.util.Arrays;

public class sieveOfEratosthenes {
    static void printPrime(int n){
        if (n<=1){
            return;
        }

        boolean isPrime[] = new boolean[n+1];

        Arrays.fill(isPrime, true);

        for (int i = 2; i <= n; i++){
            if (isPrime[i]){
                System.out.print(i+" ");
                for (int j = i*i; j<=n; j = j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }
    public static void main(String arg[]){
        int n = 100;
        printPrime(n);
    }
}
