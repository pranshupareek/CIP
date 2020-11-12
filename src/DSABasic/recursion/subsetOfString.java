package DSABasic.recursion;

import java.util.Scanner;

public class subsetOfString {

    public static void printSubset(String str, String arr, int index){
        if (index == str.length())
            System.out.println(arr);
        else {
            printSubset(str, arr,index+1);
            printSubset(str, arr+str.charAt(index),index+1);
        }

    }

    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        String arr = s.nextLine();
        printSubset(arr," ", 0);
    }
}
