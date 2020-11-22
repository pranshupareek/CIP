package DSABasic.string;

import java.util.Scanner;

public class anagrams {
    public static boolean checkAnagram(String a, String b){
        if (a.length()!=b.length()){
            return false;
        }
        int count[] = new int[256];
        for (int i=0; i<a.length(); i++){
            count[a.charAt(i)]++;
        }
        for (int i=0; i<b.length(); i++)
            count[b.charAt(i)]--;
        for (int i = 0; i<256; i++){
            if (count[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        System.out.println(checkAnagram(a,b));
    }

}
