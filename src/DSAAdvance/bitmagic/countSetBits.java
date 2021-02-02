package DSAAdvance.bitmagic;

public class countSetBits {
    static void printCount(int n){
        int res = 0;
        while (n>0){
            n = n & (n-1);
            res++;
        }
        System.out.println(res);
    }
    public static void main(String arg[]){
        printCount(13);
    }
}
