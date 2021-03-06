package DSABasic.recursion;

import java.util.Scanner;

public class towerOfHanoi {

    public static void TOH(int n, char a, char b, char c){
        if (n==1){
            System.out.println("Move 1 from "+a+" to "+c);
            return;
        }
        TOH(n-1,a,c,b);
        System.out.println("Move "+n+" from "+a+" to "+c);
        TOH(n-1,b,a,c);
    }

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        TOH(n,'A','B','C');

    }
}
