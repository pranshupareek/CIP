package Libraries.strings;

import java.util.HashMap;

public class pangramChecking {
    static boolean checkPangram(String str){
        if (str.length()<26){
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < 26; i++){
            hm.put((char) ('a'+i), 0);
        }
        str = str.toLowerCase();
        for (int i = 0; i<str.length(); i++){
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i),0)+1);
        }
        for (int i = 0; i < 26; i++){
            if (hm.get((char)('a'+i)) == 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String arg[]){
        String str = "qwrtyEuiopxasdfghjklzxcdvbnm";
        if (checkPangram(str)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
