package DSAAdvance.mathematics;
import java.util.*;

public class countDigits {
    static int countDigits(int x)
    {
        return (int)Math.floor(Math.log10(x) + 1);
    }
    public static void main(String arg[]){
        int x = 9235;
        System.out.println(countDigits(x));
    }
}
