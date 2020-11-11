package DSABasic.recursion;

import java.util.Scanner;

public class nToOne {

    public static void printNToOne(int n){

        System.out.print(n+" ");

        if (n<=1){
            return;
        }

        printNToOne(n-1);
    }

    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        printNToOne(n);
    }
}
