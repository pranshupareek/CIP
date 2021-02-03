package DSAAdvance.recursion;

public class josephusProblems {
    static int jos(int n, int k){
        if (n==1){
            return 0;
        }

        return (jos(n-1,k)+k)%n;
    }

    public static void main(String arg[]){
        System.out.println(jos(6,3));
    }
}
