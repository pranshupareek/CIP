package DSAAdvance.mathematics;

public class printPrimeFactor {
    static void printPrimeFactor(int n){
        if (n <= 1) {
            return;
        }
        if (n == 2 || n == 3) {
            System.out.println(n);
        }
        while (n%2==0){
            System.out.print(2+" ");
            n/=2;
        }
        while (n % 3 == 0) {
            System.out.println(3+" ");
            n/=3;
        }
        for (int i = 5; i*i<n; i+=6){
            while (n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
            while (n%(i+2)==0){
                System.out.print(i+" ");
                n/=(i+2);
            }
        }
        if (n > 3) {
            System.out.println(n);
        }
    }

    public static void main(String arg[]){
        printPrimeFactor(50);
    }
}
