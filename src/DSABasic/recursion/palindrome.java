package DSABasic.recursion;

import java.util.Scanner;

public class palindrome {

    public static boolean checkPalindrome(String s, int start, int end){
        if (start>end){
            return true;
        }
        if (s.charAt(start)!=s.charAt(end)){
            return false;
        }
        else
            return checkPalindrome(s,start+1, end-1);
    }

    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        String arr = s.nextLine();
        boolean ans = checkPalindrome(arr, 0, arr.length()-1);
        System.out.println(ans);
    }
}
