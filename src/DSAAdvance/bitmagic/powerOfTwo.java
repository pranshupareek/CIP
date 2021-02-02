package DSAAdvance.bitmagic;

public class powerOfTwo {
    static boolean checkPowerOfTwo(int n){
        int res = 0;
        while (n>0){
            n = n & (n-1);
            res++;
            if (res==2){
                return false;
            }
        }
        return true;
    }

    public static void main(String arg[]){
        System.out.println(checkPowerOfTwo(12));
    }
}
