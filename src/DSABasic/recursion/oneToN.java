package DSABasic.recursion;

import java.util.Scanner;

public class oneToN {

    public static void printOneToN(int n){
        if (n<=0){
            return;
        }
        printOneToN(n-1);
        System.out.print(n+" ");
    }

    public static void printOneToNTail(int n){
        if (n<=0){
            return;
        }
        int i = 1;
        System.out.print(i+" ");
        printOneToNTail(n-1, i+1);
    }

    public static void printOneToNTail(int n, int i){
        if (n<=0){
            return;
        }
        System.out.print(i+" ");
        printOneToNTail(n-1, i+1);
    }

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        printOneToN(n);
        printOneToNTail(n);

    }
}
