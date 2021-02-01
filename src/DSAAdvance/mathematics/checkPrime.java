package DSAAdvance.mathematics;

public class checkPrime {
    static boolean checkPrime(int x){
        if (x == 1) {
            return false;
        }
        if (x==2 || x==3){
            return true;
        }
        if (x%2==0||x%3==0){
            return false;
        }
        for (int i = 5; i*i<=x; i+=6){
            if (x % i == 0 || x % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]){
        System.out.println(checkPrime(17));
    }
}
