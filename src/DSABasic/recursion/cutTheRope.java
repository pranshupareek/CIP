package DSABasic.recursion;

import java.util.Scanner;

public class cutTheRope {

    public static int numberOfPiece(int n, int a, int b, int c){
        if (n<0)
            return -1;
        if (n==0){
            return 0;
        }
        int res = Math.max(numberOfPiece(n-a,a,b,c),Math.max(numberOfPiece(n-b,a,b,c),numberOfPiece(n-c,a,b,c)));
        if (res==-1)
            return -1;
        else
            return res+1;
    }



    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(numberOfPiece(n,a,b,c));
    }
}
