package DSAAdvance.bitmagic;

public class KthBit {
    static void checkKthBit(int n, int k){
        if ((n>>(k-1)&1)==1){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

    public static void main(String arg[]){
        checkKthBit(6,2);
    }
}
