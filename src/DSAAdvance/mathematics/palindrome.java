package DSAAdvance.mathematics;

public class palindrome {
    static boolean checkPalindrome(int x){
        int temp = x;
        int rev = 0;
        while (temp>0){
            rev = rev*10+temp%10;
            temp/=10;
        }
        return rev == x;
    }

    public static void main(String arg[]){
        int x = 1210121;
        System.out.println(checkPalindrome(x));
    }
}
